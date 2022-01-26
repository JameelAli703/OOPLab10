package Lab10;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab15 {
    Connection con=null;
    java.sql.PreparedStatement pst;

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(  "jdbc:mysql://localhost:3306/student2","root","");
            Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("SELECT * FROM student2");
            while(rs.next())
                System.out.println(rs.getString("roll")+"  "+rs.getString("name"));

            con.close();
        }catch(Exception e){ System.out.println(e);
        }
    }
}

