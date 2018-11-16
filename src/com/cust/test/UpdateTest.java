package com.cust.test;

import com.cust.Cust;
import com.cust.CustBiz;

public class UpdateTest {
	public static void main(String[] args) {
		CustBiz biz = new CustBiz();
		Cust cust = 
				new Cust("id01", "pwd01","tom",23);
		
		try {
			biz.modify(cust);
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fail");
		}
	}
}
