/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables
{

    public static void main(String args[])
    {
        int room = 113;
        double value = 2.71828;
        String subject = "Computer Science";

        System.out.println("This is room #: " + room);
        System.out.println("e is close to " + value);
        System.out.println("I am learning a bit about " + subject);
      //  System.out.println(isOdd(5));
      //  printHelloWorld();
      //  System.out.println(greatestCommonFactor(50, 18));
    }

    public static boolean isOdd(int number) { // Returns true or false.
            if(number % 2 != 0)
                return true;
            else
                return false;
        }

    public static void printHelloWorld() { //It does not need to return anything.
        System.out.println("Hello World");
    }

    public static int greatestCommonFactor(int num1, int num2 ){  // Returns an integer.
        while(num1!=0 && num2!=0) {
            int num3 = num2;
            num2 = num1%num2;
            num1 = num3;
        }
            return num1+num2;
    }

}


