package com.company;

public class MakeStringGreatAgain {
    public static String solution(String s) {
        char[] sArray = s.toCharArray();
        if (sArray.length == 0) return "";

        for (int i = 0; i < sArray.length - 1; i++) {
            if (!isLetter(sArray[i])) continue;
            if (Math.abs(sArray[i] - sArray[i + 1]) == 32) {
                if (sArray.length < 3) {
                    return "";
                }
                sArray = removeElements(sArray, i);
                i = -1;
            }
        }
        return new String(sArray);
    }

    private static char[] removeElements(char[] arr, int index) {
        char[] arrDestination = new char[arr.length - 2];
        int remainingElements = arr.length - ( index + 2);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 2, arrDestination, index, remainingElements);
        return arrDestination;
    }

    private static boolean isLetter(char ch) {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    public static void main(String[] args) {
        System.out.println(solution("unileEecs"));
        System.out.println(solution("abBAcC"));
        System.out.println(solution("abBAcC destTarr"));
        System.out.println(solution(""));
    }
}
