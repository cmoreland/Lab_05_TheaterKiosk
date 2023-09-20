import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age as an integer: ");
        if (in.hasNextInt()){
            int age = in.nextInt();
            if (age >= 21){
                System.out.println("You are 21 or older. You get a wrist band.");
            }
            else{
                System.out.println("You are under 21. Have fun!");
            }
        }
        else {
            System.out.println("Invalid input. Try again.");
        }
    }
}