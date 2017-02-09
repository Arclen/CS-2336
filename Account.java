package mustangbanking;

public class Account {

  private:
    int id;
    double interestRate;
    Balance balance;
    
  public:
    Account(int i, double r, Balance b)
    {
      id = i;
      InterestRate = r;
      balance = b;
    }
    
    int getId()
    { return id; }
    
    void setId(int i)
    { id = i; }
    
    double getInterestRate()
    { return interestRate; }
    
    void setInterestRate(double r)
    { interestRate = r; }
    
    void deposit(double dep)
    { balance.setBalance(balance.getBalance() + dep); }
  
    void withdraw(double dep)
    { 
      if(balance.getBalance() < dep)
        System.out.println("Insufficient funds available.");
      else balance.setBalance(balance.getBalance() - dep); 
    }
  
    void displayAccount()
    {
      System.out.println("Account ID: " + id +
                         " \nCurrent Balance: " + balance.getBalance() +
                         " \nInterest Rate: " + interestRate);
    }
}
