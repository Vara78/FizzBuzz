package pack;

// Fizz Buzz is a group word game that teaches division to children.
// Each player takes a turn counting down from three to five,
// substituting any number divisible by three with the word "fizz"
// and any number divisible by five with the word "buzz."

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}