package org.demo;


import org.base.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelperClass{
	
	@After
	public void aft(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] bs = t.getScreenshotAs(OutputType.BYTES);
			s.embed(bs, "image/png");
			
		}

	}
	
//	@Before(order=1)
//	public void bf() {
//    	dtAndTime();
//	}
//	@Before(order=3)
//	public void bf1() {
//    	System.out.println("Browser open");
//	}
//	
//	@After(order=1)
//	public void af() {
//		dtAndTime();
//	}
//	@After(order=6)
//	public void af1() {
//		System.out.println("Browser close");
//	}

}
