let orderTriple : int * int * int -> int * int * int = fun (x, y, z) -> if (x < y && x < z && y < z) then (x, y ,z) 
                                                                   else if (y < x && y < z && x < z) then (y, x, z)
                                                                   else if (z < x && z < y && x < y) then (z, x, y)
                                                                   else if (x < z && x < y && z < y) then (x, z, y)
                                                                   else if (y < z && y < x && z < x) then (y, z, x)
                                                                   else (z, y, x);;
                                                                  
