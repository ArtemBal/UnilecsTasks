package balan.artem;

/**
 * Represents the task of converting from decimal to septimal
 */
public class SeptimalNumberSystem {

    /**
     * Converting from decimal to septimal
     * @param x This value in decimal
     * @return Value in septimal
     */
    private static int solution(int x) {
        if(x == 0) return 0;
        StringBuilder res = new StringBuilder();
        int num = Math.abs(x);
        while (num > 0) {
            res.append(num % 7);
            num /= 7;
        }
        res.reverse();
        if(x >= 0) return Integer.parseInt(String.valueOf(res));
        else return Integer.parseInt(String.valueOf(res)) * -1;
    }

    public static void main(String[] args) {
        System.out.println("6 in septimal number system is " + solution(6));
        System.out.println("7 in septimal number system is " + solution(7));
        System.out.println("8 in septimal number system is " + solution(8));
        System.out.println("100 in septimal number system is " + solution(100));
    }
}
