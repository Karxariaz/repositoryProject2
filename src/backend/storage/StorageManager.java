package backend.storage;

import java.util.List;

public interface StorageManager<T extends Storable> {
	
	public String filePath;
	public List<T> items;

	
}
