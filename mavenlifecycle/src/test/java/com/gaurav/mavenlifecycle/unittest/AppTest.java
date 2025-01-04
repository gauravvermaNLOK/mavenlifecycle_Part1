package com.gaurav.mavenlifecycle.unittest;
import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * Unit tests.
 */
public class AppTest
{
   @Test
   public void checkBricks()
   {
	   String str = "checking bricks...";
	   System.out.println(str);
	   Reporter.log("bricks checked...");
   }
   
   @Test
   public void checkWire()
   {
	   String str = "checking wire...";
	   System.out.println(str);
	   Reporter.log("wire checked...");
   }
   
   @Test
   public void checkPipeline()
   {
	   String str = "checking pipeline...";
	   System.out.println(str);
	   Reporter.log("pipeline checked...");
   }
}