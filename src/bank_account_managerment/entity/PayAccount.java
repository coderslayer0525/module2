package bank_account_managerment.entity;

public class PayAccount extends BanksAccount{
    private int dailyTransferLimit;

    public int getDailyTransferLimit() {
        return dailyTransferLimit;
    }

    public PayAccount(int idCard, String user, int balance, int dailyTransferLimit) {
        super(idCard, user, balance);
        this.dailyTransferLimit = dailyTransferLimit;
    }

    public void setDailyTransferLimit(int dailyTransferLimit) {
        this.dailyTransferLimit = dailyTransferLimit;
    }

    public PayAccount(){
    }
    @Override
    public String toString(){
        return "Pay Account-{"+
                "=STK=" + getIdCard() +
                "=USER=" + getUser() +
                "=BALANCE=" + getBalance() +
                "=DAILYLITMIT=" + getDailyTransferLimit() +
                "}-";
    }
}
