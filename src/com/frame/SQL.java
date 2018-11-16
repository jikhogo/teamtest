package com.frame;

public class SQL {
   public static String CUST_INSERT =
		   "INSERT INTO TB_CUST VALUES(?,?,?,?)";
   
   
   public static String CUST_UPDATE=
		   "UPDATE TB_CUST SET PWD=?,NAME=?,AGE=? WHERE ID=?";
   
   public static String CUST_DELETE=
		   "DELETE FROM TB_CUST WHERE ID=?";
   
   public static String CUST_SELECT=
		   "SELECT * FROM TB_CUST WHERE ID=?";
   
   public static String CUST_SELECTALL=
		   "SELECT * FROM TB_CUST";
}
