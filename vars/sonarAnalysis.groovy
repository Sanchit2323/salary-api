def call() {
    stage('Static Analysis with SonarQube') {
    withSonarQubeEnv('sonar') { // Replace 'SonarQubeServer' with your actual SonarQube server name
        sh 'mvn sonar:sonar'
    }
  }
}    
