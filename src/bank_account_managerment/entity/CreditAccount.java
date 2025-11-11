package bank_account_managerment.entity;

public class CreditAccount extends BanksAccount {
    private int loanLimit;
    private  int outstandingBalance;

    public CreditAccount(int idCard, String user, int balance, int outstandingBalance) {

    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    public int getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(int outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public CreditAccount(int idCard, String user, int balance, int loanLimit, int outstandingBalance) {
        super(idCard, user, balance);
        this.loanLimit = loanLimit;
        this.outstandingBalance = outstandingBalance;
    }

    public CreditAccount(){
    }
    @Override
    public String toString() {
        return "Credit Account-{" +
                "=STK=" + getIdCard() +
                "=USER=" + getUser() +
                "=BALANCE=" + getBalance() +
                "=LOAN=" + getLoanLimit() +
                "=OSDB=" + getOutstandingBalance()+
                "}-";
    }
}
