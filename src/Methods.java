import com.sun.deploy.util.StringUtils;

import java.lang.Math;
import java.util.Random;

public class Methods
{

    public static void main(String args[])
    {
        //System.out.println(calculateSquare(15));
        //System.out.println(calculateSquareRoot(25));
        //System.out.println(lowerCase("LONDON"));
        //System.out.println(isMultiple(10, 3));
        //prettyInteger(5);
        System.out.println(random(1, 10));

    }

    public static int calculateSquare(int num)
    {
        return num * num;
    }

    public static double calculateSquareRoot(int num)
    {
        //        double sq;
        //        double sqroot = num / 2;
        //        do
        //        {   sq = sqroot;
        //            sqroot = (sqroot + (num / sqroot)) / 2;}
        //            while((sq - sqroot) != 0);
        //        return sqroot;

        return Math.sqrt(num);
    }

    public static String lowerCase(String name)
    {
        return name.toLowerCase();
    }

    public static boolean isMultiple(int num1, int num2) {
        if(num1 % num2 == 0)
            return true;
        else
            return false;
        }

    public static void prettyInteger(int num){
            String asterisk = "";
        for (int i = 0; i< num; i++)
            asterisk += "*";
        System.out.println(asterisk + num + asterisk);
        }

    public static int random(int num1, int num2){
        Random random = new Random();
        return num1 = random.nextInt(num2) + 1;
    }
}

