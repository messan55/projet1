package principal;

import java.sql.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			// chargement/initialisation du driver MYSQL
			Class.forName("com.mysql.jdbc.Driver");
			// Connection est l'interface décrivant un objet permettant de se connecter
			// a une base de donnée
			// le DriverManager renvoie un objet implémentant cette interface
			// qui est capable de gérer l'url qu'on lui a fournie
		    Connection base =
		    		DriverManager.getConnection("jdbc:mysql://localhost:3306/base1",
												"root",
												"");
		    System.out.println("connecté!");
		    
		    Scanner reader = new Scanner(System.in);
		    System.out.println("prix minimum?");
		    
		    //  je creer mon objet permettant de requetter la base
		    Statement request = base.createStatement();
		    
		    // execution d'une requette select
		    // elle nous renvoie un resultset qui nous permet
		    // de parcourir les lignes renvoyée
		    ResultSet rs = request.executeQuery("select * from `article`");
		    
		    // parcourir les lignes
		    while (rs.next()){
		    	// récupérer les colonnes qui nous intéressent
		    	// sur la ligne courante
		    	System.out.println(rs.getString("nom") +
		    			" -> " + rs.getDouble("prix"));
		    }
		    rs.close();
		    // attention a bien libérer les ressources
		    
		    
//		    PreparedStatement request2 = base.prepareStatement("select * from article where poids > ?");
//		    System.out.println("poids minimum?");
//		    double poids = Double.parseDouble(reader.nextLine());
//		    
//		    request2.setDouble(1,  poids);
//		    ResultSet rs2 = request2.executeQuery();
//		    while (rs2.next()) {
//				System.out.println(rs2.getString("nom"));
//			}
//		        
//		    rs2.close();
//		    
//		    PreparedStatement insertStatement = base.prepareStatement("insert into article (nom, prix, poids)" + "values(?, ?, ?)");
//		    System.out.println("nom article a creer?");
//		    String nom = reader.nextLine();
//		    System.out.println("prix article a creer?");
//		    double prix = Double.parseDouble(reader.nextLine());
//		    System.out.println("poids article a creer?");
//		    poids = Double.parseDouble(reader.nextLine());
//		    
//		    insertStatement.setString(1, nom);
//		    insertStatement.setDouble(2, prix);
//		    insertStatement.setDouble(3, poids);
//		    
//		    int nbRows = insertStatement.executeUpdate();
//		    System.out.println(nbRows + " lignes insérés");
		    
		    request = base.createStatement();
		    
		    rs = request.executeQuery("select id, nom as denomination, prix, poids, poids * 10 as prixlivraison from article");
		    ResultSetMetaData rsMeta = rs.getMetaData();
		    for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
				System.out.println(rsMeta.getColumnLabel(i) + " -> " + rsMeta.getColumnTypeName(i) + " : " + rsMeta.getColumnClassName(i));
			}
		    
		    rs.close();
		    base.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
