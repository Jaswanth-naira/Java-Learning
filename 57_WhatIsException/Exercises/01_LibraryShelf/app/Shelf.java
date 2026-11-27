package app;
import java.util.Arrays;
public class Shelf 
{
      private final String[] titles;

      public Shelf(String[] titles)
      {
           this.titles = Arrays.copyOf(titles, titles.length);
      }

      public String titleAt(int slot)
      {
          return titles[slot];
      }

      public int titleLength(int slot)
      {
           return titles[slot].length();
      }

      public boolean hasTitle(int slot)
      {
          return slot >= 0 && slot < this.titles.length && this.titles[slot] != null;
      }
}