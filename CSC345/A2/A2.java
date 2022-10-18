/**
 * CSC 345-01 Assignment #2
 * 
 * On my honor, <Mayur Suresh>, this assignment is my own work.  
 * I, <Mayur Suresh>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;


// Students -- Add your import declarations here

public class A2 {
	
	// Students -- Add your constants here
	public static int charClass;
	public static char [] lexeme;
	public static int FLOATDCL = 0, INTDCL = 1,PRINT = 2, ID = 3, ASSIGN = 4, PLUS = 5,MINUS = 6, INUM = 7, FNUM = 8, WHITESPACE = -1, EOF = -2, UNKNOWN = -3;
	public static String str = "";




	public static void main(String[] args) {
		try {
			// Do NOT make any changes to the following TWO lines
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);		//*** Do not make any other Scanners ***//
			
			while(sc.hasNextLine()) str += sc.nextLine();
			str = str.replaceAll("[\n\t ]*", "");
			int len = str.length();
			int i =0;
			//System.out.println(len);
			str = str.concat("$");
			//System.out.println(str);
			/* 
			while(i<len){
				lex();
				i++;
			}*/
			lex();

			prog();
			
		
			
			
			sc.close();
		} catch (Exception e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
	}
	
	public static void getC(){
		try{
		StringBuilder mystr = new StringBuilder(str);
		mystr.deleteCharAt(0);
		str = mystr.toString();
		}catch(StringIndexOutOfBoundsException e){}
	}

	public static void getChar(){

		try {
			if(Character.isAlphabetic(str.charAt(0))) charClass = ID;
			else if(Character.isDigit(str.charAt(0))) charClass = INUM;
			else if(Character.isWhitespace(str.charAt(0))) getC();
			else if(str.isEmpty()) charClass = EOF;
			else charClass = UNKNOWN;				
			} catch (Exception e) {}
	}

	public static void lex() {
		getChar();
		try{
			switch (charClass){
				
				case 3:
				//System.out.println(str);

				
				if(str.charAt(0) == 'f') charClass = FLOATDCL;
				else if(str.charAt(0) == 'i') charClass = INTDCL;
				else if(str.charAt(0) == 'p') charClass = PRINT;	
				else charClass =ID;
				//System.out.println();
				System.out.println("Next token is: "+charClass+", Next lexeme is "+str.charAt(0));
				getC();
				break;

				case 7:
				Pattern pat1 = Pattern.compile("[0-9]*\\.[0-9]+");
				Matcher m1 = pat1.matcher(str);	  

					

				if (m1.find()){
					String str1 = m1.group();
					if (str1.matches("[0-9]+\\.([0-9]+)")){
						//System.out.println(str1);
						charClass = FNUM;
						str = str.replace(str1, "");
						
						System.out.println("Next token is: "+charClass+", Next lexeme is "+str1);

					}else {
						//System.out.println(str1);
						charClass = INUM;
						System.out.println("Next token is: "+charClass+", Next lexeme is "+str1);

						getC();
					}

					}


				case -3:
				if(str.charAt(0) == '$') charClass =EOF;
				else if (str.charAt(0) == '=') charClass = ASSIGN;
				else if (str.charAt(0) == '+') charClass = PLUS;
				else if (str.charAt(0) == '-') charClass = MINUS;
				if(charClass != EOF){
					System.out.println("Next token is: "+charClass+", Next lexeme is "+str.charAt(0));
					}
				//System.out.println(str);
				getC();
				break;

				case -1: 
				getC();
				break;

				case -2:
					charClass = EOF;
					
					break;

			}
		   }catch(StringIndexOutOfBoundsException e){
		   }
		
	}


	public static void prog(){
		System.out.println("Enter <Prog>");
		//System.out.println(charClass);
		if (charClass == FLOATDCL || charClass == INTDCL)
		 {dcls();}

		if (charClass == ID || charClass == PRINT){stmts();}
		System.out.println("Exit <Prog>");
	}

	public static void dcls(){
		System.out.println("Enter <Dcls>");
		dcl();
		if (charClass == FLOATDCL || charClass == INTDCL) dcls();
		System.out.println("Exit <Dcls>");
	}
	public static void dcl(){
		System.out.println("Enter <Dcl>");
		lex();
		lex();
		System.out.println("Exit <Dcl>");
	}

	public static void stmts(){
		System.out.println("Enter <Stmts>");

		stmt();
	
		if(charClass == ID || charClass == PRINT) {
			stmts();
	}
	System.out.println("Exit <Stmts>");		

	
}

	public static void stmt(){
		System.out.println("Enter <Stmt>");
		if (charClass == PRINT){
			lex();
			if(charClass == ID){
				lex();
			}
		}
		if(charClass == ID){
			lex();
			if(charClass == ASSIGN){
				lex();
				val();
			
				if(charClass == PLUS || charClass== MINUS){
					expr();
				}
			}
		}		
		System.out.println("Leave <Stmt>");
	}


	
	public static void expr(){
		System.out.println("Enter <Expr>");
		lex();
		if(charClass == ID || charClass == FNUM || charClass == INUM){
			val();
		}
		if(charClass == PLUS || charClass == MINUS){
			expr();
		}
		System.out.println("Leave <Expr>");

	}
	public static void val(){
		System.out.println("Enter <Val>");
		lex();
		System.out.println("Leave <Val>");

	}
}