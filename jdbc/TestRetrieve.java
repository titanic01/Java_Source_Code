import java.sql.*;
class TestRetrieve
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ali123");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from record");
			while(rs.next())
			{
				System.out.println(rs.getString("id")+" "+rs.getString(2));
			}			
		}	
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception i)
		{
			System.out.println(i);
		}
	}
}