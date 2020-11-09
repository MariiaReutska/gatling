pipeline {
    agent any

     parameters {
            choice(choices: ['GetLimsAuthTokenSimulation'], description: 'Select Simulation class', name: 'simulation')
            choice(choices: ['10','100','250'], description: 'Number of users', name: 'users')
             choice(choices: ['1','2','3'], description: 'Rampup', name: 'rampup')
             choice(choices: ['10','20','30'], description: 'Throughput', name: 'throughput')
            }
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test -Dsimulation=${simulation} -Dusers=${users} -Drampup=${rampup}
                -Dthroughput=${throughput}'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}