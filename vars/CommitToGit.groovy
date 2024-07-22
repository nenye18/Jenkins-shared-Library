#!/user/bin/env groovy
def call(){
    echo 'commit new version to git'
    withCredentials([usernamePassword(credentialsId: 'GitHub credentials',passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'git config --global user.email "chinenye.nw@gmail.com" '
        sh 'git config --global user.name "nenye18" '
        sh 'git remote set-url origin https://$USER:$PASS@github.com/nenye18/Jenkins-project.git'
        sh 'git add .'
        sh 'git commit -m "commiting version update from jenkins CI/CD" '
        sh 'git push origin HEAD:main'
    }
  }
