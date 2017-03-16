pipeline {
    agent any

    environment{
        testVar = "testVar"

    }

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
                        echo "${testVar}hahahahah"
                        echo 'Deploying....'
                        sh './gradlew tasks'

               }
        }
    }
}