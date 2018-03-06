


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/library";//database url
    private static final String USER = "root";                          //user name
    private static final String PASSWORD = "";                       // password of the user account
    private static Connection con = null;
    private static Statement st = null;
    private static PreparedStatement stPr=null;
    private String update= "UPDATE main SET count = ? WHERE food = ?";
    private String getpass= "SELECT Password,ID from main WHERE Name = ?";
    
     String pass;
     int id;
    
    
    public static Connection getConnection() throws SQLException{
        con =DriverManager.getConnection(DB_URL, USER, PASSWORD);
        st = con.createStatement();
        System.out.println("...Connected...");
        return con;
    }
    public static Statement getStatement(){
        return st;
    }
    public static void update1(String updateQuery,String updateVal,String findPlace) throws SQLException{
        DBConnection db= new DBConnection();
        stPr=db.getPrStatement(updateQuery);
        stPr.setString(1, updateVal);
        stPr.setString(2, findPlace);
        stPr.executeUpdate();
        
    }
    public PreparedStatement getPrStatement(String sqlQuery) throws SQLException{
        stPr = con.prepareStatement(sqlQuery);
        return stPr;
    }
    public String getPassword(String Name) throws SQLException{
        DBConnection db= new DBConnection();
        stPr=db.getPrStatement(getpass);
        stPr.setString(1, Name);
        ResultSet rs = stPr.executeQuery();
              
        while(rs.next()){
                    pass = rs.getString(1);
                    id = rs.getInt(2);
        }

        return(pass+","+id);
        
        
    }
    public void insertBook(String name,String donator, double price){
        String sqlQueryBook ="INSERT INTO books(Name,Donator,Price,Availability) VALUES(?,?,?,?)";
        try {
            stPr = getPrStatement(sqlQueryBook);
            stPr.setString(1, name);
            stPr.setString(2, donator);
            stPr.setDouble(3, price);
            stPr.setString(4, "yes");
            
            stPr.executeUpdate();
            
            System.out.println("book was added to the database");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void newUser(String name,String email, String password,String student,String donar){
        String sqlQueryBook ="INSERT INTO main(Name,Email,Password,Student,Donar) VALUES(?,?,?,?,?)";
        try {
            stPr = getPrStatement(sqlQueryBook);
            stPr.setString(1, name);
            stPr.setString(2, email);
            stPr.setString(3,password);
            stPr.setString(4, student);
            stPr.setString(5, donar);
            
            stPr.executeUpdate();
            
            System.out.println("book was added to the database");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
