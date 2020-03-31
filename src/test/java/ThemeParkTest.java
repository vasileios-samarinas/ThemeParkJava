import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    TobaccoStall tobaccoStall;
    Playground playground;


    @Before
    public void setUp(){
        themepark= new ThemePark();
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,5);
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void parksListStartsEmpty(){
        assertEquals(0,themepark.parkCount());
    }

    @Test
    public void canAddToParks(){
        themepark.add(tobaccoStall);
        themepark.add(playground);
        assertEquals(2,themepark.parkCount());
    }

    @Test
    public void canClearParks(){
        themepark.add(tobaccoStall);
        themepark.add(playground);
        themepark.clearAll();
        assertEquals(0,themepark.parkCount());
    }






}
