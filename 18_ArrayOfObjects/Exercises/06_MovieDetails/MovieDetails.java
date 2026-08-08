import java.util.*;
class Movie 
{
      String title;
      double rating;

      void acceptDetails(Scanner sc)
      {
           System.out.print("Enter movie title: ");
           title = sc.nextLine();


           System.out.print("Enter rating of the movie: (0 - 100) ");
           rating = sc.nextDouble();
           sc.nextLine();

      }

      void sortMovieByRating(Movie[] arr)
      {
           int n = arr.length;
           for(int i = 0; i < n-1; i++)
           {
               int maxIndex = i;
               for(int j = i + 1; j < n; j++)
               {
                    if(arr[j].rating > arr[maxIndex].rating)
                    {
                          maxIndex = j;
                    }
               }

               if(maxIndex != i)
               {
                   Movie temp = arr[i];
                   arr[i] = arr[maxIndex];
                   arr[maxIndex] = temp;

               }
           }
      }

      void printMoviesByRating(Movie[] arr)
      {
         for (int i = 0; i < arr.length; i++)
        {
            System.out.println("\n---------------Printing movies sorted by rating (Descending)-----------------");
            System.out.println((i + 1) + ". Movie Title: " + arr[i].title + " | Movie Rating: " + arr[i].rating);
        }
      }
      

}
class MovieDetails 
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter size of array: ");
     int size = sc.nextInt();
     sc.nextLine();


     if(size > 0)
     {
         Movie[] arr = new Movie[size];
         for(int i=0;i<arr.length;i++)
         {
             arr[i] = new Movie();
             arr[i].acceptDetails(sc);
         }
          
          Movie obj = new Movie();
          obj.sortMovieByRating(arr);
          obj.printMoviesByRating(arr);
     
     }
     else 
     {
          System.out.println("Invalid Size! Please enter size greater than zero.");
     }

     
    }
}