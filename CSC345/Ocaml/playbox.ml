let third x y z = let smallest x y z = if (x < y && x < z) then x else if (y < z) then y else z in 
                                       if(x != smallest x y z && y != smallest x y z) then (x * x) + (y * y)
                                       else if(z != smallest x y z && y != smallest x y z) then (z * z) + (y * y)
                                       else (z * z) + (x * x);;  
third  1 2 3;;
third  2 1 3;;
third  2 3 1;;

third  3 2 1;;
