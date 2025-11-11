package bank_account_managerment.service;

import bank_account_managerment.entity.SavingMoneyAccount;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public interface ISavingMoneyService {
    ArrayList<SavingMoneyAccount> findAll();

    boolean add(SavingMoneyAccount savingMoneyAccount);

    boolean delete(int idCard);

    boolean update(int idCard, SavingMoneyAccount savingMoneyAccount);

    SavingMoneyAccount findByName(String user);
}
