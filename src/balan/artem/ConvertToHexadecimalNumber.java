package balan.artem;

public class ConvertToHexadecimalNumber {

    public static String solution(int x) {
        if(x == 0) return null;
        StringBuilder result = new StringBuilder();
        int num = Math.abs(x);

        while (num > 0) {
            if (num % 16 >= 10) {
                result.append((char) (65 + (num % 16 - 10)));
            } else result.append(num % 16);
            num /= 16;
        }
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(26));
        System.out.println(solution(50));
    }
}
