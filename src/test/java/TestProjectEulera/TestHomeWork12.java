package TestProjectEulera;

import ProjectEulera.HomeWork12.HomeWork12;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHomeWork12 {
    @Test
    public void checkWork12(){
        HomeWork12 req = new HomeWork12();
        assertEquals(28,req.maxN(6));
    }
}
