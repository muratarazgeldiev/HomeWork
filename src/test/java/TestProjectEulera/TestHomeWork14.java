package TestProjectEulera;

import ProjectEulera.HomeWork14.HomeWork14;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHomeWork14 {
    @Test
    public void checkWork14(){
        HomeWork14 check = new HomeWork14();
        assertEquals(10, check.insertProv(13));
    }
}
