package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Toreadfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Using FileInputstream clz to read 
		Properties properties = new Properties();// object for Properties clz
		//String filepath = "file1.properties"
				FileInputStream inputstream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testpack1\\file1.properties");
				properties.load(inputstream);// METHOD TO READ DATA
				System.out.println(properties.getProperty("Url"));
				//System.out.println(System.getProperty("user.dir"));
				
		
		//Using FileReader java clz to read 
		/*FileReader fr = new FileReader("C:\\Users\\janap\\eclipse-workspace\\AutomationTest2\\src\\test\\resources\\testpack1\\file1.properties" );
		properties.load(fr);
		System.out.println(properties.getProperty("Url"));*/

				
				
				
	
							
		

	}

	}


