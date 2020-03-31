package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasAllowedVisitorHasBothValidHeightAndAge(){
        visitor= new Visitor(26,1.75,100.00);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasNotAllowedVisitorHasValidHeightAndNotAge(){
        visitor= new Visitor(11,1.75,100.00);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasNotAllowedVisitorHasNotValidHeightButAge(){
        visitor= new Visitor(26,1.3,100.00);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }


}
