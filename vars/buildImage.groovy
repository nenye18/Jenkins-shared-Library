def call(){
    echo 'building the docker image..'
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo',passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'docker build -t cnwagba/jenkins-repo-dockerhub:node-2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh  'docker push cnwagba/jenkins-repo-dockerhub:node-2.0'

}