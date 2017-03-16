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
                        sh './gradlew test'
                    }
                }
        stage('Deploy') {
               steps {
                        echo 'Deploying....'

               }
        }
    }
}