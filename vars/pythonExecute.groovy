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
          script{
            def pythonScriptPath = libraryResource 'factorial.py'
            sh 'echo "${pythonScriptPath}"'
            sh 'python "${pythonScriptPath}"'
          }
        }
      }
    }
  }
}
