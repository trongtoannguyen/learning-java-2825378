public class Account {
    
    public Account(int balance) {
        this.balance = balance;
    }

    // Variable representing current balance
    private int balance = 0;

    public void withdraw(int amount) {
        // Implement withdrawal logic
        balance -= (amount <= balance) ? amount : 0;
    }
    
    public void deposit(int amount) {
        // Implement deposit logic
        balance += (amount > 0) ? amount : 0;
    }
    
    public int getBalance() {
        // Implement logic to return current balance
        return balance;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + "]";
    }

    
}
