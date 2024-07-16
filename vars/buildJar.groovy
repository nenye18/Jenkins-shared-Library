#!/user/bin/env groovy

def call(){
    echo 'building the applicatiom'
    sh 'mvn package'
}