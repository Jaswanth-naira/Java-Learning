</> Markdown 

Non-primitive types are called reference types because the variable doesnt store the actual data - it stores a reference (memory address) pointing to where the actual object lives in memory(heap).They are created by users and include types like string,object,Interface,class 
and Array.

### Core Categories 

- 1.class 
  A class is a user defined blueprint that defines variables and methods. It represents a type of object and forms object oriented programming. Any type defined using class keyword including built ones String,Scanner,Array List. 
  
    Ex: String name = "Java";
        Student s = new Student();

- 2.Arrays
  A collection of elements of same type(primitive or reference) stored in a single object.

    Ex:int[] numbers = {1,2,3,4,5};
       String[] names = {"Alice","Bob"};
       Yes - even an array of primitives like int[] is itself a reference type.The array object holds the ints, but the variable holding
       the array is a reference.
