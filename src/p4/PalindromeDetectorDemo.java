package p4;

/**
 * Created by Eric on 2/28/2017.
 */
public class PalindromeDetectorDemo {
    public static void main(String[] args){
        String racecar = "racecar";
        String henry = "henry";
        System.out.println(isPalindrome(racecar, 0,racecar.length() - 1 ));
        System.out.println(isPalindrome(henry, 0,henry.length() - 1 ));

    }
    public static boolean isPalindrome(String value, int startIndex, int endIndex){
        if (endIndex == 0){
            return true;
        }else{
            if (value.charAt(startIndex) == value.charAt(endIndex)){
                return isPalindrome(value, startIndex + 1, endIndex - 1);
            }else{
                return false;
            }
        }
    }
}
