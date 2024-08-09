import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's take an input...");
        String text = input.nextLine();
        char result = Answer.findLastCharacter(text);
        System.out.println("Result: " + result);
        input.close();
    }
}
