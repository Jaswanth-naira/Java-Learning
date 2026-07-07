</> Markdown

### Classes and Objects 

- what is a class?
  A class is a blueprint.It defines what data(fields) and behaviour(fields) something will have - but a class by itself is not usable data.
  It just a description.

     Ex: class Student 
         {
           String name;
           int age;

           void introduce()
           {
            System.out.println("Hi, I'm "+name);
           }  
         }

         This says:Every student will have name,age and can introduce() itself.No Student exits yet.

- what is an object?
  An object is an actual thing built from that blueprint created using new keyword.

      Student s1 = new Student();
      s1.name = "Joe";
      s1.age = 20;
      s1.introduce();
    
      Piece                                           Meaning 
      new Student()                                   Build a real Student object in the heap.
      Student s1                                      Declare a variable that can hold a reference to a student 
      s1.name = "Joe"                                 Go to the object s1 points to,set its name field
      s1.introduce()                                  Go to the object s1 points to,run its method.

- One blueprint many objects 

      Student s1 = new Student();
      Student s2 = new Student();

      s1.name = "Joe";
      s2.name = "Harry";

      what happening in memory?

      STACK                                               HEAP
      -----                                               ----
      s1 --------------------------------------->         [student object #1]
                                                          [name "Joe"]
      s2 --------------------------------------->         [student object #2]
                                                          [name "Harry"] 
      .s1 and s2 are reference variables that lives in the stack.They are small - each one just hold an address.
      .The actual objects(with name and age fields)lives in the Heap - one object per new student() call.

      s1 and s2 are the references sitting in the stack the objects they point to are what's in the Heap.Two separate new cells
      create two independent objects changing one never affect other

### NullPointerException 
    Student s3;// just created, no object yet - s3 is null
    System.out.println(s3.name); CRASH: NullPointerException 

    Since s3 doesnt point to any real object trying to access .name on it fails at runtime.Most common errors in java always caused by trying to use a reference that is null. 

    Key points:
      .A class = blueprint(compile-time concept,no memory used by itself)
      .An object = actual instance in Heap memory(created via new)
      .A reference variable = the "key" point to that object(lives in the stack).
      .Multiple objects from the same class are independent.
      .Using a null reference->NullPointerException.
                                                                               
 