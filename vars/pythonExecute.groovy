def call(Map param){
  pipeline{
    environment {
      HOME = "${env.WORKSPACE}"
    }
    agent{
      docker{
        image 'python:3.6'
      }
    }
    stages{
      stage("Init"){
        steps{
          def pythonScriptPath = libraryResource 'factorial.py'
          sh 'python "$pythonScriptPath"'
        }
      }
    }
  }
}
