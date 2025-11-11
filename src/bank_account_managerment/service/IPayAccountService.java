package bank_account_managerment.service;

import bank_account_managerment.entity.PayAccount;

import java.util.ArrayList;

public interface IPayAccountService {
    ArrayList<PayAccount> findAll();

    boolean add(PayAccount payAccount);

    boolean delete(int idCard);

    boolean update(int idCard, PayAccount payAccount);

    PayAccount findByName(String user);
}
