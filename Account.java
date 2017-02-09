package mustangbanking;

public class Account {

    int id;
    double interestRate;
    Balance balance;

    Account(int i, double r, Balance b)
    {
      id = i;
      interestRate = r;
      balance = b;
    }
    
    public int getId()
    { return id; }
    
    public void setId(int i)
    { id = i; }
    
    public double getInterestRate()
    { return interestRate; }
    
    public void setInterestRate(double r)
    { interestRate = r; }
    
    public void deposit(double dep)
    { balance.setBalance(balance.getBalance() + dep); }
  
    public void withdraw(double dep)
    { 
      if(balance.getBalance() < dep)
        System.out.println("Insufficient funds available.");
      else balance.setBalance(balance.getBalance() - dep); 
    }
  
    public void displayAccount()
    {
      System.out.println("Account ID: " + id +
                         " \nCurrent Balance: " + balance.getBalance() +
                         " \nInterest Rate: " + interestRate);
    }
}