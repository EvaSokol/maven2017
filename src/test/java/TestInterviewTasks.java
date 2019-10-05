
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class TestInterviewTasks {

    @Test
    public void testUniqueStringBruteForcePositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test
    public void testUniqueStringBruteForceNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test
    public void testUniqueStringBruteForceZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test
    public void testUniqueStringBruteForcetMax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsBruteForce(str), str);
    }

    @Test
    public void testUniqueStringBruteForceMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsBruteForce(str));
    }

    @Test
    public void testUniqueStringUsingSetPositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test
    public void testUniqueStringUsingSetNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test
    public void testUniqueStringUsingSetZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test
    public void testUniqueStringUsingSetMax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsUsingSet(str));
    }

    @Test
    public void testUniqueStringUsingSetMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsUsingSet(str), str);
    }

    @Test
    public void testUniqueStringSortingPositive(){
        String str =  "askump";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test
    public void testUniqueStringSortingNegative(){
        String str =  "asksgdaump";
        assertFalse(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test
    public void testUniqueStringSortingZero(){
        String str =  "";
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test
    public void testUniqueStringSortingax(){
        char[] chars = new char[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        String str = new String(chars);
        assertTrue(InterviewTasks.hasAllUniqueSymbolsSorting(str));
    }

    @Test
    public void testUniqueStringSortingMore(){
        char[] chars = new char[129];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char)i;
        }
        chars[128] = 'q';
        String str = new String(chars);
        assertFalse(InterviewTasks.hasAllUniqueSymbolsSorting(str), str);
    }
}
