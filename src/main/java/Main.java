import java.sql.*;
class Main{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ordb?serverTimezone=UTC","root","177358KJkj!!");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from ordb.users");
            while(rs.next())
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}