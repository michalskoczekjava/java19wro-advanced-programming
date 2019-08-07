package hashSet;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class StringHashSetTest {

    @Test
    public void sizeShouldReturnCountOfElementsInserted() {

        Set<String> set = new StringHashSet();
        set.add("Adam");
        set.add("Asia");
        set.add("Aleks");
        set.add("Rafał");
        set.add("Łukasz");
        set.add("Adrian");

        assertEquals(12,set.size());
    }

    @Test
    public void sizeShouldReturn0ForEmptySet(){
        Set<String>set = new StringHashSet();
        assertEquals(0, set.size());

        set.add("Adam");
        set.remove("Adam");

        assertEquals(0,set.size());
    }

    @Test
    public void shouldReturnTrueAfterSuccessAdd() {
        Set<String> set = new StringHashSet();

        assertTrue(set.add("Michał"));
    }

    @Test
    public void shouldReturnFalseAfterDoubleAddingThisSameName(){
        Set<String> set = new StringHashSet();

        set.add("Kuba");

        assertFalse(set.add("Kuba"));
    }

    @Test
    public void sizeShouldReturnZero_WhenClear(){
        Set<String>set = new StringHashSet();
        //assertEquals(0,set.size());

        set.add("Alan");
        set.add("Bob");
        set.clear();

        assertEquals(0,set.size());
    }

    @Test
    public void sizeShouldReturnTrue_WhenRemoveObject(){
        Set<String>set = new StringHashSet();

        set.add("Ines");
        set.remove("Ines");

        assertEquals(true,set.isEmpty());
    }

    @Test
    public void sizeShouldReturnSetSizeAfterAddAll(){

        Set<String>set = new StringHashSet();
        List<String>test = new ArrayList<>();

        test.add("a");
        test.add("b");
        test.add("c");
        set.addAll(test);
        assertEquals(3,set.size());

    }

//    given_When_Then
//    shouldReturn0ForEmptiedSet

}