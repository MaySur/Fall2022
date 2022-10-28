
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;


public class whit {
    public static int charClass;
    public static char [] lexeme;
    public static int DECIMAL =8;
    public static int INUM =7;
    public static void main(String [] args) throws FileNotFoundException {
        String str= "22.3";
        int i=0;
        lexeme = str.toCharArray();
        while (i<lexeme.length){
            if(Character.isDigit(lexeme[0]) && (Character.isDigit(lexeme[0])||lexeme[0]=='.')){
                charClass = DECIMAL;
            }
            else charClass = INUM;
            i++;
        }

                System.out.println(charClass);






      
			

        
    }
    
}
