def call() {
    stage('Test') {
        steps {
            echo "Executing Java Unit Testing"
            catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                sh 'mvn test'
            }
        }
    }
}
