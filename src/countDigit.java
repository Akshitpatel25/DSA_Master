import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        System.out.println("hello");
//        int res = countDigit(1741);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
//        int userInput = sc.nextInt();
//        int res = reverseNumber(1534236469);
//        boolean res = palindromNumber(-121);
//        boolean res = armstrongNumber(userInput);
//        allDivisors(userInput);
//        System.out.println(res);
    }

    public static int countDigit(int n) {
        if (n == 0) return 1;
        int count=0;
        while (n != 0) {
            count++;
            n = n/10;
        }
        return count;
    }

    public static int reverseNumber(int n) {
        int revNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;

            if (revNumber > Integer.MAX_VALUE / 10 || (revNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (revNumber < Integer.MIN_VALUE / 10 || (revNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            revNumber = (revNumber * 10) + lastDigit;
            n /= 10;
        }
        return revNumber;
    }


    public static boolean palindromNumber(int n) {
        System.out.println("palindromNumber" + n);
        String str = String.valueOf(n);
        if (str.charAt(0) == '-') return false;
        int original = n;
        int revNumber = 0;
        while ( n != 0) {
            revNumber = revNumber *10;
            revNumber += n%10;
            n = n/10;
        }
        if (revNumber != original) {
            return false;
        }
        return true;
    }

    public static boolean armstrongNumber(int n) {
        int resultAfterAdding = 0;
        int duplicateNumber = n;
        while (n !=0 ) {
            int lastDigit = n%10;
            resultAfterAdding += (lastDigit*lastDigit*lastDigit);
            n = n/10;
        }
        return resultAfterAdding == duplicateNumber;
    }

    public static void allDivisors(int n) {
        int increament=1;
        while (n != increament) {
            if (n%increament == 0) {
                System.out.print(increament + " ");
            }
            increament++;

        }
    }
}
