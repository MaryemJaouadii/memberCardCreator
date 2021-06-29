package tp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonneManager {
	 Connection con;
	 Statement st;

	public PersonneManager() {
		/** chargement driver **/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver chargé...");
		} catch (ClassNotFoundException e) {
			
			System.out.println("erreur du chargement driver "+e.getMessage());
		}
		
		/** connexion et statement **/
		String url="jdbc:mysql://127.0.0.1/carte";
		String user="root";
		String mp="";
		
		try {
			con=DriverManager.getConnection(url,user,mp);
			System.out.println("connexion etablie...");
			
			if(con!=null) {
				st=con.createStatement();
			}
			
			
		} catch (SQLException e) {
			
			System.out.println("erreur de connexion "+e.getMessage());
		}
	}
		
		
	int ajouterMembre(String nomp, String pos , String email ,String tel) 
	{

		int a=-1;
		/** etape 3 : Requete MAJ */
		try {
			if (st!=null)
			{
				a =st.executeUpdate("insert into carte values ('"+nomp+"','"+pos+"','"+email+"','"+tel+"')");
				System.out.println("insertion avec success de "+a+" element(s)");
			}
		}
		catch (SQLException e) {

			System.out.println("erreur d'ajout: " + e.getMessage());
		}
		return a;

	}
		
		
		
		
		
		
		
		
	}

