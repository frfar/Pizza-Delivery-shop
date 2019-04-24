package domain.login;


	

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import db.DbManager;



	public class PizzaDao {

		static Connection conn;
		static PreparedStatement ps;
		DbManager db = new DbManager();
		
		
		
		
		public int order(Pizza p) {
			int status = 0;
			try{
				conn = db.getConnection();
				ps =conn.prepareStatement("insert into Pizza values(?,?,?)");
				ps.setInt(1, p.getPepperoni());
				ps.setInt(2, p.getM());
				ps.setInt(3, p.getV());
				status = ps.executeUpdate();
				conn.close();
			}catch(Exception e){
				System.out.println(e);
			}
			return status;
		}

}
