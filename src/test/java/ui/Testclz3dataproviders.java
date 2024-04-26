package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testclz3dataproviders {
	
	
	@Test(dataProvider ="testdata2")
	public void testmethod(String s1, String s2) {
		System.out.println(s1 + "  " +s2);
		
	}

	
		//1st way of declaring dataproviders
		
		@DataProvider
		public Object[][] testdata1() {
			
			Object[] [] dataset1 = new Object[2][2];
			
			dataset1[0][0]="We";
			dataset1[0][1]="QA";
			dataset1[1][0]="Team";
			dataset1[1][1]="Rocks";
			return dataset1;
			
		}	
		
	//2nd way of declaring dataproviders
		@DataProvider
		public Object[][] testdata2() {
				
			return new	Object[][]   {
						{"QAs","are"},
						{"gate","keepers"}
				};
			}
		


}
