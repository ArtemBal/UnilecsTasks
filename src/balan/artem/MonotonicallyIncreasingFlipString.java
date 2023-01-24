package balan.artem;

import java.util.Arrays;
import java.util.Collections;

public class MonotonicallyIncreasingFlipString {

    /**
     * Method that check how much changes in binary string needed to make string monotonically increasing
     * Monotonically increasing means that it consists of some number of zeros (possibly none)
     * followed by some number of ones (also possibly none).
     *
     * @param s input string whose characters can only be 0 or 1
     * @return the minimum number of flips for the original string to increase monotonically.
     */
    private static int solution(String s) {
        long all0 = s.chars().filter(n -> n == '0').count(); // number of all '0'
        long all1 = s.chars().filter(n -> n == '1').count(); // number of all '1'

        if(all0 == 0 || all1 == 0) return 0; // string already increase monotonically

        long all0AfterFirst1 = s.substring(s.indexOf('1')).chars()
                .filter(n -> n == '0').count(); // number of all '0' after first occurrence of '1'
        long all1BeforeLast0 = s.substring(0, s.lastIndexOf('0')).chars()
                .filter(n -> n == '1').count(); // number of all '1' before last occurrence of '0'

        long[] a = {all0, all1, all0AfterFirst1, all1BeforeLast0};
        return (int) Arrays.stream(a)
                .min().getAsLong();
    }

    public static void main(String[] args) {
        System.out.println(solution("00110"));
        System.out.println(solution("010110"));
        System.out.println(solution("00011000"));
        System.out.println(solution("00011010"));
        System.out.println(solution("000"));
        System.out.println(solution("00010"));
        System.out.println(solution(""));
    }
}
