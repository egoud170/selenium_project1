package intro;

/*
 * Java Characters
Characters
The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

ExampleGet your own Java Server
char myGrade = 'B';
System.out.println(myGrade);

Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:

Example
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);

*/

/*
 * Strings
The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

Example
String greeting = "Hello World";
System.out.println(greeting);*/

/*
 * Java Data Types Example
Real-Life Example
Here's a real-life example of using different data types, to calculate and output the total cost of a number of items:

ExampleGet your own Java Server
// Create variables of different data types
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);*/
public class JavaCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
	}

}
