package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() 
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String setApplicationURL()
	{
		String baseurl=pro.getProperty("baseurl");
		return baseurl;
	}
	public String setUsername()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	public String setPassword()
	{
		String pwd=pro.getProperty("passoword");
		return pwd;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getEdgepath()
	{
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
}
