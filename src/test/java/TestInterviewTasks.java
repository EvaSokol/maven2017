
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;


public class TestInterviewTasks {

    @Test(enabled=false)
    public void testUniqueStringBruteForcePositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test(enabled=false)
    public void testUniqueStringBruteForceNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test(enabled=false)
    public void testUniqueStringBruteForceZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test(enabled=false)
    public void testUniqueStringBruteForcetMax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str), str);
    }

    @Test(enabled=false)
    public void testUniqueStringBruteForceMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test(enabled=false)
    public void testUniqueStringUsingSetPositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test(enabled=false)
    public void testUniqueStringUsingSetNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test(enabled=false)
    public void testUniqueStringUsingSetZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test(enabled=false)
    public void testUniqueStringUsingSetMax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test(enabled=false)
    public void testUniqueStringUsingSetMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsUsingSet(str), str);
    }

    @Test(enabled=false)
    public void testUniqueStringSortingPositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test(enabled=false)
    public void testUniqueStringSortingNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test(enabled=false)
    public void testUniqueStringSortingZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test(enabled=false)
    public void testUniqueStringSortingax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test(enabled=false)
    public void testUniqueStringSortingMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsSorting(str), str);
    }

    @Test(enabled=false)
    public void testIsCycleShiftPositiveDirectionLeft(){
        String firstString = "qwerty";
        String secondString = "wertyq";
        assertTrue(InterviewTasks.isCyclicShift(firstString, secondString),
                firstString + " is not shifted by " + secondString);
    }

    @Test(enabled=false)
    public void testIsCycleShiftPositiveDirectionRight(){
        String firstString = "wertyq";
        String secondString = "qwerty";
        assertTrue(InterviewTasks.isCyclicShift(firstString, secondString),
                firstString + " is not shifted by " + secondString);
    }

    @Test(enabled=false)
    public void testIsCycleShiftNegative(){
        String firstString = "qwerty";
        String secondString = "wertyk";
        assertFalse(InterviewTasks.isCyclicShift(firstString, secondString),
                firstString + " is shifted by " + secondString);
    }

    @Test(enabled=false)
    public void testIsCycleShiftNotEqual(){
        String firstString = "qwerty";
        String secondString = "qwertyk";
        assertFalse(InterviewTasks.isCyclicShift(firstString, secondString),
                firstString + " is shifted by " + secondString);
    }

    @Test(enabled=true)
    public void testRemoveDuplicatesPositive(){
        List baseList = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 2, 9, 6));
        List list = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 2, 9, 6));
        InterviewTasks.removeDuplicates(list);
        List expected = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 9));
        assertEquals(list, expected, String.format("Base list: %s\n result: %s \n expected: %s", baseList, list, expected));
    }

    @Test(enabled=true)
    public void testRemoveDuplicatesZero(){
        List list = new LinkedList<Integer>();
        InterviewTasks.removeDuplicates(list);
        List expected = new LinkedList<Integer>();
        assertEquals(list, expected, String.format("Result: %s \n expected: %s", list, expected));
    }

    @Test(enabled=true)
    public void testRemoveDuplicatesNoBufferPositive(){
        List baseList = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 2, 9, 6));
        List list = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 2, 9, 6));
        InterviewTasks.removeDuplicatesNoBuffer(list);
        List expected = new LinkedList<Integer>(Arrays.asList(2, 3, 5, 6, 7, 9));
        assertEquals(list, expected, String.format("Base list: %s\n result: %s \n expected: %s", baseList, list, expected));
    }

    @Test(enabled=true)
    public void testRemoveDuplicatesNoBufferZero(){
        List list = new LinkedList<Integer>();
        InterviewTasks.removeDuplicatesNoBuffer(list);
        List expected = new LinkedList<Integer>();
        assertEquals(list, expected, String.format("Result: %s \n expected: %s", list, expected));
    }
}
