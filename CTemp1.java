package publisher_subcriber;

import java.util.Observable;
import java.util.Observer;


public class CTemp1 implements Observer {
	
	public void update(Observable o, Object obj) {
		int t=(Integer) obj;
		System.out.println("Temperature is : "+t);
		}

}
