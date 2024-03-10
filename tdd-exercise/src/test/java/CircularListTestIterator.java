import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.Exercise2Step2.CircularList;
import tdd.Exercise2Step2.CircularListImplementation;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTestIterator {

    private CircularList circularlist;

    @BeforeEach
    void beforeEach(){
    circularlist= new CircularListImplementation();
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
    void TestforwardIterator(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        var forwardIterator = circularlist.forwardIterator();
        forwardIterator.next();
        forwardIterator.next();
        assertEquals(30, forwardIterator.next());
    }

    @Test 
    void TestbackwardIterator(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        var backwardIterator = circularlist.forwardIterator();
        backwardIterator.next();
        backwardIterator.next();
        assertEquals(30, backwardIterator.next());
    }

    @Test
    void testResetIndex(){
        circularlist.add(10);
        circularlist.add(20);
        circularlist.add(30);
        circularlist.reset(); 
        assertEquals(0, circularlist.getIndex()); 
    }
}
