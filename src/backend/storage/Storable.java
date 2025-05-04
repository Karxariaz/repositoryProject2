package backend.storage;

public interface Storable {
	
	String toCSV(); // μετατροπή σε γραμμή CSV
	void fromCSV(String csvLine); // αρχικοποίηση από γραμμή CSV

}
