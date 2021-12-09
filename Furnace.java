package publisher_subcriber;

import java.util.Observable; 

public class Furnace extends Observable {
	

	public void setTemp(int t) {
		setChanged();
		notifyObservers(t);
	}

}
