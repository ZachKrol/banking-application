import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        while (a != 13) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            if(scanner.hasNextInt()){
                a = scanner.nextInt();
            }
            else {
                System.out.println("You didn't enter an integer.... meanie!\n");
                continue;
            };
            System.out.println("OMG! You entered: " + a + "\n");
        }
        System.out.println("Unlucky 13! yikes!");
    }
}
