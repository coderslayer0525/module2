package bank_account_managerment.repository;

import bank_account_managerment.entity.SavingMoneyAccount;

import java.util.ArrayList;

public interface ISavingMoneyRepository {
    ArrayList<SavingMoneyAccount> findAll();

    boolean add(SavingMoneyAccount savingMoneyAccount);

    boolean delete(int idCard);

    boolean update(int idCard, SavingMoneyAccount savingMoneyAccount);

    SavingMoneyAccount findByName(String user);
}
