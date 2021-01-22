package com.klu.main;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class Studentmain {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		
		StudentBean sb=new StudentBean();
		sb.setReg_no(101);
		sb.setName("kk");
		StudentInsertion si = new StudentInsertion();
		int i=si.StudentInsert(sb);
		if(i>0)
		{
			System.out.println("insertion is successfull");
		}
		else
		{
			System.out.println("fail");
		}

	}

}