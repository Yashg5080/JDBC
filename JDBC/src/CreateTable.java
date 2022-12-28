import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            String url="jdbc:mysql://localhost:3306/demo";
            String user="root"; 
            String pass="pAss123@!";

            Connection con=DriverManager.getConnection(url, user, pass);

            // Writing update query and executing using statement object.
            String query="create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null , tcity varchar(400))";
            Statement stmt= con.createStatement();
            stmt.executeUpdate(query);
            con.close();
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
