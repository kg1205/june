package com.lumacart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {
		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
	}

	public String geturl() {
		String url = pro.getProperty("baseurl");
		return url;
	}

	public String getusername() {
		String username = pro.getProperty("usename");
		return username;
	}

	public String getpass() {
		String password = pro.getProperty("pass");
		return password;
	}

	public String getchrome() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getgecko() {
		String geckopath = pro.getProperty("firefoxpath");
		return geckopath;

	}
}
