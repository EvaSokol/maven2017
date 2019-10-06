import java.util.*;

import static java.util.Arrays.sort;

public class InterviewTasks {

// Let's define this method is applicable for ASCII string and this alphabet contains 128 characters
    static Boolean hasAllUniqueSymbolsBruteForce(String s){
        int sLen = s.length();
        if (sLen == 0) return true;
        if (sLen > 128) return false;

        for (int i = 0; i < sLen; i++) {
            for (int j = i+1; j < sLen; j++){
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }

    static Boolean hasAllUniqueSymbolsUsingSet(String s){
        int sLen = s.length();
        if (sLen == 0) return true;
        if (sLen > 128) return false;

        Set<Character> newSet = new HashSet<Character>();
        for (char ch : s.toCharArray()) newSet.add(ch);
        if (newSet.size() == s.length()) return true;
        else return false;
    }

    static Boolean hasAllUniqueSymbolsSorting(String s){
        int sLen = s.length();
        if (sLen == 0) return true;
        if (sLen > 128) return false;

        char[] chars = s.toCharArray();
        sort(chars);

        for (int i = 0; i < sLen-1; i++){
            if (chars[i] == chars[i+1]) return false;
        }
        return true;
    }

    static Boolean isCyclicShift(String firstString, String secondString){
        if (firstString.length() != secondString.length()) return false;
        return checkShift(firstString, secondString)? true: checkShift(secondString, firstString);
    }

    static Boolean checkShift(String firstString, String secondString){
        int sLen = firstString.length();
        String subStr = firstString.substring(0, sLen - 2);
        if (secondString.substring(1, sLen -1).equalsIgnoreCase(subStr)
                && secondString.toCharArray()[0] == firstString.toCharArray()[sLen - 1])
            return true;
        return false;
    }

    static void removeDuplicates(List<Integer> list){
        Set<Integer> tempSet = new HashSet<Integer>();
        for (int i = 0; i < list.size(); i++){
            if (tempSet.contains(list.get(i))) list.remove(i);
            else tempSet.add(list.get(i));
        }
    }

    static void removeDuplicatesNoBuffer(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int lastIndex = list.lastIndexOf(list.get(i));
            if (i != lastIndex) list.remove(lastIndex);
        }
    }
}

