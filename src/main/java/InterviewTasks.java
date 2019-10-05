import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

public class InterviewTasks {

// Let's define this method is applicable for ASCII string and this alphabet contains 128 characters
    static Boolean hasAllUniqueSymbolsBruteForce(String s){
        int slen = s.length();
        if (slen == 0) return true;
        if (slen > 128) return false;

        for (int i = 0; i < slen; i++) {
            for (int j = i+1; j < slen; j++){
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }

    static Boolean hasAllUniqueSymbolsUsingSet(String s){
        int slen = s.length();
        if (slen == 0) return true;
        if (slen > 128) return false;

        Set<Character> newSet = new HashSet<Character>();
        for (char ch : s.toCharArray()) newSet.add(ch);
        if (newSet.size() == s.length()) return true;
        else return false;
    }

    static Boolean hasAllUniqueSymbolsSorting(String s){
        int slen = s.length();
        if (slen == 0) return true;
        if (slen > 128) return false;

        char[] chars = s.toCharArray();
        sort(chars);

        for (int i = 0; i < slen-1; i++){
            if (chars[i] == chars[i+1]) return false;
        }
        return true;
    }

    static Boolean isCyclicShift(String firstString, String secondString){
        if (firstString.length() != secondString.length()) return false;
        return checkShift(firstString, secondString)? true: checkShift(secondString, firstString);
    }

    static Boolean checkShift(String firstString, String secondString){
        int slen = firstString.length();
        String substr = firstString.substring(0, slen - 2);
        if (secondString.substring(1, slen -1).equalsIgnoreCase(substr)
                && secondString.toCharArray()[0] == firstString.toCharArray()[slen - 1])
            return true;
        return false;
    }
}

