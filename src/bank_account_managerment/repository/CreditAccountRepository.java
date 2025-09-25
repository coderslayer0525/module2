package bank_account_managerment.repository;

import bank_account_managerment.entity.CreditAccount;

import java.util.ArrayList;

public class CreditAccountRepository  implements ICreditAccountRepository{

    private ArrayList<CreditAccount> creditAccountArrayList= new ArrayList<>();
    @Override
    public ArrayList<CreditAccount> findAll() {
        return creditAccountArrayList;
    }

    @Override
    public boolean add(CreditAccount creditAccount) {
        return creditAccountArrayList.add(creditAccount);
    }

    @Override
    public boolean delete(int idCard) {
        for (CreditAccount creditAccount : creditAccountArrayList){
            if (creditAccount.getIdCard()== idCard){
                creditAccountArrayList.remove(creditAccount);
                return  true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int idCard, CreditAccount creditAccount) {
        for (int i = 0; i < creditAccountArrayList.size(); i++){
            if (creditAccountArrayList.get(i).getIdCard()== new CreditAccount().getIdCard()){
                creditAccountArrayList.set(i, new CreditAccount());
            }
        }
        return false;
    }

    @Override
    public CreditAccount findByName(String user) {
        for (int i = 0; i < creditAccountArrayList.size();i++){
            if (creditAccountArrayList.equals(user)){
                return creditAccountArrayList.get(i);
            }
        }
        return null;
    }
}
