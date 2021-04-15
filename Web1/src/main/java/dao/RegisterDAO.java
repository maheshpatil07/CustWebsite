package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import utility.DBConn;

public class RegisterDAO 
{
	Connection conn;
	public RegisterDAO() throws Exception
	{
		conn = DBConn.getMySQLConnection();
	}
	
	public boolean registerCustomer(Customer customer)throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
		
		ps.setString(1, customer.getUsername());
		ps.setString(2, customer.getPassword());
		ps.setString(3, customer.getCustomerName());
		ps.setString(4, customer.getGender());
		ps.setString(5, customer.getEmailId());
		ps.setString(6,customer.getMobileNo());
		ps.setString(7, customer.getAddress());
	
		int row_eff=ps.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
	public Customer checkCredential(Customer customer)throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("select * from Customer where username=? and password1=?");
		
		ps.setString(1, customer.getUsername());
		ps.setString(2, customer.getPassword());
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			customer.setCustomerName(rs.getString(3));
		}
		else
		{
			customer=null;
		}
		
		return customer;
	}
}
