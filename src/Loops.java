
public class Loops
{

    public static void main(String args[])
    {
        onetoten();
        //diffonetoten();
        //printN(25);
        //printEven(20);
        //printAdd();
        //printAddN(10000);
        //printNumAndStr(1, "April");
        //concatenate(10, "hello");
        //fib();
        //fibSum();
        //fibInt(5);

    }

    public static void onetoten()
    {
        for(int i = 1; i < 11; i++)
        {
            System.out.println(i);
        }
    }


    public static void diffonetoten()
    {
        int count = 0;
        while(count < 10)
        {
            count++;
            System.out.println(count);
        }
    }


    public static void printN(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }
    }


    public static void printEven(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            if(i % 2 != 0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    public static void printAdd()
    {
        int sum = 0;

        for(int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void printAddN(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printNumAndStr(int num, String name)
    {
        if(num > 0)
        {
            for(int i = 1; i <= num; i++)
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("");
        }
    }

    public static void concatenate(int num, String name)
    {
        if(num > 0)
        {
            for(int i = 1; i <= num; i++)
            {
                System.out.print(name);
            }
        }
        else
        {
            System.out.print("");
        }
    }

    public static void fib()
    {
        int fib1 = 1;
        int fib2 = 0;
        int sum;
        for(int i = 0; i <= 9; i++)
        {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;

            System.out.println(sum);
        }
    }

    public static void fibSum()
    {
        int fib1 = 1;
        int fib2 = 0;
        int sum = 0;

        for(int i = 1; i <= 9; i++)
        {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            sum+= fib1;
        }
        System.out.println(sum - 1);
    }

    public static void fibInt(int num)
    {
        int fib1 = 1;
        int fib2 = 0;
        int sum = 0;

        for(int i = 0; i <= num; i++)
        {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            sum+= fib1;
        }

        System.out.println(sum - 1);
    }
}