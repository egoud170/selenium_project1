

/*
 * Java Quickstart
In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:*/

/*Example explained
Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter. In our example, we named the class Main.

Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file must match the class name.
 When saving the file, save it using the class name and add ".java" to the end of the filename.
  To run the example above on your computer, make sure that Java is properly installed: 
  Go to the Get Started Chapter for how to install Java. The output should be:*/

/*The main Method
The main() method is required and you will see it in every Java program:*/

/*Any code inside the main() method will be executed. Don't worry about the keywords before and after it.
 *  You will get to know them bit by bit while reading this tutorial.

For now, just remember that every Java program has a class name which must match the filename,
 and that every program must contain the main() method.*/

/*
System.out.println()
Inside the main() method, we can use the println() method to print a line of text to the screen:*/

package intro;

public class Java_quickstart {

	public static void main(String[] args) {
		 /* The code below will print the words Hello World
	    to the screen, and it is amazing */
      System.out.println("Hell world");
	}

}
