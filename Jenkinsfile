pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'haha, I am ok!'
                sh './gradlew build'
            }
        }

        stage('Test') {
                    steps {
                        echo 'Testing..'
                        sh 'make check || true'
                        junit '**/target/*.xml'
                    }
                }
        stage('Deploy') {
               steps {
                        echo 'Deploying....'
               }
        }
    }
}