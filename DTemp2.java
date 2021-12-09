package publisher_subcriber;

import java.util.Observable;
import java.util.Observer;

public class DTemp2 implements  Observer {
	
	public void update(Observable o, Object obj) {
		int t=(Integer) obj;
		if(t > 35) {
		System.out.println("Temperature is High");
		}
		else if(t < 10) {
		System.out.println("Temperature is Low");
		}
		else {
		System.out.println("Temperature is Moderate"); } }

}
