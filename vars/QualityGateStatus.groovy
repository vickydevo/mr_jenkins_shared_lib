

def call(credentialsId){

waitForQualityGate abortPipeline: false, credentialsId: credentialsId
// waitForQualityGate abortPipeline: false, credentialsId: 'sonar-api-2'
}


