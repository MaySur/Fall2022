
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class playbox {
    public static void main(String[] args) {
    try {
        File file = new File(args[0]);		
        Scanner sc = new Scanner(file);	     
       String str ="";
       while(sc.hasNextLine()) str = sc.nextLine();

       for(int i =0; i<str.length();i++){
        if(str.charAt(i) == 'i'){
            Prog();
        }
        else if(Character.isLetter(str.charAt(i))){
            
        }
        
    
       }

       System.out.println(str);
        
        
        
        sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("ERROR - cannot open front.in \n");
    }
    }

    public static void Prog(){
        System.out.println("Enter <Prog>");
        Dcl();

    }
    public static void Dcl(){
        System.out.println("Enter <DCL>");
        Dcls();


    }
    public static void Dcls(){
        System.out.println("Enter <Dcls>");


    }
    
}
