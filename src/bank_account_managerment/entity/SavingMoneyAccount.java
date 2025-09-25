package bank_account_managerment.entity;

public class SavingMoneyAccount extends BanksAccount{
    private int timeDeposit;
    private  int interestRate;

    public SavingMoneyAccount(int timeDeposit, int interestRate) {
        this.timeDeposit = timeDeposit;
        this.interestRate = interestRate;
    }

    public SavingMoneyAccount(int idCard, String user, int balance, int timeDeposit, int interestRate) {
        super(idCard, user, balance);
        this.timeDeposit = timeDeposit;
        this.interestRate = interestRate;
    }

    public int getTimeDeposit() {
        return timeDeposit;
    }

    public void setTimeDeposit(int timeDeposit) {
        this.timeDeposit = timeDeposit;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public SavingMoneyAccount() {

    }
    @Override
    public String toString(){
        return "Saving Account-{" +
                "=STK=" + getIdCard() +
                "=USER=" + getUser() +
                "=BALANCE=" + getBalance() +
                "=TIMEDEPOSIT=" + getTimeDeposit() +
                "=INTERESTRATE=" + getInterestRate()+
                "}-";
    }
}
