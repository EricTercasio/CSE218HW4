package p1;

/**
 * Created by Eric on 2/28/2017.
 */
public class Demo {
    public static void main(String[] args){
        int[] numbers = {1,2,3,55,4,32,22,56,77};
        System.out.println(isMember(numbers,1,(numbers.length - 1)));

        System.out.println(isMember(numbers,555,(numbers.length - 1)));
    }
    public static boolean isMember(int[] numbers, int value, int length){
        if (numbers[length] == value) {
            System.out.println(value + " Found at index " + length);
            return true;
        }else if(length == 0) {
            System.out.println("Not found");
            return false;
        }
        else{
            return isMember(numbers, value, length - 1);
        }
    }
}
