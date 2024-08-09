import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Which of the following Java features ensures that objects are properly cleaned up when they are no longer needed?";
        String choiceOne = "a) Garbage Collection";
        String choiceTwo = "b) Automatic Variable Scoping";
        String choiceThree = "c) Memory Pools";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (choice.isEmpty()) {
            System.out.print("Your choice: ");
            choice = input.nextLine();
        }

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (choice.equals("a")) {
            System.out.println("congrats! your answer is correct");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else{
            System.out.println("Your answer is incorrect!\nAnswer is: " + correctAnswer);
        }
    }

}
