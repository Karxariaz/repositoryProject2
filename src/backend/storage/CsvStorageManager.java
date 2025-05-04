package backend.storage;

import java.util.List;
import java.util.function.Supplier;

public class CsvStorageManager {
	
	private String filePath; // Η διαδρομή του αρχείου CSV
	private Supplier<T> objectSupplier; // Για δημιουργία αντικειμένων τύπου Tw
	private List<T> items; // Τα αποθηκευμένα αντικείμενα

}
