public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! From Amy!");
        System.out.println("Welcome to CS 112!");

        System.out.println("Jan 29 class");
        
        printNumber();
    }
//static method returns a number times ten
    public static int timesTen(int number) {
        return number * 10;
    }
//static method void
    public static void printNumber(){
        int number = 5;
        System.out.println("Number " + number +" times 10 equals to " + timesTen(number));
    }

    //comment
    System.out.println("Change");
}
