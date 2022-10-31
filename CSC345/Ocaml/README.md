# **OCAML GUIDE**
## 1. Install: 
* Ubuntu
```
sudo apt-get update
sudo apt-get upgrade
sudo apt-get install ocaml-interp
```
## 2. More Infor
* [Cornell Link](https://cs3110.github.io/textbook/chapters/basics/toplevel.html)

## 3. Data types and Expressions
* int:
```
2*4;;

- : int = 8
```

* float: 
```
2.0 *. 4.0;;
- : float = 8.0
```

* string:
```
"hello";;
- : string = "hello"
```
* concating string:
```
"hello" ^ "world";;
- : string = "helloworld"
```

* Overiding Types:

```
string_of_int 4;;
- : string = "4"
```

```
int_of_string "4";;
- : int = 4

int_of_string "int";;
Error
Raised by primitive operation at unknown location
```

* char:
```
"abc".[0]
- : char = 'a'

"abc". [1]
-: char = 'b'
``` 
