import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class Testing extends TestCase {
	
	private SerialToGsm abc;
	private SerialToGsm def;
	private SerialToGsm ghi;
	public Testing (String name) {
		super(name);
		}
	
	protected void setUp()  {
		try {
			super.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//abc=new SerialToGsm("COM5");
		//def=new SerialToGsm("COM10");
		ghi=new SerialToGsm("");
	}

	protected void tearDown()  {
		try {
			super.tearDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//abc=null;
		//def=null;
		ghi=null;
	}
	public void testEquals() {
		assertFalse(abc.equals(def));
		assertTrue(abc.equals(abc));
	}
/*	public void testCompare()
	{
		assertTrue(abc.compare(abc));
	}*/
	public void testWrongPort()
	{
		assertFalse(abc.success==1);
		assertTrue(def.success==0);
	}
	public void testNoPort()
	{
		assertTrue(ghi.success==0);
	}
	public static Test suite(){
		TestSuite suite = new TestSuite();
//		suite.addTest(new Testing("testEquals"));
//		suite.addTest(new Testing("testWrongPort"));
		suite.addTest(new Testing("testNoPort"));
		return suite;
	}


}
