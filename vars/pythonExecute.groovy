def call(Map param){
  pipeline{
    environment {
      HOME = "${env.WORKSPACE}"
    }
    agent{
      docker{
        image 'Python3.6'
      }
    }
    stages{
      stage("Init"){
        steps{
          sh "echo 'Hello World'"
        }
      }
    }
  }
}
