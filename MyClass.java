package publisher_subcriber;

import java.util.Observable;
import java.util.Observer;

public class MyClass {
	public static void main(String[] args) {
		
		Furnace f1 = new Furnace();
		CTemp1 t1 = new CTemp1();
		DTemp2 t2 = new DTemp2();
		f1.addObserver(t1);
		f1.addObserver(t2);
		f1.setTemp(5);
		f1.setTemp(15);
		f1.setTemp(40);
	}
}
