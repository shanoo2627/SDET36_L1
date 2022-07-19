package practiceMaven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	
	public void SignIn() {
		Reporter.log("Signin");
		Reporter.log("HomePage");
		Reporter.log("AddToCart");
			
	}
	@Test
	public void SignOut() {
		Reporter.log("SignOut");
		Reporter.log("Signin");
		Reporter.log("HomePage");
		Reporter.log("AddToCart");
		
		
		
	}
}

