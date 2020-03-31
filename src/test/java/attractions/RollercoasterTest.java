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

    @Test
    public void hasStartingPrice(){
        assertEquals(8.4,rollerCoaster.defaultPrice(),0.01);
    }

    @Test
    public void hasPriceForUnder2m(){
        visitor= new Visitor(26,1.3,100.00);
        assertEquals(8.4,rollerCoaster.priceFor(visitor),0.01);
    }

    @Test
    public void hasPriceForOver2m(){
        visitor= new Visitor(26,2.1,100.00);
        assertEquals(16.8,rollerCoaster.priceFor(visitor),0.01);
    }


}
