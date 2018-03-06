
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class print extends Login{
    public synchronized void printVal(String show){
        for(int i=0;i<200;i++){
            loginshow.setText(show);
            System.out.println(i);
            
        }
    }
}
public class LoginBackground extends Login implements Runnable {

    print pr;
    String show;
    LoginBackground(String shows){
        this.show= shows;
    }
    public void run(){
        try {
            pr = new print();
            pr.printVal(show);
            System.out.println("we are in 1 ");
            sleep(2000);
            Thread login2= new Thread(new LoginBackground2("Welcome"));
            login2.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginBackground.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
