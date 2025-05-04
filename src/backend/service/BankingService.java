package backend.service;

import backend.model.account.Account;
import backend.model.transaction.Transaction;
import backend.model.user.User;
import backend.model.bill.Bill;
import backend.model.order.StandingOrder;

import java.util.List;

public class BankingService {

	private List<Account> accounts;
	private List<Transaction> transactions;
	private List<User> users;
	private List<Bill> bills;
	private List<StandingOrder> standingOrders;
	
}
