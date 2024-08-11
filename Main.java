/**
 * Main
 */
public class Main {

    static int testScenario(int balance, int depositAmount, int withdrawAmount){
        Account acc = new Account(balance);
        acc.deposit(depositAmount);
        acc.withdraw(withdrawAmount);
        System.out.println(acc.toString());
        return acc.getBalance();
    }

    public static void main(String[] args) {
        // This is how your code will be called.
        // You can edit this code to try different testing cases.
        int balance = 50;
        int depositAmount = 50;
        int withdrawAmount = 10;
        int result = testScenario(balance, depositAmount, withdrawAmount);
        System.out.println(result);
    }
}