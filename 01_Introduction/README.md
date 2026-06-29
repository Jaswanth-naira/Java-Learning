Definition 
Java is a high level programming language,object oriented and class based programming language developed by sunmicrosystems(now oracle).
It is designed to be platform-independent meaning write code once that can run on any system which has java virtual machine(JVM).This is
known as java's (write once run anywhere) wora principle.

Java is compiled into bytecode which is executed by the JVM rather than directly by the operating system.It provides features such as 
object oriented programming,automatic memory management through garbage collection,multi threading,exception handling and a rich standard
library making it suitable for developing mobile applications,desktop software,enterprise applications,web applications,cloud based systems.

Because of its reliability,portability,security and strong ecosystem,Java is one of the most widely used programming languages.

Features of java:

1.Platform-Independent:Java follows the write once run anywhere(WORA) principle.The compiled bytecode runs on any system with a JVM.
Platform independence means a java program compiled on one operating system and can run on any operating system without recompiling.
The mechanism works in two stages.

First the java compiler(javac) takes the source code(.java) file and compiles it into bytecode-a .classfile.
Bytecode is not machine code.Its an intermediate os neutral instruction set that no cpu natively understands.

second the jvm the java virtual machine sit on top of each operating system.windows has its own JVM,linux has its own,macos has its own.
Each jvm knows how to take the same bytecode and translate into native machine instructions for its platform at runtime.

This is fundamentally different from c/c++.In c the gcc compiles your code directly to machine code it can only runs on windows.To run it
on Linux need to recompile from scratch and sometimes even fix incomptabilities.

2.Object-Oriented:

Java is based on object-oriented programming,which promotes code resuability and maintainability.It supports four main principles.
1.Encapsulation
2.Polymorphism
3.Inheritance
4.Abstraction 

Encapsulation:Encapsulation is the process of binding data and the methods that operates on data together within a class restricting direct
aceess to the internal state using access like access modifier like private.External code interacts only through the controlled public methods
preventing unintended modification of object state.

Inheritance:Inheritance is a mechanism by which one class acquires properties and behaviour of another class using the extends keyword.
It models an IS-A relationship promotes code resuability and from the basis of the class hierarchy.Java supports single inheritance for 
classes and multiple inheritance through interfaces.

Polymorphism:Polymorphism means ability of a single entity-a method or reference- to take many forms.It exits in two types:compile-time 
polymorphism achieved through method overloading where the method to call is resolved at compile time based on the parameter list,
run time polymorphism achieved through method overriding where a parent class reference holds a child class object and the JVM decides 
which method to invoke at runtime based on the actual object type.

Abstraction is the process of hiding implementation details and exposing only the essential functionality.In java it is achieved using
abstract classes which can have both abstract and concrete methods and interfaces which define a pure contract that implementing 
classes must fulfill.The goal is to separate what an object does it how it doest it.

3.Simple:Java has a straightforward syntax similar to c/c++ but removes complex features like 
Pointer artithmetic
Operator overloading(except + for strings)
Mutiple inheritance through classes 

4.strongly Typed:Java is statically typed meaning all types are declared and verified at compile time,catching type errors early.
It is also strongly typed meaning it doesnt allow any implicit conversions between incomptabile types - any conversion must be done 
explicitly by the developer.Together these two properties make java predictable,safer and less prone to run time surprises compared
to dynamically or weakly typed languages.

5.Secure:
Java is considered secure because:
It doesnt allow direct memory access through pointers
Bytecode is verified before execution
The JVM provides a secure execution environment
clas loader prevents unauthorized access frome being loaded.

security is layered each line adds a new line of defence

layer 1 - language design
no pointer arithmetic,no direct memory access,strong type ecosystem
                    |
layer 2 - bytecode verifier 
JVM checks bytecode before execution removes illegal instructions 
                    |
layer 3-  class loader 
separates namespaces prevents malicious class from replacing trusted class 
                    | 
layer 4-  security manager 
Controls what code can do at runtime file network thread policies 
                    | 
layer 5-  security API 
Built in cryptography-SSL/TSL authentication digital signatures 

java achieves security through five layered mechanism not just one 

The first and most fundamental layer is the language design itself.Java has no pinter arithmetic-you cannot directly access or manipulate 
memory address the way you can in c/c++.This eliminates entire class of vulnerabilities like buffer overflow and dangling pointers 
that plague low-level languages.

The second layer is the bytecode verifier inside the JVM.Before any class is executed the JVM inspects the bytecode and verifies it is 
well formed checking that it doesnt violate type rules,stack integrity or access private memebers illeaglly.If the bytecode fails
the JVM refuses to run it entirely. 

The third layer is the class loader.It separates class loaded from different resources into distinct namespaces.This prevents a malicious 
or untrusted class form being substitued for a trusted system class a technique called class spoofing.

The fourth layer is the security manager which act as a runtime gatekeeper.It controls what a piece of code allowed to do -whether 
it can read files,open network connections or spawn threads.permissions are granted based on where code came from.

The fifth layer is the built-in security API - Java ships with cryptography,SSL/TLS,digital signatures and authentication frameworks 
as part of standard library itself so developers dont need rely on third party libraries for its core security operations. 

6.Robust:
Java is robust because it includes
Strong exception handling 
Automatic garbage collection 
Type checking at compile time and run time 
Automatic memory management 

These features reduces crashes and memory related issues 

Java is roboust because it is designed to prevent errors before they happen,detect them early when they do occur, and recover from 
them gracefully across three fronts.

First prevention.Java's strong type system catches type mismathces at compile time before when the program ever runs.There are no 
explicit pointers  so you cannot accidentally read or write to arbitary memory addresses,which eliminates an entire set of bugs 
that plague c and c++ programs.The JVM also perform array bound checking on every access so you can never silently corrupt memory 
by going out of bounds- it throws arrayindexoutofboundException instead. 

Second detection and recovery java has a built in model exception try,catch and finally.More importantly java has checked exceptions
which means compiler forces you to either handle expressions or declare them.You cannot ignore them and move on.This makes error 
paths explicit and deliberate not accidental.

Third automatic memory management through garbage collector.In c the developer is responsible for allocating and freeing memory.Forget to
free you have a memory leak.Free too early you have a dangling pointer.Java removes this burden entirely.The garbage collector tracks
objects references and reclaims memory automatically when objects no longer reachable.

The net effect is the java programs are less likely to crash silently,corrupt data or behave unpredictably under error conditions which is 
exactly why java domainates in banking,health care,mission critical entriprise systems where reliability non negotiable.

7.Multithreaded 
Java allows multiple threads to execute simultaneously using the thread class or runnable interface.This improves responsiveness 
and CPU utilization in applications like web servers and banking systems.

8.High Performance 
Although java is an interpreted language,performance is improved by Just-in-time compiler(JIT), which compiles frequently used bytecode 
into native machine code during runtime. 

9.Distributed 
Java provides built in support for network programming through packages java.net making it suitable for distributed applications and client
server architectures.

10.Portable 
Java ensures consitent behaviour across different platforms because primitive data types have fixed sizes and bytecode is standardized.

11.Dynamic 
Java supports dynamic class loading and reflection,allowing classes and methods to be loaded and inspected at runtime making applications 
even more flexible.

Java is platform independent becauses it uses bytecode executed by the JVM.It is object-oriented,supporting encapsulation,inheritance,
polymorphism and abstraction.Java is simple becuase it removes complex features like pointer arithmetic.It is secure through bytecode 
verification and the JVM,robust with exception handling and garbage collection,multithreaded for concurrent execution high performance 
due to JIT compiler,distributed with built-in networking APIS,portable across platforms and dynamic through runtime class loading and 
reflection.





