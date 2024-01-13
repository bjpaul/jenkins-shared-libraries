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
            def fileContent = libraryResource('factorial.py')
            writeFile file: 'main.py', text: fileContent
            sh 'python main.py'
          }
        }
      }
    }
  }
}
