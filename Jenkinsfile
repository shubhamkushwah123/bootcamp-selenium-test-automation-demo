node{
    stage('script checkout'){
    git 'https://github.com/shubhamkushwah123/bootcamp-selenium-test-automation-demo.git'
        
    }
    stage('script build - generate runnable jar'){
       
       sh 'mvn clean package assembly:single' 
        
    }
    stage('run test script'){
        
       sh 'java -jar target/test-automation-0.0.1-SNAPSHOT-jar-with-dependencies.jar'
        
    }
    
}
