pipeline {
    agent any

    environment {
      MAVEN_IMAGE = 'maven:3.5-jdk-8'
    }
    stages {

         stage('Test') {
            steps {
               script {
                  docker.image(MAVEN_IMAGE).inside('-v /var/lib/jenkins/.m2:/root/.m2') {
                      sh 'mvn test'
                   }
               }

            }

         }

         stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
          }

    }
}
