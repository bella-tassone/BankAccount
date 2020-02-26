public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int id, double startBal, double ir) {
        super(id, startBal);
        interestRate = ir;
    }

    public void withdraw(double amount) {
        if(amount <= currentBalance()) {
            decreaseBalance(amount);
        }
    }

    public double monthlyInterest() {
      double a = (currentBalance()*interestRate);
      a/=12.0;
      return a;
    }
}
