package intro;


/*Java Boolean Data Types
Boolean Types
Very often in programming, you will need a data type that can only have one of two values, like:

YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can only take the values true or false:

ExampleGet your own Java Server
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false

However, it is more common to return boolean values from boolean expressions, for conditional testing (see below).

Boolean Expression
A Boolean expression returns a boolean value: true or false.

This is useful to build logic, and find answers.

For example, you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:

Example
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9

EL XML DJANGO NUMPY PANDAS NODEJS R TYPESCRIPT ANGULAR GIT POSTGRESQL MONGODB ASP AI GO KOTLIN SASS VUE DSA GEN AI SCIPY AWS CYBERSECURITY DATA SCIENCE      ❯   
Java Tutorial
Java HOME
Java Intro
Java Get Started
Java Syntax
Java Output
Java Comments
Java Variables
Java Data Types
Java Type Casting
Java Operators
Java Strings
Java Math
Java Booleans
Java If...Else
Java Switch
Java While Loop
Java For Loop
Java Break/Continue
Java Arrays

Java Methods
Java Methods
Java Method Parameters
Java Method Overloading
Java Scope
Java Recursion

Java Classes
Java OOP
Java Classes/Objects
Java Class Attributes
Java Class Methods
Java Constructors
Java Modifiers
Java Encapsulation
Java Packages / API
Java Inheritance
Java Polymorphism
Java Inner Classes
Java Abstraction
Java Interface
Java Enums
Java User Input
Java Date
Java ArrayList
Java LinkedList
Java List Sorting
Java HashMap
Java HashSet
Java Iterator
Java Wrapper Classes
Java Exceptions
Java RegEx
Java Threads
Java Lambda
Java Advanced Sorting

Java File Handling
Java Files
Java Create/Write Files
Java Read Files
Java Delete Files

Java How To's
Add Two Numbers
Count Words
Reverse a String
Sum of Array Elements
Convert String to Array
Sort an Array
Find Array Average
Find Smallest Element
ArrayList Loop
HashMap Loop
Loop Through an Enum
Area of Rectangle
Even or Odd Number
Positive or Negative
Square Root
Random Number

Java Reference
Java Reference
Java Keywords
Java String Methods
Java Math Methods
Java Output Methods
Java Arrays Methods
Java ArrayList Methods
Java LinkedList Methods
Java HashMap Methods
Java Scanner Methods
Java Iterator Methods
Java Errors & Exceptions

Java Examples
Java Examples
Java Compiler
Java Exercises
Java Quiz
Java Server
Java Syllabus
Java Certificate



Java Booleans
Java Booleans
Very often, in programming, you will need a data type that can only have one of two values, like:

YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can store true or false values.

Boolean Values
A boolean type is declared with the boolean keyword and can only take the values true or false:

ExampleGet your own Java Server
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false

However, it is more common to return boolean values from boolean expressions, for conditional testing (see below).

Boolean Expression
A Boolean expression returns a boolean value: true or false.

This is useful to build logic, and find answers.

For example, you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:

Example
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9

Or even easier:

Example
System.out.println(10 > 9); // returns true, because 10 is higher than 9

In the examples below, we use the equal to (==) operator to evaluate an expression:

Example
int x = 10;
System.out.println(x == 10); // returns true, because the value of x is equal to 10

Example
System.out.println(10 == 15); // returns false, because 10 is not equal to 15

*/
public class JavaBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}

	}

}
