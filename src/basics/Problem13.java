package basics;

public class Problem13 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sanjay C", 100);
        System.out.println(account1);
        account1.deposit(100);
        account1.withdraw(250);
        System.out.println(account1);
    }
}

class BankAccount {
    private String accountHolder;
    private int balance = 0;

    BankAccount(String Acc, int balance) {
        this.accountHolder = Acc;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You Deposited $" + amount);
        } else {
            System.out.print("Amount must be greater than 0");
        }
    }

    void withdraw(int Withdrawamount) {
        if (Withdrawamount > 0 && Withdrawamount <= balance) {
            balance -= Withdrawamount;
            System.out.println("You Withdrew $" + Withdrawamount);
        } else {
            System.out.println("InSufficient Funds \nTry again ");
        }
    }

    public String toString() {
        return "Account Holder: " + accountHolder + ", Balance: $" + balance;
    }

}
