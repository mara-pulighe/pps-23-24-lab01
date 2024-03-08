import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.CircularList;
import tdd.CircularListImplementation;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularlist;

    @BeforeEach
    void beforeEach(){
    circularlist= new CircularListImplementation(0, null);
    }


    @Test 
    void TestAdd(){
        circularlist.add(34);
        circularlist.add(54);
        assertEquals(2, circularlist.size());
    }

    @Test
    void testInitialSize(){
        assertEquals(0, circularlist.size());
    }

    @Test
    void TestifisEmpty(){
        assertEquals(circularlist.size()==0, circularlist.isEmpty());
    }

    @Test 
    void nextElement(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        assertEquals(Optional.of(10), circularlist.next());
        assertEquals(Optional.of(20), circularlist.next());
        assertEquals(Optional.of(30), circularlist.next());
        assertEquals(Optional.of(10), circularlist.next());
    }

    @Test 
    void previousElement(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        assertEquals(Optional.of(30), circularlist.previous());
        assertEquals(Optional.of(20), circularlist.previous());
        assertEquals(Optional.of(10), circularlist.previous());
        assertEquals(Optional.of(30), circularlist.previous());
    }

    @Test
    void testResetIndex(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        circularlist.next();
        circularlist.reset(); 
        assertEquals(0, circularlist.getIndex()); 
    }
}
