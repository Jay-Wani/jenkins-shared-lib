#!/usr/bin/env groovy

def call(body) {
    echo "Check status"

    (1..8).each {
        echo "Number: " + it
    }

    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
