</> Markdown
### Interface 

 . An interface is a contract that specifies what methods a class
   must implement without describing how they should be implemented. Any class that implements an interface agress to provide the implementation for all of its abstract methods.

   interface Animal
   {
        void makeSound();
    }       
       
### Implementing an interface 

    class Dog implements Animal 
   {
     public void makeSound()
    {
        System.out.println(":Woof!");
    }
   }

    class Cat implements Animal 
   {
    public void makeSound()
    {
        System.out.println("Meow!");
    }
   }

### Why this is powerful 

   A variable of the interface type can point to any object that implements it

   Animal a1 = new Dog();
   Animal a2 = new Cat();

   a1.makeSound();
   a2.makeSound();

   This means you can write code that works with "any animal" without caring whether its actually a Dog,Cat or some other animal or becuase the variable type is animal,it can refer to any object that implements the Animal interface.

   ```
   Animal
      ▲
      |
   --------
   |       |
   |       |
   Dog     Cat
  ```
### Key points - Interfaces 

    .Cannot create objects directly:
     Animal a = new Animal() is illegal.
    .A class implements an interface and must provide real code for every method.
    .Enables writing flexible code that works with many different object types through one common reference type.
    .Built in java types like List,Runnable,Comparable.
    .Before Java 8,Interfaces could contain only abstract methods.
    .Since Java 8,Interfaces can also have default and static methods.
    .Since Java 9,private methods also allowed.

Class                              Interface
Has implementation                 Declares behaviour
Objects can be created             Cannot instantiate directly
Uses extends                       Uses implements
Constructors allowed               Constructors not allowed.

