package TestProjectEulera;

import ProjectEulera.HomeWork15.HomeWork15;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestHomeWork15 {
    @Test
    public void checkWokr15(){
        HomeWork15 check = new HomeWork15();
        assertEquals(6,check.insert(2));
    }
}
