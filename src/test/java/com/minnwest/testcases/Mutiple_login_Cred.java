package com.minnwest.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.minnwest.pages.LoginPage;
import com.minnwest.pages.transferLoginpage;
import com.minnwest.utilities.TestUtil;

public class Mutiple_login_Cred extends transferLoginpage{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void Transfer_login(Hashtable<String,String> data) throws InterruptedException {

		if(!(TestUtil.isTestRunnable("Minnwest_Login", excel))){
			throw new SkipException("Skipping the test "+"Minnwest_Login".toUpperCase()+ "as the Run mode is NO");
		}
		Thread.sleep(9000);
		setusername("username_XPATH",data.get("username"));
		Thread.sleep(2000);
		setpassword("password_XPATH",data.get("password"));
		Thread.sleep(4000);
		clicklogin("login_button_XPATH");
		Thread.sleep(3000);
		
		ClickCheckingAccounts("CheckingAccounts_XPATH");
		Thread.sleep(2000);
		 ClickCheckingTransfer("CheckingTransfer_XPATH");
		 Thread.sleep(3000);
		 ClickTransferTo("Transferto_XPATH");
		 Thread.sleep(4000);
		 clickmysavingsaccount("mysavingsaccount_XPATH");
		 Thread.sleep(3000);
		 enterAmount("enterAmount_XPATH","1.00");
		 Thread.sleep(4000);
		 clickfrequency("frequency_XPATH");
		 Thread.sleep(3000);
		 clicksendon("sendon_XPATH");
		 Thread.sleep(3000);
		 clickcontinue("continue_XPATH");
		 Thread.sleep(3000);
		 clickconform("conform_XPATH");
		 Thread.sleep(2000);
		 clickReferencenumber("Referencenumber_XPATH");
		 Thread.sleep(3000);
		 clicksinout("sinout_XPATH");
		 Thread.sleep(3000);
		 clickYES("YES_XPATH");
		 Thread.sleep(3000);
		 clicktackservey("tackservey_XPATH");
		 Thread.sleep(3000);
		 clickrate("rate_XPATH");
		 Thread.sleep(3000);
		 clicksubmit("submit_XPATH");
		 Thread.sleep(3000);
		 clickservey("servey_XPATH");
		 Thread.sleep(3000);
		 clickYes("Yes_XPATH");
		 Thread.sleep(3000);
		 clickTRANSFER("TRANSFER_XPATH");
		 Thread.sleep(3000);
		 clickSUBMIT("SUBMIT_XPATH");
		 Thread.sleep(3000);
		 clickDONE("DONE_XPATH");
		 Thread.sleep(3000);
		 
		 
			
}
}
