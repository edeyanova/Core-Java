
public class DatabaseCorruptedException extends Exception {
	public DatabaseCorruptedException() {
		super("Username field in Users is an empty string!");
	}
}
