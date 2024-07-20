#!/user/bin/env groovy

def call(){
    dir("app") {
    sh "npm install"
    sh "npm run test"                
    }
}
