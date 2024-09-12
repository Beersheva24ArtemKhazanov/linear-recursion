package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static long pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : pow(num, pow(num, degree - 1));
    }

    public static long pow(int num, long degree) {
        return num == 0 || degree == 0 ? 0 : num > 0 ? degree + pow(num - 1, degree) : -pow(-num, degree);
    }

    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }

    public static int square(int x) {
        return x == 0 ? 0 : x > 0 ? x + square(x - 1) + x - 1 : x + square(x + 1) + x + 1;
    }

    public static boolean isSubstring(String str, String subStr) {
        return subStr.length() == 0 || subStr.length() > str.length() ? false : firstMatching(str, subStr, 0, 0);
    }

    private static boolean firstMatching(String str, String subStr, int i, int j) {
        return i == str.length() ? false
                : str.charAt(i) == subStr.charAt(j) ? fullMatching(str, subStr, i, j)
                        : firstMatching(str, subStr, i + 1, j);
    }

    private static boolean fullMatching(String str, String subStr, int i, int j) {
        return j == subStr.length() ? true
                : str.charAt(i) != subStr.charAt(j) ? false : fullMatching(str, subStr, i + 1, j + 1);
    }

}
