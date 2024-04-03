//Freya Barclay

public class CurrentAccount extends BankAccount {

    private int overdrawAmount;

    public CurrentAccount(String accountName, String accountId, int overdrawAmount){
        super(accountName, accountId);
        this.overdrawAmount = setOverdrawAmount(overdrawAmount);
    }

    public int setOverdrawAmount(int inputAmount) {
        if(inputAmount < 0){
            overdrawAmount = 0;
            return overdrawAmount;
        }
        if(inputAmount > 300){
            overdrawAmount = 300;
            return overdrawAmount;
        }
        overdrawAmount = inputAmount;
        return overdrawAmount;
    }

    public int getOverdrawAmount() {
        return overdrawAmount;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount > (getBalance() + overdrawAmount)){
            return false;
        }
        System.out.println(super.withdraw(amount));
        return super.withdraw(amount);
    }

    public void printDetails(){
        System.out.println(
                "Account Name: " + getAccountName() + "\n" +
                        "Account id: " + getAccountNumber() + "\n" +
                        "Balance: " + getBalance() + "\n" +
                        "Account type: Current/n " + "\n" +
                        "Overdraw: " + overdrawAmount + "\n"
        );
    }
}
