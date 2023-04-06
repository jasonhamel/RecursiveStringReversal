public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverseIteratively("Hello world!"));
        System.out.println(reverseRecursively("Hello world!"));
    }

    public static String reverseIteratively(String s) {
        String reversedString = "";
        for (int i = s.length(); i > 0; i--) {
            reversedString += s.substring(i - 1, i);
        }
        return reversedString;
    }

    public static String reverseRecursively(String s) {
        if (s.length() <= 1) {
            return s;
        }

        return reverseRecursively(s.substring(1)) + s.charAt(0);
    }
}