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
    
    
}
