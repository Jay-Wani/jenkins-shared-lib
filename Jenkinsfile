@Library('jenkins-shared-lib')_

stage('Print Build Info') {
    printBuildinfo {
        name = "Jenkins Shared Library ! "
    }
} stage('Disable balancer') {
    disableBalancerUtils()
} stage('Deploy') {
    deploy()
} stage('Enable balancer') {
    enableBalancerUtils()
} stage('Check Status') {
    checkStatus()
}
