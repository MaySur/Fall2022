import java.util.Scanner;
import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;

public class playbox {
    public static String str ="";
    public static String charClass;
    public static char[] lexeme;

    public static void main(String [] args){
        try {
			// Do NOT make any changes to the following TWO lines
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);	
            
            while(sc.hasNextLine()) {
                str += sc.nextLine();
            }
            lexeme = str.toCharArray();
            Pattern pat = Pattern.compile("[0-9]+\\..+?[0-9]*");
            Matcher m = pat.matcher(str);
            Pattern pat1 = Pattern.compile("[0-9]+\\.?[0-9]*");
            Matcher m1 = pat1.matcher(str);

            if (Character.isDigit(lexeme[0])){
                if(m1.find()){
                    charClass ="DECIMAL";
                } 

            } else getC();
            
           
            
            


            sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
        

    
    }

    public static void Decimal(){

        
        float dec =0;

        Pattern pat = Pattern.compile("[0-9]+\\.?[0-9]+");
        Matcher m = pat.matcher(str);

        while (m.find()){
        dec = Float.parseFloat(m.group());
        }
        System.out.println(dec);
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