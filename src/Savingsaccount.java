//joshua stojkovic
public class SavingsAccount extends BankAccount {
    private double rate;

    public SavingsAccount(String accountName, String accountID, double rate) {
        setAccountName(accountName);
        setAccountNumber(accountID);
        setRate(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        float lowRate = getLowRate();
        float highRate = getHighRate();

        if (rate < lowRate)
            this.rate = lowRate;
        else if (rate > highRate)
            this.rate = highRate;
        else
            this.rate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * (rate / 100);
        deposit((float) interest);
    }

    @Override
    public void printDetails() {
        System.out.println("the account is name: " + getAccountName());
        System.out.println("the account ID: " + getAccountNumber());
        System.out.println("the baalance: " + getBalance());
        System.out.println("the account type: savings");
        System.out.println("rate: " + rate + "%");
    }
}
