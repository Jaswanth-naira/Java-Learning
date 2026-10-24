package app;
import zoo.Animal;
import zoo.Cat;
import zoo.Dog; 

public class ZooApp 
{
    private static int countDogs(Animal[] animals)
    {
        int count = 0;
        for(Animal animal: animals)
        {
            if(animal instanceof Dog) count++;
        }
        return count;
    }

    private static int totalTricks(Animal[] animals)
    {
        int total = 0;
        for(Animal animal : animals)
        {
           if(animal instanceof Dog) total += ((Dog) animal).getTricks();
        }
        return total;
    }
    public static void main(String[] args)
    {
        Animal[] zoo = new Animal[] {
                       new Dog("Rex",3),
                       new Cat("Tom"),
                       new Animal("Generic"),
                       new Dog("Bolt",5),
                       null
        };

        for(Animal animal: zoo)
        {
            if(animal != null) 
            {
                System.out.println(animal.getName() + " " + animal.sound());
            }
        }

        System.out.println(countDogs(zoo));
        System.out.println(totalTricks(zoo));

        Animal first = zoo[0];
        Dog rex = (Dog) first;
        System.out.println(rex.getTricks());
        System.out.println(first instanceof Cat);
        System.out.println(zoo[4] instanceof Animal);
    }
}