let letterGrade : int -> string = fun x -> if (x >=98 && x <= 100) then "A"  
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

                                          else ("F");;
