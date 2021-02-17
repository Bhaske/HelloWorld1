pipeline {
  agent any
  stages {
    stage('Devoloper') {
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
        echo 'Deploy proj'
      }
    }
    stage('Maintain') {
      steps {
        echo 'Maintain code'
      }
    }
stage('Maintai2') {
      steps {
        echo 'Maintain2 code'
      }
    }
  }
 
