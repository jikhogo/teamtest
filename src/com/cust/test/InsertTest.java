package com.cust.test;

import com.cust.Cust;
import com.cust.CustBiz;

public class InsertTest {

	public static void main(String[] args) {
		CustBiz biz = new CustBiz();
		Cust cust =
				new Cust("id03","pw03","jams3",11);
		try {
			biz.register(cust);
			System.out.println("ok");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
