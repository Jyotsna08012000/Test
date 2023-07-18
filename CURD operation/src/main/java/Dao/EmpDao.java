package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import Connection.DBconnection;
import Model.Employee;

public class EmpDao {
	public static void insertEmp(Employee emp) {
		try {
			Connection con = DBconnection.getConnection();
			String sqlString= "insert into data(name,contact,email,password,address,gender) value(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sqlString);
			pst.setString(1, emp.getName());
			pst.setLong(2, emp.getContact());
			pst.setString(3, emp.getEmail());
			pst.setString(4, emp.getPassword());
			pst.setString(5, emp.getAddress());
			pst.setString(6, emp.getGender());
			pst.executeUpdate();
			System.out.println("data inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
						
		}
	}
}
	

