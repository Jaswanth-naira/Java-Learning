</> Markdown
## concepts learned 

- Java class 
  In java class is a blueprint or template for creating objects that share common properties and behaviour.Every program must be inside a class.Keyword tells java creating a new class.

- `public static void main()`
   public:This method can be accessed anywhere
   Java needs the main() method to be public so it can start program

   static:Can use this method without creating an object.
   since main() is static java can directly call it when program starts. 

   void:This method doesnt return anything.

   main:this is the entry point of every java application.

   String args[]:This stores command line arguments.
   Java passes information through array if needed.

- `System.out.println("")`
   This line prints text on the console.

   System 
   System is a built-in java class.
   
   It provides useful tools like:
   .Input
   .Output
   .Time
   .Environment Information 

   out is a standard output stream.

   println 
   Print the text and move to the next line.

   Anything inside semi colon is a string
   Java prints it exactly as written.

   Every java statement ends with a semicolon.

</> Markdown
## Program Flow

```text

 HelloWorld.java
       |
       ▼
 Find class HelloWorld 
       |
       ▼
 Find main()
       |
       ▼
 Execute code inside main()
       |
       ▼
 Print "Hello world" 
       |
       ▼
 Program ends
```

</> Markdown

 ## Summary 
| code | Purpose |
|------|---------| 
| `class` | Defines a class.Every Java program must be written inside a class. |
| `HelloWorld` | Name of the class. | 
| `{}` |Defines a  block of code. | 
| `public` | Makes the `main()` method accessible to the JVM. | 
| `static` | Allows the `main()` method to run without creating an object. | 
| `void` | Indicates that the method does not return any value. | 
| ` main()` | Entry point of the Java application. | 
| `String args[]`| Stores command-line arguments passed to the program. |
| `System` | Built-in java class that provides system related features. | 
| `out` | Standard output stream used to display output on the console. | 
| `println()` | Prints text and moves the cursor to the next line. | 
| `"Hello World"` | A String literal enclosed in double quotes. | 
| ` ;` | Marks the end of a statement. |


 