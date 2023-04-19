//  
def call(String aws_account_id, String region, String ecr_repoName){
    // aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 785600726584.dkr.ecr.us-east-1.amazonaws.com 
    sh """
   
    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
    docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}