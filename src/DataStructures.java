/**
 * Created by alexandraqin on 4/14/15.
 */

import java.util.ArrayList;

public class DataStructures {

  public static void main (String args[]) {

      //printCat(cats());
      mostFrequentElement();


  }
    public static ArrayList<Cat> cats()
    {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat garfield = new Cat("Garfield");
        Cat yingyang = new Cat("Yingyang");
        Cat cat = new Cat("Cat");
        Cat luna = new Cat("Luna");
        Cat artemis = new Cat("Artemis");

        cats.add(garfield);
        cats.add(yingyang);
        cats.add(cat);
        cats.add(luna);
        cats.add(artemis);

        return cats;
    }

    public static void printCat(ArrayList<Cat>cats){
        for (Cat cat : cats ){
            System.out.println(cat.getName());
        }
    }

    public static void mostFrequentElement(){

        int [] element = new int []{1, 2, 5, 3, 7, 7, 7, 9};

        int count = 1, tempCount;
        int most = element [0];
        int temp = 0;

        for (int i = 0; i < (element.length - 1); i++)
        {
            temp = element[i];                      // store the digit and loop through the list for doubles
            tempCount = 0;
            for (int j = 1; j < element.length; j++)
            {
                if (temp == element[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                most = temp;
                count = tempCount;
            }
        }
        System.out.println("The most popular number is: " + most + " It appears in the list: " + count + " times.");

    }
}
