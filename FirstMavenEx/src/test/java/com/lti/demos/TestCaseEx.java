package com.lti.demos;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCaseEx {

	 @Test
	    public void testcase1(){
	        Assertions.assertEquals("HELLO","HELLO");
	    
	 Calculator c =new Calculator();
     int r =c.add(300, 200);
     Assertions.assertEquals(500,r);
}
}
