def call() {
    stage('Static Analysis with SonarQube') {
           sh 'mvn sonar:sonar'
   }
}
    
