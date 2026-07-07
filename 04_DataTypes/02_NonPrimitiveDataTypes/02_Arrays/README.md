</>Markdown

### What is an array
    An array is a fixed size container holding multiple values of same type,stored together as a single object.

### Declaring and creating 

     int[] numbers;   //declare: "numbers will point to an array"
     numbers = new int[5]; // create: an array object holding 5 ints, all default values 0 

     int[] scores = new int[5];      // declare + create in one line 
     int[] marks = {90,80,70,60,50}; // declare + create + intialize with values directly 

### Indexing(starts at 0!)
     
     int[] marks = {90,80,70,60,50};

     System.out.println(marks[0]) // 90(first element)
     System.out.println(marks[4]) // 50(last element)

     marks[1]=100 //updates second element 

     The first index is always 0,not 1.The last index is length-1.

     The .length field(not a method)

     System.out.println(marks.length) // 5 

     Note:no parentheses.unlike string's.length()(a method) array.length is a field.

### ArrayIndexOutOfBoundsException
    
    int[] marks = {90,80,70};
    System.out.println(marks[3]) // CRASH - valid indices are only 0,1,2

### Default values inside arrays 
    
    when you create an array without intializing values java fills it with default value of that type
    
    int[] nums = new int[3];                 //[0,0,0]
    boolean[] flags = new boolean[3];        //[false,false,false]
    String names = new String[3];            //[null,null,null]

### Arrays can hold reference type 
   
    String[] names = {"Joe","Jack","Jones"};
    Student[] classroom = new Student[3]; // array of Student objects (each slot starts as null)

    keyPoints 
    .Fixed size once created cannot grow or shrink an array.
    .Index starts at 0 and ends at length-1
    .length is a field,not a method(no parentheses).
    .Arrays are references types themselves - even int[] is an object living in the Heap.
    .Numeric arrays default to 0 boolean arrays default to false, object arrays default to null.

    


