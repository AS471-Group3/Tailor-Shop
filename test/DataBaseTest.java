
import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DataBaseTest {
    
    public DataBaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of DbConnect method, of class DataBase.
     * @throws java.lang.Exception
     */
    @Test
    public void testDbConnect() throws Exception {
        System.out.println("DbConnect");
        Connection expResult = null;
        Connection result = DataBase.DbConnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
