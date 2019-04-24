package domain.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DbManager;



public class CustomerDaoImpl implements CustomerDao {

	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	@Override
	public int update(Customer c) {
		int stat = 0;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into customer values(?,?,?,?)");
			//String query = "update users set num_points = ? where first_name = ?";
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
			ps.setString(4, c.getEmail());
			stat = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return stat;
	}
	
	@Override
	public int register(Customer c) {
		int status = 0;
		try{
			conn = db.getConnection();
			ps = conn.prepareStatement("insert into customer values(?,?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
			ps.setString(4, c.getEmail());
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer validateCustomer(Login login) {
		Customer c = new Customer();
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("select * from customer where userId=? and password=?");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
			}
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return c;
	}

}
