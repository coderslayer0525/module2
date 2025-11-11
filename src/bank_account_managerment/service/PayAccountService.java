package bank_account_managerment.service;

import bank_account_managerment.entity.PayAccount;

import java.util.ArrayList;

public class PayAccountService implements IPayAccountService{
    ArrayList<PayAccount> payAccountArrayList = new ArrayList<>();
    @Override
    public ArrayList<PayAccount> findAll() {
        return payAccountArrayList;
    }

    @Override
    public boolean add(PayAccount payAccount) {
        return payAccountArrayList.add(payAccount);
    }

    @Override
    public boolean delete(int idCard) {
        for(PayAccount payAccount : payAccountArrayList){
            if (payAccount.getIdCard()== idCard){
                payAccountArrayList.remove(payAccount);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int idCard, PayAccount payAccount) {
        for (int i = 0; i < payAccountArrayList.size(); i++) {
            if (payAccountArrayList.get(i).getIdCard() == new PayAccount().getIdCard()) {
                payAccountArrayList.set(i, new PayAccount());
            }
        }
        return false;
    }

    @Override
    public PayAccount findByName(String user) {
        for (int i = 0; i < payAccountArrayList.size(); i++) {
            if (payAccountArrayList.get(i).getUser().equals(user)) {
                return payAccountArrayList.get(i);
            }
        }
        return null;
    }
}
