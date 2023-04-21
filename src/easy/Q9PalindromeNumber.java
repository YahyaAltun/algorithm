package easy;

public class Q9PalindromeNumber {
    public static void main(String[] args) {

        int number = 13431;

        System.out.println(isPalindrome(number));

    }

    public static boolean isPalindrome(int number) {
        String sayi;
        sayi = String.valueOf(number);
        String palindrome="";
        for (int i=sayi.length()-1; i>=0; i--){
            palindrome+=sayi.charAt(i);
        }
        if(sayi.equals(palindrome))return true;
        else return false;
    }
}
