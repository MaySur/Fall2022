/**
 * CSC 345-01 Assignment #1 (version 1.1)
 * 
 * On my honor, Mayur Suresh, this assignment is my own work.  
 * I, Mayur Suresh, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

// Students -- Add your import declarations here

public class A1 {
	
	// Students -- Add your constants here
	public static int charClass;
	public static int lexLen;
	public static char[] lexeme;
	public static int FLOATDCL =0;
	public static int INTDCL =1;
	public static int PRINT =2;
	public static int ID =3;
	public static int ASSIGN =4;
	public static int PLUS =5;
	public static int MINUS =6;
	public static int INUM =7;
	public static int FNUM =8;
	public static int DECIMAL =9;
	public static int WHITESPACE =-1;
	public static int EOF =-3;	
	public static int UNKNOWN = -2;
	public static String str="";
	public static String dstr ="";
	public static float flt =0;
	
	
	public static void main(String[] args) {
		try {
			// Do NOT make any changes to the following TWO lines
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);		//*** Do not make any other Scanners ***//
			// *** NOTE ***
			// For this assignment, you are NOT allowed to use any member methods of 
			// class java.util.Scanner except hasNextLine and nextLine.  
			// For example, you CANNOT use any of hasNextInt, nextInt, hasNextFloat, nextFloat, 
			// hasNextDouble and nextDouble for this assignment.  			
			// Students -- Your code and methods calls go here

			
			// while (sc.hasNextLine()) str = sc.nextLine();
            while(sc.hasNextLine()) {
                str += sc.nextLine();
            }
			/* 
            Pattern pat = Pattern.compile("[0-9]+\\.+?[0-9]*");
			Pattern pat1 = Pattern.compile("[0-9]+\\.?[0-9]+");
            Matcher m = pat.matcher(str);
			Matcher m1 = pat1.matcher(str);
			 if(m1.find()){
				flt = Float.parseFloat(m1.group());
				charClass = DECIMAL;
			 } else if (m.find()){
				flt = Float.parseFloat(m.group());
				charClass = DECIMAL;
			 }
			 String s = flt+"";
            str = str.replace(s, "");
*/

			str = str.replaceAll("[\n\t ]*", " ");

			lexLen = str.length();
			lexeme  = str.toCharArray();
			
			int i=0;
			while(i <=str.length()){
				lex();
				i++;
			}


			
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
		
	
	
	}
	// Students -- Add your method declarations here System.out.println(lexeme[0]+charClass);

	public static void getChar(){
        
		try{

		
		if (Character.isAlphabetic(lexeme[0])){
			charClass = ID;}
		else if(Character.isDigit(lexeme[0])){
			charClass= INUM;
		}
		else if(Character.isWhitespace(lexeme[0])){
			charClass= WHITESPACE;
		}
		else if(lexeme.length == 0){
			charClass = EOF;

		}
		
		else charClass = UNKNOWN;

		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
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


		public static void lex(){
			getChar();

			try{			
			switch(charClass){
				case 3:
				if(lexeme[0] == 'f') charClass = FLOATDCL;
				else if(lexeme[0] == 'i') charClass = INTDCL;
				else if(lexeme[0] == 'p') charClass = PRINT;
				else charClass = ID;
				System.out.println("Next token is: "+charClass+", Next lexeme is "+lexeme[0]);
				getC();
				break;

				case -2:
				if(lexeme [0] == '=') charClass =ASSIGN;
				else if(lexeme[0] == '+') charClass =PLUS;
				else if(lexeme [0] == '-') charClass = MINUS;
				//else if(lexeme [0] == '.') charClass = DECIMAL;
				System.out.println("Next token is: "+charClass+", Next lexeme is "+lexeme[0]
				);
				getC();
				break;
				case -1:
				getC();
				break;

				case 7:
				str = String.valueOf(lexeme);
				

				Pattern pat = Pattern.compile("[0-9]+\\..+?[0-9]*");
				Matcher m = pat.matcher(str);
				Pattern pat1 = Pattern.compile("[0-9]+\\.?[0-9]*");
				Matcher m1 = pat1.matcher(str);

				














				charClass =INUM;
				System.out.println("Next token is: "+charClass+", Next lexeme is "+lexeme[0]);
				getC();
				break;

				case -3:
				charClass=EOF;
				System.out.println("Next token is: "+charClass+", Next lexeme is "+lexeme[0]);
				break;
				case 9:
				charClass=FNUM;
				System.out.println("Next token is: "+charClass+", Next lexeme is "+flt);
				
			
			}
			}
			catch(ArrayIndexOutOfBoundsException e){
			
		}
		}

		public static void decimal(){
		Pattern pat = Pattern.compile("[0-9]+\\.?[0-9]+");
        Matcher m = pat.matcher(str);

        while (m.find()){
        flt = Float.parseFloat(m.group());
        }
		charClass = FNUM;
		dstr = flt+"";



		}
}