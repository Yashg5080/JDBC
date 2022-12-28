import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatements {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            String url="jdbc:mysql://localhost:3306/demo";
            String user="root"; 
            String pass="pAss123@!";

            Connection con=DriverManager.getConnection(url, user, pass);

            // ? is used to give dynamic values
            String query="insert into table1(tName,tCity) values (?,?)";

            // Prepared statements are used when we want to dynamically input the values in database.
            PreparedStatement pstmt=con.prepareStatement(query);

            // Inserting values using object
            pstmt.setString(1, "Yash");
            pstmt.setString(2, "Kanpur");

            // Executing the query
            pstmt.executeUpdate();
            System.out.println("Insertion successful");

            con.close();
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
