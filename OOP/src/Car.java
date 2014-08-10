
public class Car {
	public String toString() {
		return String.format("%s@%s", this.getClass().getSimpleName(), this.hashCode());
	}


}
