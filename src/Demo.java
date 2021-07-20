import java.sql.*;

public class Demo {
	public static void main(String[] args) throws Exception {
	String url = "jdbc:mysql:sample";
	String name = "root";
	String pass = "";
	String Query = "select name from emp2 where userid=1";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,name,pass);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(Query);
	
	rs.next();
	String name1 = rs.getString("name");
	System.out.println("name");
	
	st.close();
	con.close();
}
}
