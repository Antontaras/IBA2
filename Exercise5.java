/*
 Create a class called Dog containing two Strings: name and says.
 In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
  Then display their names and what they say.
 */
public class Exercise5 {

    private static class Dog {
        private String name, says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }
      public static void main(String...args){
         Dog firstDog = new Dog("spot", "Ruff!");
         Dog secondDog = new Dog("scruffy", "Wurf!");

         print(firstDog);
         print(secondDog);
      }
      public static void print(Dog dog){
          System.out.println("dog's name is "+ dog.name+ ", " + "it says: " + dog.says);
      }

}
