let addfirsttwo l = List.hd(l) + List.hd(List.tl(l));;
addfirsttwo[5; 3; 2; 6];;

let isnil l =  if l = [] then true else false;;
isnil [];;

let rec len l = if l = [] then 0 else len(List.tl(l)) +1 ;;
len [5; 3; 2; 6];;

let addfirsttwolengths l =  let list l = List.hd(l) @ List.hd(List.tl(l)) in len(list l);;
addfirsttwolengths [[5;6]; [2]; [6;3]];;

let rec sum l = if l = [] then 0 else List.hd l + sum(List.tl l);;
sum [4;1;5];;

let rec range n m = if n > m then [] else n::(range (n+1) m);;
range 3 5;;

let rec allpos l = if l =[] then true
                   else if List.hd l <= 0 then false 
                   else allpos(List.tl l);;                  

allpos [5;2;9;8];;


let rec concat l = if l = [] then [] else List.hd l @ (concat(List.tl l));;
concat ([[1;2]; [3;4;5]; [6]]);;

let rec reverse l = if l = [] then [] else reverse(List.tl l) @  [List.hd l];;
reverse [1;2;3];;

let rec remove_first a l = if l = [] then [] 
else if (List.hd l ) = a then List.tl l else  (List.hd l) :: (remove_first a (List.tl l));;

remove_first 1 [1;3];;

let rec nth l n = if l = [] then -1 else if n = 0 then List.hd l else nth (List.tl l) (n - 1);;
nth [1;2;3] 4;;

let rec insert a l = if l = [] then [a] else if List.hd l < a then [List.hd l] @ [a] 