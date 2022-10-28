
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class playbox {
    public static String str ="";
    public static void main(String[] args) {
        str = "f";
    
    
    
    
    
    }

    public static void prog(){
        System.out.println("Enter <Prog>");
        if(str == "f"){
            dcls();
        }
        
        System.out.println("Exit <Prog>");
    }

    public static void dcls(){
        System.out.println("Enter <dcls>");
        dcl();
        if(str == "f"){
            dcls();
        }
        System.out.println("Exit <Dcls>"); 
    }

    public static void dcl(){
        System.out.println("Enter <Dcl>");
        

    }


    
}
