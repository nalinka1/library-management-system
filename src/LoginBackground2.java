
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginBackground2 extends Login implements Runnable{
   String show;
    print pr1;
    LoginBackground2(String showIn){
        this.show= showIn;
    }
    
    public void run(){
      
       try {
           pr1 = new print();
           pr1.printVal(show);
           System.out.println("we are in 2 : ");
           sleep(200);
           Thread.yield();
           Thread login1= new Thread(new LoginBackground("Welcome"));
           login1.start();
       } catch (InterruptedException ex) {
           Logger.getLogger(LoginBackground2.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }
    
}
