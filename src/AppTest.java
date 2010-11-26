import junit.framework.*;

public class AppTest extends TestCase {
    public void testAdd() {
        assertEquals(3,new App().add(1,2));
    }
}
