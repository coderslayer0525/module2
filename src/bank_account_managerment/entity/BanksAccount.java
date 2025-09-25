package bank_account_managerment.entity;

public abstract class BanksAccount {
    private static int idCard;
    private String user;
    private int balance;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public BanksAccount() {
    }

    public BanksAccount(int idCard, String user, int balance) {
        this.idCard = idCard;
        this.user = user;
        this.balance = balance;

    }
}
