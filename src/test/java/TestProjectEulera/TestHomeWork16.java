package TestProjectEulera;

import ProjectEulera.HomeWork16.HomeWork16;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
public class TestHomeWork16 {
    @Test
    public void checkWork16() throws IOException {
        HomeWork16 check = new HomeWork16();
        assertEquals(26, check.insert(2,15));
    }
}
