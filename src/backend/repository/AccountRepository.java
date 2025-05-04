package backend.repository;

import backend.model.account.Account;
import backend.model.account.PersonalAccount;
import backend.model.account.BusinessAccount;

import java.util.List;
import java.util.ArrayList;

public class AccountRepository {
	
	
	private final String FILE_PATH = "./data/accounts.csv"; // Σταθερή διαδρομή αρχείου
	private List<Account> accounts; // Όλοι οι λογαριασμοί της εφαρμογής

}
