/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
      Person andrew = new Person("Andrew");
      Person anna = new Person("Anna");

      //System.out.println(isOdd(3));
      //System.out.println(isMultipleOfThree(12));
      //System.out.println(isOddAndIsMultipleOfThree(12));
      //System.out.println(isOddAndIsMultipleOfThree2(15));
      //fizzMultipleofThree(12);
      //longName(anna);

  }
  public static boolean isOdd(int num){
      return(num%2 !=0);
  }

  public static boolean isMultipleOfThree(int num){
      return(num%3 == 0);
  }

  public static boolean isOddAndIsMultipleOfThree(int num){
      return ((num%3==0) && (num%2 !=0));
  }

  public static boolean isOddAndIsMultipleOfThree2(int num){
      return ((isOdd(num)) && (isMultipleOfThree(num)));
  }

  public static void fizzMultipleofThree(int num){
      if(num%3 == 0)
            System.out.println("fizz");
      else  System.out.println(num);
  }

  public static boolean isFromLondon(Person person){
      return (person.getCity().equalsIgnoreCase("London"));
  }
  public static void longName(Person person){
      int name = person.getName().length();
      if(name > 4) {
          System.out.println(person.getName());
      }else {
          System.out.println("Name is too short.");
      }
      }
  }

