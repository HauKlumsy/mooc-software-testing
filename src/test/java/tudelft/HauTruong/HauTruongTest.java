package tudelft.HauTruong;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.gettingstarted.GettingStarted;

public class HauTruongTest {

    HauTruong h;
    @BeforeEach
    public void setup(){
        h = new HauTruong();
    }

    @Test
    public void getFullName() {
        String result = h.getFullName();
        Assertions.assertEquals("Hau Truong",result);
    }

    @Test
    public void getFirstName() {
        String result = h.getFirstName();
        Assertions.assertEquals("Hau",result);
    }

    @Test
    public void getLastName() {
        String result = h.getLastName();
        Assertions.assertEquals("Truong",result);
    }

    @Test
    public void getUCInetID() {
        String result = h.getUCInetID();
        Assertions.assertEquals("hauqt",result);
    }

    @Test
    public void getStudentNumber() {
        int result = h.getStudentNumber();
        Assertions.assertEquals(30027023 ,result);
    }

    @Test
    public void getRotatedFullNamePos(){
        String result = h.getRotatedFullName(3);

        Assertions.assertEquals(" TruongHau", result);
    }

    @Test
    public void getRotatedFullNameNeg(){
        String result = h.getRotatedFullName(-3);

        Assertions.assertEquals("ongHau Tru", result);
    }

}
