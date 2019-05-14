package com.example.solartest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.example.solartest.base.BaseInterface;

public class NSDataProvider {
	
	@DataProvider(name = "login")
	public static Object[][] getTxtData1() throws IOException {
		TxtDataProvider t = new TxtDataProvider();
		return t.getTxtUser(BaseInterface.txt_path1);
	}


	@DataProvider(name = "addcustomer")
	public Object[][] getExcelData1() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel((BaseInterface.excel_path1),
				BaseInterface.sheet_name);
	}

	
	@DataProvider(name = "mysql")
	public Object[][] getMysqlDada() throws IOException {
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + "FROM `mm_movie` ");
	}
	
	

}
