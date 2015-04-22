/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    Cat garfield = new Cat("Garfield");
    Cat pink = new Cat("PinkPanther");
    Cat woman = new Cat("CatWoman");

    garfield.setFavoriteFood("lasagna");
    pink.setFavoriteFood("pizza");
    woman.setFavoriteFood("salad");
    garfield.setAge(5);
    pink.setAge(7);
    woman.setAge(3);


      //System.out.println(isOlder(garfield, woman));
      //isBestFriends(garfield, pink);
      //System.out.println(makeKitten(garfield, pink).getName() + " is " + makeKitten(garfield, pink).getAge() + " old.");


  }

  public static boolean isOlder(Cat cat1, Cat cat2){
     return (cat1.getAge() > cat2.getAge());
  }

  public static void isBestFriends(Cat cat1, Cat cat2) {
      cat2.setFavoriteFood(cat1.getFavoriteFood());
      System.out.println(cat2.getFavoriteFood());
  }

  public static Cat makeKitten(Cat cat1, Cat cat2){
      Cat kitten = new Cat();
      kitten.setName(cat1.getName() + cat2.getName());
      kitten.setAge(0);
      return kitten;
  }

  public static void adoption(Cat cat, Person owner){

  }
}
