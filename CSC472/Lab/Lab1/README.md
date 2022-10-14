## Lab1: Stack and Stack Frame (5 Points)

# Objectives and Targets

The stack is a segment of memory where data like your local variables and
function calls get added and/or removed in a last-in-first-out (LIFO) manner.
When you compile a program, the compiler enters through the main function
and a stack frame is created on the stack. A frame, also known as an
activation record is the collection of all data on the stack associated with one
subprogram call. The main function and all the local variables are stored in an
initial frame.

In this lab, you’ll use gdb to debug a program and answer questions
related to stack and stack frame

Step 1: First, you need to connect to our badger CTF system, once
connected, you need to go to folder “lab1” by typing

```
cd lab
```

```
source code for lab
```
Step 2: Use gdb to analysis the binary program of lab1.

```
gdb lab
```
P. S. I f yo u ’ re n o t fa m i l a r w i t h gdb, now it’s the best time to check this
tutorial Link.

Step 3: Disassemble the main function by typing the following command
and answer the following question(s):

```
disas main
```

```
Assembly code for main function
```
### Q1: Pointing out the assembler code (including their memory

### address) which are used for creating the stack frame of the

### main() function (1 point):

### Q2: What’s the meaning of these two lines (1 point):

```
0x080491b1 <+18>: mov DWORD PTR [ebp-0x10],0x
0x080491b8 <+25>: mov DWORD PTR [ebp-0xc],0x
```

### Q3: Before calling add_plus1() function, the stack contains

### 5,6,5,6 (see the picture below), why there are two sets of

### “5,6” instead of just one?(1 point):

#### Q

Step 4: Disassemble the add_plus1 function by typing the following
command and answer the following question(s):

```
disas add_plus
```

```
Assembly code for add_plus1 function
```
### Q4: What’s the meaning of the first two lines (1 point):

```
0x08049176 <+0>: push ebp
0x08049177 <+1>: mov ebp,esp
```
### Q5: Which register is being used to store the final summation

### result? (1 point):

## Deliverables:

```
A detailed project report in PDF format to answer the above questions, you
can draw some pictures/diagrams and include code snippets if needed.
```
## Submission

```
Check lab due date on the course website. Late submission will not be
accepted.
```

The assignment should be submitted to D2L directly.
No copy or cheating is tolerated. If your work is based on others', please
give clear attribution. Otherwise, you WILL FAIL this course.


