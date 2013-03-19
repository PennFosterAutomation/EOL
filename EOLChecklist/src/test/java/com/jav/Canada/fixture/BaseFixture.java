package com.jav.Canada.fixture;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import com.jav.Canada.pageobjects.EOLCanadaReceiveInfo_UI;
import com.jav.Canada.pageobjects.EOLCanadaReceiveInfo_nocourse_UI;
import com.jav.Canada.pageobjects.EOLCanadaEnrollNow_UI;
import com.jav.Canada.pageobjects.EOLCanadaEnrollNow_nocourse_UI;
import com.jav.Canada.util.Utilities;

public class BaseFixture {
	
	public WebDriver driver;
	public DesiredCapabilities capabilities;
	
	EOLCanadaReceiveInfo_nocourse_UI ICSCanada;
	EOLCanadaReceiveInfo_UI CanReciveInfo;
	EOLCanadaEnrollNow_UI CanEnrollNow;
	EOLCanadaEnrollNow_nocourse_UI CanEnrollNowNoCourse;
	
	public void startBrowserSession()
	{
		capabilities = new DesiredCapabilities();
	    capabilities.setJavascriptEnabled(true);
	    if (getYamlVal("browser").equalsIgnoreCase("firefox")) {
		capabilities.setBrowserName("firefox");
		driver = new FirefoxDriver();
		}else if (getYamlVal("browser").equalsIgnoreCase("iexplore")){
		capabilities.setBrowserName("iexplore");
		driver = new InternetExplorerDriver();
		} else if (getYamlVal("browser").equalsIgnoreCase("chrome")){
			capabilities.setBrowserName("chrome");
			System.setProperty("webdriver.chrome.driver",
	                "chromedriver.exe");
			driver = new ChromeDriver();
		}
		int ajax_timeout = Integer.parseInt(getYamlVal("ajax_timeout"));
        driver.manage().timeouts().implicitlyWait(ajax_timeout, TimeUnit.SECONDS);
        initPageObjects();
	}
	
	public void initPageObjects() {
		
		ICSCanada = new EOLCanadaReceiveInfo_nocourse_UI(driver);
		CanReciveInfo = new EOLCanadaReceiveInfo_UI(driver);
		CanEnrollNow = new EOLCanadaEnrollNow_UI(driver);
		CanEnrollNowNoCourse = new EOLCanadaEnrollNow_nocourse_UI(driver);
	}
	
	public void launchUrl(String url)
	{
		driver.get(url);	
	}
	
	public void stopBrowserSession() {
        driver.quit();
	}
	
	public void setUpDataFile(String dataFilePath) {
        Utilities.setYamlFilePath(dataFilePath);
    }
	
	public String getYamlVal(String yamlMapObj) {
        return Utilities.getYamlValue(yamlMapObj);
    }
}