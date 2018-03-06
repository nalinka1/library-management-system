
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class checkSt {
    boolean allow=true;
    public static  String getDate;
    public static  String returnDate;
    public static int NoOfBooks;
    public static String bookss;
    
    Statement stmt;
    ResultSet re;
    
    checkSt(){
        DBConnection db = new DBConnection();
        
    }
    void processing(int stID){
        String query ="SELECT * FROM borrow";
        Statement stmt = DBConnection.getStatement();
        try {
            re = stmt.executeQuery(query);
            while(re.next()){
                int id = re.getInt("St_ID");
                if(id==stID){
                    allow = false;
                    getDate= re.getString("getDate");
                    returnDate= re.getString("returnDate");
                    NoOfBooks=re.getInt("No_Of_Books");
                    bookss=re.getString("books");
                    break;
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(checkSt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void go(){
        if(allow){
            allowedSt al = new allowedSt();
            al.main4();
           
        }
        else{
            notAllowedSt nt = new notAllowedSt();
            nt.main5();
            
        }
    }
}
