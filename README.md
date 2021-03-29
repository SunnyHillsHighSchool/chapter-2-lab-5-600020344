[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4458747&assignment_repo_type=AssignmentRepo)
# Chapter-2-Lab-5

Lab Goal :   This lab was designed to teach you more about iterators and list iterators.


Lab Description :   Read in a list of words, a word to replace, and a word with which to replace the original word.   Replace all occurrences of the original word with the new word.  You must use a ListIterator.
			


Files Needed ::
IteratorReplacer.java
Main.java
.replit
run_button.sh


Sample Data : 
a b c a b c     a    +
a b c d e f g h i j x x x x     x     7
1 2 3 4 5 6 a b c a b c     b     #	


	
Sample Output :
[+, b, c, +, b, c]


[a, b, c, d, e, f, g, h, i, j, 7, 7, 7, 7]


[1, 2, 3, 4, 5, 6, a, #, c, a, #, c]


Use an ArrayList to store the list.
Use split( ) to split the String input into a String[] array.
String[] words = "abc cde fgh ijk".split(" ");   
ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));

You can use list.toString().replaceAll() to print out the ArrayList in one line.
