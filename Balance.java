package mustangbanking;

public class Balance {

  private double bal;
  
  public Balance()
  { bal = 0.0; }
    
  public Balance(double b)
  { bal = b; }
    
  public double getBalance()
  { return bal; }
  
  public void setBalance(double b)
  { bal = b; }
}