
public class playbox {
	public static String charClass;
	public static int lexLen;
    public static char[] lexeme;
    public static void main(String [] args) {
        String str = "f i p a 9";
        lexeme = str.toCharArray();             
        int number =0;
       while(number <=str.length()){
        getChar();
        lex();
        number++;
        }
    
        
    }


    public static void getChar(){
        if (Character.isAlphabetic(lexeme[0])){
            charClass = "ID";
            }
        else if(Character.isDigit(lexeme[0])){
            charClass ="INUM";			
        }
        else if(Character.isWhitespace(lexeme[0])){
            getC();
        }
        else{charClass = "UNKNOWN";} 
    }	
    public static void getC(){
        StringBuilder sb = new StringBuilder();
        sb.append(lexeme); 
        sb.deleteCharAt(0);
        lexeme = sb.toString().toCharArray();
    }
    
    public static void lex(){
        switch(charClass){
            case "ID":
            if(lexeme[0] == 'f') charClass = "FLOATDCL";
            else if(lexeme[0] == 'i') charClass = "INTDCL";
            else if(lexeme[0] == 'p') charClass = "PRINT";
            else charClass = "ID";
            System.out.println(charClass+' '+lexeme[0]);
            getC();
            break;
            case "UNKNOWN":
            if(lexeme [0] == '=') charClass ="ASSIGN";
            else if(lexeme[0] == '+') charClass ="PLUS";
            else if(lexeme [0] == '-') charClass = "MINUS";
            else if(lexeme [0] == '.') charClass = "DECIMAL";
            System.out.println(charClass+' '+lexeme[0]);
            getC();
            break;
        
        }
            


    }
    
    
}
