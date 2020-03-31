package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasAllowedVisitorToIfOver18yearsOld(){
        visitor= new Visitor(26,1.75,100.00);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasNotAllowedVisitorToIfLessThan18yearsOld(){
        visitor= new Visitor(14,1.75,100.00);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }
}
