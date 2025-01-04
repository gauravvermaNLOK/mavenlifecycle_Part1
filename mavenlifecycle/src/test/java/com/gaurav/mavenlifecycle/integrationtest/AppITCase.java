package com.gaurav.mavenlifecycle.integrationtest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * Integration Tests
 */
public class AppITCase {
	@Test
	public void checkWireAndFuseIntegration()
	{
		String str = "checking Wire and fuse integration...";
		System.out.println(str);
		Reporter.log("Wire and fuse working together.");
	}

	@Test
	public void checkPipelineAndWaterSupply()
	{
		String str = "checking pipeline and water supply integration...";
		System.out.println(str);
		Reporter.log("Water is flowing through pipeline in expected manner.");
	}
	
	@Test
	public void checkDoorsAndWalls()
	{
		String str = "checking Doors and walls integration...";
		System.out.println(str);
		Reporter.log("Doors are not properly aligned with walls.");
		Assert.assertEquals(false, true);
	}
}
