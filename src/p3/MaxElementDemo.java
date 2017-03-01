package p3;

/**
 * Created by Eric on 2/28/2017.
 */
public class MaxElementDemo {
    public static void main(String[] args){
        int[] numbers = {22, 1 , 0 ,1000, 44, 10};
        System.out.println(maxElement(numbers,(numbers.length - 1),0));
    }
    public static int maxElement(int[] numbers, int length, int maxNumber){

        if(numbers[length] == 0){
            return maxNumber;
        }else{
            if(numbers[length] > maxNumber){
                maxNumber = numbers[length];
                return maxElement(numbers,length - 1,maxNumber);
            }else{
                return maxElement(numbers,length - 1,maxNumber);
            }
        }
    }
}
