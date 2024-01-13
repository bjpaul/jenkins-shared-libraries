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
          sh 'python "$WORKSPACE/jenkins-ci/resources/factorial.py"'
        }
      }
    }
  }
}
