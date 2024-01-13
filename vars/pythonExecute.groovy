def call(Map param){
  pipeline{
    environment {
      HOME = "${env.WORKSPACE}"
    }
    parameters{
      string(name: 'number', defaultValue: '5', description: 'Enter the number to calculate the factorial')
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
            sh 'cat main.py'
            echo 'python main.py "${params.number}"'
            sh 'python main.py "${params.number}"'
          }
        }
      }
    }
  }
}
