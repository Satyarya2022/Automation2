package ui;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Towritefile {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();// object for Properties clz
		
		// Using FileOutputstream to write into properties file
				 FileOutputStream outputstream = new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testpack1\\file1.properties",true);
				 properties.setProperty("employeecity", "hyd");
				 properties.store(outputstream, "This is a new data added via fileinputstream");// METHOD TO STORE DATA
				 System.out.println("Writing into the file is successful via FileInpusStream"); 
				
				//Using FileWriter java clz to write  
				/*FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\testpack1\\file3.properties", true);
				properties.setProperty("Employeecity","Bangalore");
				properties.store(fw,"New data added via FileWriter");
				System.out.println("Writing into the file is successful via Filewriter");*/

								

	}

}
