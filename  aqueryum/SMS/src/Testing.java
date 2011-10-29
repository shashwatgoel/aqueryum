import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class Testing extends TestCase {

	public void testCollection() {
	}
	public Testing (String name) {
		super(name);
		}
	public static Test suite(){
		return new TestSuite(Testing.class);
	}


}
