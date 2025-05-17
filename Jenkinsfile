pipeline {
    agent any

    environment {
        DEPLOY_HOST = "44.204.77.207"
        DEPLOY_USER = "ec2-user"
        TARGET_PATH = "/home/ec2-user"
        ARTIFACT = "target/vedika-airline-management-0.0.1-SNAPSHOT.jar"
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out code from public GitHub repo..."
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/VedikaJ28/vedika-airline-management.git'
                    ]]
                )
            }
        }

        stage('Build') {
            steps {
                echo "Building the project with Maven..."
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                bat 'mvn test'
            }
        }

        stage('Deploy Artifacts') {
            when {
                expression { fileExists(env.ARTIFACT) }
            }
            steps {
                echo "Deploying artifact to EC2 instance..."
                withCredentials([sshUserPrivateKey(credentialsId: 'jenkins-aws', keyFileVariable: 'KEYFILE')]) {
                    bat """
                            icacls "%KEYFILE%" /inheritance:r
                            icacls "%KEYFILE%" /grant:r "%USERNAME%:R"
                            icacls "%KEYFILE%" /remove "BUILTIN\\Users"
                            scp -i "%KEYFILE%" ^
                                -o StrictHostKeyChecking=no ^
                                -o UserKnownHostsFile=/dev/null ^
                                "%ARTIFACT%" "%DEPLOY_USER%@%DEPLOY_HOST%:%TARGET_PATH%"
                        """
                }
            }
        }
    }

    post {
        success {
            echo "Deployment successful!"
        }
        failure {
            echo "Pipeline failed. Check logs for details."
        }
    }
}
