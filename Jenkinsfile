pipeline {
    agent any
    tools{
        maven 'local maven'
    }

    stages{
        stage('Build'){
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo '開始儲存...'
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }

        stage('deploy-to-staging'){
            steps{
                build job:'deploy-to-staging'
            }
            post {
                success {
                echo 'deploy-to staging success'
                }
                failure{
                   echo 'deploy-to staging fail'
                }
            }
        }
    }
}