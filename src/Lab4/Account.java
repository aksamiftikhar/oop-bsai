package Lab4;

// dev: SP21-BCS-007
public class Account {
    static int count = 0;
    public static void main(String[] args) {
        Account[] accArr = new Account[3];
        // title, bal
        Account acc = new Account("xYZ", 300);

        addAccount(accArr, acc);

        addAccount(accArr, acc);

    }
    Account searchAccount(Account [] accountArr, int accountID )
    {
        for(Account ac: accountArr)
        {
            if(ac.id == id)
                return ac;
        }
        return null;
    }
    public static boolean addAccount(Account[] accArr, Account acc)
    {
        if(count<accArr.length)
        {
            accArr[count] =  acc;
            count = count+1;
            return true;
        }
        else
            return false;
    }
    private String accountTitle;
    private double balance;
    private int id;

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Constructors
    public Account(String accountTitle) {
        this.accountTitle = accountTitle;
        this.balance = 500;
    }
    
    public Account(String accountTitle, double balance) {
        this.accountTitle = accountTitle;
        this.balance = balance;
    }
    // Getter
    public String getAccountTitle() {
        return accountTitle;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Print Balance
    public void printBalance() {
         System.out.println("Your Current Balance is: " + balance + "$");
    }
    
    // Deposit
    public void deposit(double amount){
        if (amount > 0 )
            this.balance = this.balance + amount;
    }
    
    // Withdraw balance
    public void withdrawBalance(double amount){
        this.balance = this.balance - amount;
    }
}

