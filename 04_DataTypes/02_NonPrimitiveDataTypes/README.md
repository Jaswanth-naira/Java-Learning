</> Markdown 

Non-primitive types are called reference types because the variable doesnt store the actual data - it stores a reference (memory address) pointing to where the actual object lives in memory(heap).They are created by users and include types such as String,Object,Interface,Class and Array.

Primitives are effecient for storing simple values such as numbers and characters.Reference types are used when data become complex such as text,collections and objects.

### Core Categories 

- 1.Class 
    A Class is a user defined blueprint that defines variables and methods. It represents a type of object and forms object oriented programming. Any type defined using class keyword including built ones String,Scanner,Array List. 
  
        Ex: String name = "Java";
            Student s = new Student();

- 2.Arrays
    A collection of elements of same type(primitive or reference) stored in a single object.

        Ex:int[] numbers = {1,2,3,4,5};
           String[] names = {"Alice","Bob"};
           Yes - even an array of primitives like int[] is itself a reference type.The array object holds the ints, but the variable holding
           the array is a reference.

- 3.Interfaces 
    A contract of method signatures without implementation(until java 8 added default methods).You cant instantiate an interface directly,
    but variables can hold references to object that implements it.
    
         Ex:List<Integer> list = new ArrayList<>();
            Runnable task = () -> System.out.println("running");

### How Reference Types differ from Primitives 

     Aspect                                   Primitive                              Reference 
     What's stored in the variable            The actual value                       A reference(address) to an object.
     Where the data lives                     stack                                  Object lives in Heap, reference lives in stack 
     Default value(unassigned field)          0,false,'u\0000'                       null
     created with new                         Never                                  Usually yes except string literals,arrays 
     Has methods                              No                                     Yes- every reference type inherits from object
     Can be null                              No                                     Yes(object have methods)
     Comparision with ==                      Compares actual values                 Compares memory address(not content)
     Size                                     Fixed(known at compile time)           Variable(depends on object)

### Common Reference types 
    .String
    .Arrays
    .Classes
    .Objects
    .Interfaces
    .Enums
    .Collections(ArrayList,Hashmap)

### Characterstics of reference types
    . Store references instead of actual values.
    . Objects are stored in Heap memory.
    . Can contains fields and methods.
    . Can be assigned null.
    . Size depends on the object.
    . Created using class
    . Compared using references unless method like equals() are used.

 Note: A reference variable and the object it points to are different things. The variable stores the reference, while the object itself lives in heap memory.