package com.simplilearn.ReviewAnalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewAnalyzerApplication {
    public static double getWordCount(String review){
        int count = 0;

        String string[] = review.toLowerCase().split("([,.\\s]+)");
        for(String s : string){  
   	 	        count++;
        }  
   	    return count;
    }
    public static void main(String[] args) {
   	 SpringApplication.run(ReviewAnalyzerApplication.class, args);
    }
}

