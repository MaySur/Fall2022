import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class playhouse {
    public static char [] lexeme;
    public static int lexLen;
    public static String charClass;
    public static int ID = 3;
    public static void main(String [] args) throws FileNotFoundException {
    

        String str = ".4";
        int i=0;
        lexeme = str.toCharArray();
        String s="";
        while (i<str.length()){
            if(Character.isDigit(lexeme[0])){
                s = String.valueOf(lexeme[0]);
                getC(); 
            }
            else if(Character.isWhitespace(lexeme[0])){
                    getC();
                    System.out.println("DIGIT");
                    break;
                }
            else if (Character.isDigit(lexeme[0])){
                s = String.valueOf(lexeme[0]);
                getC();
            }
            else if(lexeme[0]== '.'){
                s = String.valueOf(lexeme[0]);
                getC();
            }
            else if (lexeme[0]== '.'){
                break;
            }
            else {
                System.out.println("EOF");
                break;            
            }
            System.out.print(s);      
           
            
            i++;
        }


      
}
    public static void getC(){
        StringBuilder sb = new StringBuilder();
        sb.append(lexeme);
        sb.deleteCharAt(0);
        lexeme = sb.toString().toCharArray();
        }

}
