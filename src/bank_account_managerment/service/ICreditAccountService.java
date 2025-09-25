package bank_account_managerment.service;

import bank_account_managerment.entity.CreditAccount;

import java.util.ArrayList;

public interface ICreditAccountService {
    ArrayList<CreditAccount> findAll();

    boolean add(CreditAccount creditAccount);

    boolean delete(int idCard);

    boolean update(int idCard, CreditAccount creditAccount);

    CreditAccount findByName(String user);
}
