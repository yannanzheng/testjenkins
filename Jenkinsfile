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
                    }
                }
        stage('Deploy') {
               steps {
                        echo 'Deploying....'
               }
        }
    }
}