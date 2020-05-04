package com.tests.MavenProject1;

import org.testng.annotations.Test;

//how to execute testcases 

public class AppiumTest {

	@Test
	public void OpenBrowser(){
		System.out.println("Opening Browser");
	}
	
	@Test
	public void CloseBrowser(){
		System.out.println("Closing Browser");
	}
	
	
}
