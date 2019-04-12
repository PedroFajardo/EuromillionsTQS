pipeline {
    agent any
 
    tools {
        jdk 'jdk8'   
        maven 'maven'
    }
 
    stages {
        stage('Install') {
            steps {
				echo 'ola1'
                bat 'mvn clean test'
				echo 'ola2'
			}
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
                }
            }
        }
    }
}
