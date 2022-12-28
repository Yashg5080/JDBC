import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class SelectTable{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            String url="jdbc:mysql://localhost:3306/demo";
            String user="root"; 
            String pass="pAss123@!";

            Connection con=DriverManager.getConnection(url, user, pass);

            String query="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while (rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String city=rs.getString(3);
                System.out.println(id+name+city);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}