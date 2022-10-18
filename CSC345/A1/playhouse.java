import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class playhouse {
    public static char [] lexeme;
    public static int lexLen;
    public static String charClass;
    public static int ID = 3;
    public static float flt ;
    public static String str ="";
    public static void main(String [] args) throws FileNotFoundException {

        String str = "3";
        lexeme = str.toCharArray();

        str = String.valueOf(lexeme);

        Pattern pat = Pattern.compile("[0-9]*\\.\\.+[0-9]+");
        Matcher m = pat.matcher(str);
        Pattern pat1 = Pattern.compile("[0-9]*\\.[0-9]+");
        Matcher m1 = pat1.matcher(str);
        if (m.find()){
            
            String str1 = m.group();
            //System.out.println(m.group());
            str1 = str1.replaceAll("\\.[0-9]*\\w+","");
            charClass = "DECIMAL1";
            System.out.println("The next tpken is:" +charClass+"Next lexeme is "+str1);
            str = str1;
            System.out.println(str);
        } else if(m1.find()){
            String str1 = m1.group();
            charClass = "DECIMAL2";
            System.out.println("The next tpken is:" +charClass+"Next lexeme is "+str1);
            String s = str1;
            str = str.replace(s, "");
            System.out.println(str);
        }else {charClass ="INT"; System.out.println("The next tpken is:" +charClass+"Next lexeme is "+lexeme[0]);getC(); }

    
    }
public static void getC(){
		try{
        StringBuilder sb = new StringBuilder();
		sb.append(lexeme);
		sb.deleteCharAt(0);
		lexeme = sb.toString().toCharArray();
		}catch(StringIndexOutOfBoundsException e){
            
        }
    } 
}