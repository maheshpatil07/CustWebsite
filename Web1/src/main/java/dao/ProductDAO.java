package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;
import utility.DBConn;

public class ProductDAO 
{
	Connection conn;
	
	public ProductDAO() throws Exception
	{
		conn = DBConn.getMySQLConnection();
	}
	
	public boolean registerProduct(Product product)throws SQLException
	{
		PreparedStatement cwm = conn.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");

		cwm.setInt(1,product.getProductId());
		cwm.setString(2,product.getProductName());
		cwm.setString(3, product.getProductDesc());
		cwm.setInt(4,product.getPrice());
		cwm.setInt(5,product.getStock());
		cwm.setString(6,product.getCategory());
		cwm.setString(7,product.getSupplier());
	
	
		int row_eff=cwm.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
	public Product checkCredential(Product product)throws SQLException
	{
		PreparedStatement pm = conn.prepareStatement("select * from Product where productId=? and productName=?");
		
		
		pm.setInt(1,product.getProductId());
		pm.setString(2, product.getProductName());
		//ps.setString(2, customer.getPassword());
		
		ResultSet rs=pm.executeQuery();
		
		if(rs.next())
		{
			product.setProductDesc(rs.getString(3));
		}
		else
		{
			product=null;
		}
		
		return product;
	}
}
