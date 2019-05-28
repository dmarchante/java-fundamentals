import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    int dogCount = 1;
    int catCount = 2;
    int turtleCount = 0;
    int flips = 2;

    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(flips);

    clock();
  }

  public static String pluralize(String animal, int amount) {
    if (amount == 1) {
      return animal;
    } else {
      return animal + 's';
    }
  }

  public static void flipNHeads(int n) {
    int flipCount = 0;
    int headCount = 0;
    
    while (headCount < n) {
      double flipResult = Math.random();

      if (flipResult > .5) {
        headCount++;
        flipCount++;
        System.out.println("heads");
      } else {
        headCount = 0;
        flipCount++;
        System.out.println("tails");
      }
    }

    System.out.println("It took " + flipCount + " " + pluralize("flip", flipCount) + " to flip " + n + " " + pluralize("head", flipCount) + " in a row.");
  }

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();

    while (true) {
      if (LocalDateTime.now().getSecond() != now.getSecond()) {
        LocalDateTime current = LocalDateTime.now();
        String time = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        System.out.println(time);
        now = LocalDateTime.now();
      }
    }
  }
}
