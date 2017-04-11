/*
Following Exercise 5, create a new Dog reference and assign it to spot’s object.
 Test for comparison using == and equals( ) for all references.
 */
public class Exercise6 {
    private static class Dog {
        private String name, says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }
    public static void main(String...args){
        Exercise6.Dog firstDog = new Exercise6.Dog("spot", "Ruff!");
        Exercise6.Dog secondDog = new Exercise6.Dog("scruffy", "Wurf!");
        Exercise6.Dog third;

        third = firstDog;

        if(third == firstDog){
            System.out.println("dogs are equal");
        } else System.out.println("dogs are different");

        if(third.equals(firstDog)){
            System.out.println("dogs are equal");
        } else System.out.println("dogs are different");
        }



    }



