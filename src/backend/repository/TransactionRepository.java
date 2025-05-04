package backend.repository;

import backend.model.transaction.Transaction;
import java.util.List;

public class TransactionRepository {
	
	private List<Transaction> transactions;
	private final String DATA_FILE = "./data/transactions.csv";

}
