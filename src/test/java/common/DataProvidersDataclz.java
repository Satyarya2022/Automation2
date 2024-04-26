package common;

import org.testng.annotations.DataProvider;

public class DataProvidersDataclz {
	
	@DataProvider
	public Object[][] testdata1() {
		
		Object [][] datavalues= new Object[2][2];
		datavalues[0][0] = "practice";
		datavalues[0][1]="SuperSecretPassword!";
		datavalues[1][0] = "practice";
		datavalues[1][1] = "practice";
		return datavalues;
	}

}
