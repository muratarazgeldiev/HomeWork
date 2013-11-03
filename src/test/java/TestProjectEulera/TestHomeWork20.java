package TestProjectEulera;

import ProjectEulera.HomeWork20.HomeWorks20;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestHomeWork20 {
    @Test
    public void checkWork20(){
        HomeWorks20 check = new HomeWorks20();
        assertEquals(27, check.insert(10));
    }
}
