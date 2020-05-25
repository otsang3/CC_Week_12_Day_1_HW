import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50);
    }

    @Test
    public void getSheets(){
        assertEquals(50, printer.getRemainingSheets());
    }

    @Test
    public void testPrint(){
        printer.print(5,2);
        assertEquals(40, printer.getRemainingSheets());
    }
}
