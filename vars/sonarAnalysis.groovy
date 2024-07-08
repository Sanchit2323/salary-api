def call() {
    stage('Bug Analysis with SonarQube') {
        steps {
            script {
                withSonarQubeEnv('SonarQube') {
                    sh "${tool 'mvn'}/bin/mvn clean package -Dmaven.test.skip=true sonar:sonar"
                }
            }
        }
    }
}
