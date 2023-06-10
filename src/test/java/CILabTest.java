import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
        myString.setString("GOOGLE");
        assertTrue(myString.detectCapitalUse());
        myString.setString("google");
        assertTrue(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("GOogle");
        assertFalse(myString.detectCapitalUse());
        myString.setString("GooGle");
        assertFalse(myString.detectCapitalUse());
        myString.setString("GooGLe");
        assertFalse(myString.detectCapitalUse());
        myString.setString("GooglE");
        assertFalse(myString.detectCapitalUse());
        myString.setString("");
        assertFalse(myString.detectCapitalUse());
    }
}
