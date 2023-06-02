package ngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWith3Arguments {
	@Test(dataProvider = "bookTicketDataProvider" )
	public void bookTicketTest(String src, String dest, int tickets) {
		System.out.println("execute source => " +src + ", Destiantions =>" +dest);
	}
	@DataProvider
	public Object[][] bookTicketDataProvider() {
		Object[][] objArr = new Object[5][3];

		objArr[0][0] = "Bangalore";
		objArr[0][1] = "Goa";
		objArr[0][2] = 10;

		objArr[1][0] = "Bangalore";
		objArr[1][1] = "Mysore";
		objArr[1][2] = 6;

		objArr[2][0] = "Bangalore";
		objArr[2][1] = "Mangalore";
		objArr[2][2] = 7;

		objArr[3][0] = "Bangalore";
		objArr[3][1] = "Hyderabad";
		objArr[3][2] = 8;

		objArr[4][0] = "Bangalore";
		objArr[4][1] = "Mumbai";
		objArr[4][2] = 9;
		return objArr;

	}
}
