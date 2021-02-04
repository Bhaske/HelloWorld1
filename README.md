pipeline {
  agent any
  stages {
    stage('Dev') {
      steps {
        echo 'Devoloping code'
      }
      }
      stage('Test') {
      steps {
        echo 'Testing Code'
      }
      }
      stage('Deploy') {
      steps {
        echo 'Deploying code'
      }
      }
    }
 
