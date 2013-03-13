package com.jav.Canada.fixture;
import com.jav.Canada.fixture.*;

import org.junit.Assert;

public class EOLCanadaEnrollNow_nocourse_Fixture extends EOLCanadaReceiveInfo_Fixture {
		
	static int CourseCount;
	
	

	public void verifyHomepage()
	{
		CanEnrollNowNoCourse.navigateToCanadaURLEnrollNowNoCourse();
				
	}
	
	public int getCourseCount()
	{
		CourseCount = CanEnrollNowNoCourse.getCourseCountFromICSCanadaEnrollNowPage();
		return CourseCount;
	}

	public void selectCourse(String Course)
	{
		CanEnrollNowNoCourse.selectCourseFromCanadaEnrollNowNoCoursePage(Course);
	}
	
	public void verifyElementsDisplayOnStep1()
	{
		CanEnrollNowNoCourse.varifyPageElementsForStep1();
	}
	
	public void enterStudentInformationInStep1Form(String preFix, String Fname, String Lname, 
			String Mail, String EmailExt, String Phone, String Address, String City, String State, String Zip)
	{
		CanEnrollNowNoCourse.fillFormStep1ForCanada(preFix, Fname, Lname, Mail, EmailExt, Phone, Address, City, State, Zip);
		
	}
	
	public void verifyRedirectToThnakyouPageandClickonEnrollOnlineLink()
	{
		CanEnrollNowNoCourse.verifyThnakYouPageAfterStep1FormPage();
	}
	
	public void verifyElementsPersentOnPersonalInformationPage()
	{
		CanEnrollNowNoCourse.verifyPersonalInformationPage();
	}
	
	public void enterInformationOnPersonalInformationPage(String DOBmonth, String DOBday, String DOByear)
	{
		CanEnrollNowNoCourse.enterExtraInformationOnPersonalInformationPage(DOBmonth, DOBday, DOByear);
	}
	
	public void enterInformationAfterEditOnPersonalInformationPage(String preFix, String Fname, String Lname, 
			String Mail, String EmailExt, String Phone, String Address, String City, String State, String Zip, String DOBmonth, String DOBday, String DOByear)
	{
		CanEnrollNowNoCourse.enterExtraInformationAfterEditOnPersonalInformationPage(preFix, Fname, Lname, Mail, EmailExt, Phone, Address, City, State, Zip, DOBmonth, DOBday, DOByear);
	}

	public void redirectToPaymentInformationPage()
	{
		CanEnrollNowNoCourse.verificationPaymentInformationPage();
	}

	public void verifyElemetsDisplayOnPaymentInformationPage()
	{
		CanEnrollNowNoCourse.verifyElemetsOnPaymentInformationPage();
	}
	
	public void selectPaymentModeAndEnterCardInformation()
	{
                System.out.println("boolean is " +ICSCanada.selectfullpaymentmodeOnPaymentInformationPage());
		Assert.assertTrue(ICSCanada.selectfullpaymentmodeOnPaymentInformationPage());
	}

	public void verifyElementDisplayAfterCreditCardSelection()
	{
		CanEnrollNowNoCourse.verifyElementOnCreditCardSectionOnPaymentInformationPage();
	}

	public void enterCreditCardInformationAfterCreditCardSelection(String CreditCardNumber, String CVV)
	{
		CanEnrollNowNoCourse.enterCreditCardInformationSectionOnPaymentInformationPage(CreditCardNumber, CVV);
	}
	
	public void verifyInformationFieldDisplayOnReviewandSubmitPage()
	{
		CanEnrollNowNoCourse.verifyElementsOnReviewAndSubmitPage();
	}
	
	public void clickPersonalInfoEditButtonOnReviewAndSubmit()
    {
		CanEnrollNowNoCourse.clickPersonalInfoEditButtonOnReviewAndSubmit();
    }
    
    public void clickProgramInfoEditButtonOnReviewAndSubmit()
    {
    	CanEnrollNowNoCourse.clickProgramInfoEditButtonOnReviewAndSubmit();
    }
    
    public void clickPaymentInfoEditButtonOnReviewAndSubmit()
    {
    	CanEnrollNowNoCourse.clickPaymentInfoEditButtonOnReviewAndSubmit();
    }

	public void clickonTermAndConditionsonReviewandSubmitPage()
	{
		CanEnrollNowNoCourse.acceptTermandConditionOnReviewAndSubmitPage();
//		PanFoster.redirectTOElectronicSignaturePage();
	}

}
