public class CheckingAccount extends Account {

    /**
     * @param idNumber
     * @param startBal
     */
    private double checkCharge;

    public CheckingAccount(int idNumber, double startBal, double cc) {
        super(idNumber, startBal);
        // TODO Auto-generated constructor stub
        checkCharge = cc;
    }

    public void clearCheck(double amount)
    {
        decreaseBalance(amount + checkCharge);
    }
    /* (non-Javadoc)
     * @see Account#monthlyInterest()
     */
    @Override
    public double monthlyInterest() {
        // TODO Auto-generated method stub
        return 1.0;
    }

}