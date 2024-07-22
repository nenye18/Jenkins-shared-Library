def call(){
    echo 'building the docker image...'
    withCredentials([usernamePassword(credentialsId: 'docker hub repository',passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'docker build -t cnwagba/jenkins-repo-dockerhub:$IMAGE_NAME .'  //Build Docker Image
        sh 'echo $PASS | docker login -u $USER --password-stdin'       // Authentication
        sh 'docker push cnwagba/jenkins-repo-dockerhub:$IMAGE_NAME'       //Push to Docker repository
    }
}
