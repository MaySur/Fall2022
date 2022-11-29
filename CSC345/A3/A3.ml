
(* CSC 345-01 Assignment #3

   On my honor, Mayur Suresh ,this assignment is my own work.  
   I, Mayur Suresh, will follow the instructor's rules and processes 
   related to academic integrity as directed in the course syllabus.
 
   *** You are NOT allowed to use OCaml's pattern matching for this assignment. ***

   *** DO NOT CHANGE ANYTHING IN THIS FILE EXCEPT THE PLACEHOLDERS. ***

   *** You are only allowed to replace (* FILL IN HERE *) with your OCaml code.  ***
*) 



(* 1. Write function "opp" that returns the boolean complement (opposite) of its argument.  
      For example, opp (1 = 2);; returns true *)	  
let opp : bool -> bool = fun x -> if x then false else true;;


(* 2. Write function "dividesEvenlyByThree" that returns whether some dividend is evenly divisible by the divisor 3.
      For example, dividesEvenlyByThree 6;; returns true *)
let dividesEvenlyByThree : int -> bool = fun x -> if (x mod 3 ==0) then true else false;;



(* 3. Write function "third" that returns the third greatest of four given arguments.
      For example, third 1 2 3 3;; returns 2 *)	  
let third : 'a -> 'a -> 'a -> 'a -> 'a = fun w x y z -> let maxNum a b = if (a > b) then a else b in
                    let second a b c = if (a > b && a > c) then maxNum b c else if (b > c) then maxNum a c else maxNum a b in
                    if ( w > x && w > y && w > z) then second x y z else if (x > y && x > z) then second w y z else if (y > z) then second w x z else second w x y;;


(* 4. Write function "nor" that computes the NOR gate of two boolean arguments.
      The NOR gate is a combination OR gate followed by an inverter. 
      Its output is "true" if both inputs are "false."  Otherwise, the output is "false." 
      For example, nor (1=2) (2=3);; returns true *)
let nor : bool -> bool -> bool = fun x y -> if (x = false && y = false) then true else false;;


(* 5. Write function "squares" that takes three integer numbers as arguments, 
      and returns the sum of the squares of the two large numbers.  
      For example, squares 1 2 3;; returns 13. *)
let squares : int -> int -> int -> int = fun x y z -> let smallest x y z = if (x < y && x < z) then x else if (y < z) then y else z in
                                       if(x != smallest x y z && y != smallest x y z) then (x * x) + (y * y)
                                       else if(z != smallest x y z && y != smallest x y z) then (z * z) + (y * y)
                                       else (z * z) + (x * x);;


(* 6. Write function "ceilingDecimal" that calculates the ceiling of a float, but returns it as an int rather than a float. 
      If you are not familiar with the ceiling funtion, read: https://www.mathsisfun.com/sets/function-floor-ceiling.html 
      For example, ceilingDecimal 15.1;; returns 16 *)
let ceilingDecimal : float -> int = fun x -> if (x = float_of_int(int_of_float(x))) then int_of_float(x) else int_of_float(x)+1;;



(* 7. Write function "letterGrade" that returns the equivalent letter grade for a given numerical integer grade below.

		Letter Grade	Numerical Grade x
		A				93 <= x <= 100
		A-				90 <= x < 93
		B+				87 <= x < 90
		B				83 <= x < 87
		B-				80 <= x < 83
		C+				77 <= x < 80
		C				73 <= x < 77
		C-				70 <= x < 73
		D+				67 <= x < 70
		D				63 <= x < 67
		D-				60 <= x < 63
		F				< 60

      For example, letterGrade 91;; returns A- *)
let letterGrade : int -> string = fun x -> if (x >=93 && x <= 100) then "A"
                                                     else if (x >=90 && x < 93) then "A-"
                                                     else if (x >=87 && x < 90) then "B+"
                                                     else if (x >=83 && x < 87) then "B"
                                                     else if (x >=80 && x < 83) then "B-"
                                                     else if (x >=77 && x < 80) then "C+"
                                                     else if (x >=73 && x < 77) then "C"
                                                     else if (x >=70 && x < 73) then "C-"
                                                     else if (x >=67 && x < 70) then "D+"
                                                     else if (x >=63 && x < 67) then "D"
                                                     else if (x >=60 && x < 63) then "D-"
                                                     else "F";;

letterGrade (93);;
(* 8. Write function "findDays" that returns the number of days in a month. 
      The function takes in as input an integer representing a month, and outputs the
      number of days.  You can assume that February has 28 days.
      For example, findDays 12;; returns 31
  
      The function returns -1 for any error cases.
      For example, findDays 13;; returns -1 *)
let findDays : int -> int = fun month -> if month = 1 || month = 3 || month = 5 || month = 7 || month = 8 || month = 10 || month = 12 then 31
          else if month = 4 || month = 6 || month = 9 || month = 11 then 30
          else if month = 2 then 28
          else -1;;

