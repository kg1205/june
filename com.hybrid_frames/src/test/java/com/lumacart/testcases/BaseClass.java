package com.lumacart.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.lumacart.utilities.Readconfig;

public class BaseClass {
	public static WebDriver driver;
	Readconfig read = new Readconfig();
	public String baseurl = read.geturl();
	public String usename = read.getusername();
	public String pass = read.getpass();

	public static Logger logg;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logg = Logger.getLogger("luma");
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getchrome());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", read.getgecko());
			driver = new FirefoxDriver();

		}
	}
}
