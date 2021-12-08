 
import static org.junit.Assert.*;
import org.junit.Test;

public class TestTriangle {
	@Test
	public void testEquilateral() {
	String[] args= {"10","10","10"};
	Triangle t1=new Triangle(args);
	String expectedOutput="Equilateral";
	String receivedOutput=t1.TriangleType(args);
	assertEquals(expectedOutput, receivedOutput);
	}
	@Test
	public void testScalene() {
	String[] args= {"10","11","12"};
	Triangle t1=new Triangle(args);
	String expectedOutput="Scalene";
	String receivedOutput=t1.TriangleType(args);
	assertEquals(expectedOutput, receivedOutput);
	}
	@Test
	public void testIsoceles() {
	String[] args= {"10","10","11"};
	Triangle t1=new Triangle(args);
	String expectedOutput="Isoceles";
	String receivedOutput=t1.TriangleType(args);
	assertEquals(expectedOutput, receivedOutput);
	}


}
