package com.simplilearn.ReviewAnalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewAnalyzerApplicationTests {

    private ReviewAnalyzerApplication analyzer = new ReviewAnalyzerApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyzer.getWordCount("Train to win in the digital economy"));	 
    }
}
