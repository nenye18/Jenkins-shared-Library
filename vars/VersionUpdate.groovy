#!/user/bin/env groovy

def call(){
    dir("app") {
        sh "npm version patch"  //update the package.json version
        def Version = readJSON(file: 'package.json').version
        env.IMAGE_NAME ="$Version-$BUILD_NUMBER"                                    
    }
}
