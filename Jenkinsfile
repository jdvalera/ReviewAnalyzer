pipeline {	 
    agent any	 
   	 stages {     	 
   	 stage("Compile") {          	 
   			 steps {               	 
   				 sh "mvn compile"          	 
   			 }     	 
   		 }     	 
   	 stage("Unit test") {          	 
   		 steps {               	 
   				 sh "mvn test"          	 
   			 }     	 
   		 }	 
   	 }

     post {
   	 always {
   	    step([$class: 'JacocoPublisher',
        execPattern:'**/**.exec',
        classPattern: '**/classes',
        sourcePattern: '**/src/main/java'])
        }   
    }
}
