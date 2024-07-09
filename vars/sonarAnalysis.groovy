def call() {
    stage('Static Analysis with SonarQube') {
        steps {
            script {
                withSonarQubeEnv('sonar') {
                    sh "${tool 'mvn'}/bin/mvn clean package -Dmaven.test.skip=true sonar:sonar"
                }
            }
        }
    }
}
    
