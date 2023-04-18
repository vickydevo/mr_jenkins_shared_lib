 call(String project, String ImageTags, String hubUser){

//    withCredentials([usernamePassword(credentialsId: 'vignan91-dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//     // some block
// }   

    withCredentials([usernamePassword(
    credentialsId: 'vignan91-dockerhub', 
    usernameVariable: 'USER',
    passwordVariable: 'PASS'
    )]) {
    
    sh "docker login -u '$USER' -p '$PASS'"
    }
   sh  "docker image push  ${hubUser}/${project}:${ImageTag}"
   sh  "docker image push  ${hubUser}/${project}:latest"
    

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
//      docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
}