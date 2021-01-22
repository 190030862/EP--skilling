package com.klu.insert;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;
import java.sql.ResultSet;
public class StudentInsertion {
       public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException
       {
    	   
    	   Connection con = DBUtil.DBConnection();
    	   
    	   PreparedStatement psl = con.prepareStatement("Insert into StudentBean value(?,?,?)");
    	   psl.setInt(1, student.getReg_no());
    	   psl.setString(2,  student.getName());
    	   psl.setString(2,  student.getEmail());
    	   
    	   int i=psl.executeUpdate();
    	   System.out.println(i+"records inserted");
    	   return i;
       }
       public void  StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException 
       {
    	   
    	   Connection con = DBUtil.DBConnection();
    	   PreparedStatement ps2 = con.prepareStatement("Delete from StudentBean where regno = ?");
    	   ps2.setInt(1, 1900);
    	   System.out.println("Record is deleted");
       }
       public void  StudentDisplay(StudentBean student) throws ClassNotFoundException, SQLException 
       {
    	   
    	   Connection con = DBUtil.DBConnection();
    	   PreparedStatement ps2 = con.prepareStatement("Select *  from StudentBean");
    	   
    	   ResultSet rs = ps2.executeQuery();
    	   while(rs.next())
    	   {
    		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    	   }
       }
    	   
}
