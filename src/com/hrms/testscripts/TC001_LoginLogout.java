package com.hrms.testscripts;

import org.testng.annotations.Test;
import com.hrms.lib.General;
public class TC001_LoginLogout  {
	@Test
	public  void loglogout()
	{
	
	
		General obj=new General();
		obj.startup();
		obj.login();
		obj.logout();
		obj.teardown();
		
		
		
		
		
		
		
	}

}
