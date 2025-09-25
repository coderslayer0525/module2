package bank_account_managerment.service;

import bank_account_managerment.entity.SavingMoneyAccount;

import java.util.ArrayList;

public class SavingMoneyService implements ISavingMoneyService{
    ArrayList<SavingMoneyAccount> savingMoneyAccountArrayList = new ArrayList<>();

    @Override
    public ArrayList<SavingMoneyAccount> findAll() {
        return savingMoneyAccountArrayList;
    }

    @Override
    public boolean add(SavingMoneyAccount savingMoneyAccount) {
        return savingMoneyAccountArrayList.add(savingMoneyAccount);
    }

    @Override
    public boolean delete(int idCard) {
        for (SavingMoneyAccount savingMoneyAccount : savingMoneyAccountArrayList){
            if (SavingMoneyAccount.getIdCard()== idCard){
                savingMoneyAccountArrayList.remove(savingMoneyAccount);
            }
        }
        return false;
    }

    @Override
    public boolean update(int idCard, SavingMoneyAccount savingMoneyAccount) {
        for ( int i = 0; i < savingMoneyAccountArrayList.size();i++){
            if (savingMoneyAccountArrayList.get(i).getIdCard()== new SavingMoneyAccount().getIdCard()){
                savingMoneyAccountArrayList.set(i, new SavingMoneyAccount());
            }
        }
        return false;
    }

    @Override
    public SavingMoneyAccount findByName(String user) {
        for (int i = 0; i < savingMoneyAccountArrayList.size() ; i++) {
            if(savingMoneyAccountArrayList.get(i).getUser().equals(user)){
                return savingMoneyAccountArrayList.get(i);
            }
        }
        return null;
    }
}