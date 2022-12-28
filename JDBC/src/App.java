import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Credentials to connect to db 
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root"; 
        String pass="pAss123@!";

        // Loading the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Creating the connection to db 
        Connection con=DriverManager.getConnection(url, user, pass);


        // Checking if our connection is working properly or not
        if(con.isClosed()){
            System.out.println("Connection is closed");
        } else{
            System.out.println("Connection created successfully ...");
        }
        con.close();
    }
}
