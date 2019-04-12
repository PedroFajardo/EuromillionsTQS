pipeline {
    agent any
 
    tools {
        jdk 'jdk8'   
        maven 'mvn'
    }
 
    stages {
        stage('Install') {
            steps {
                sh "mvn clean test"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
                }
            }
        }
    }
}
