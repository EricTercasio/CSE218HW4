package p2;

/**
 * Created by Eric on 2/28/2017.
 */
public class StringReverserDemo {
    public static void main(String[] args){
        stringReverser("Hello");
        stringReverser("Chen");
        stringReverser("Backwards");
        stringReverser("Text");

    }
    public static void stringReverser(String value){
        if (value.isEmpty()){
            System.out.println();
        }else{
            System.out.print(value.charAt(value.length() - 1));
            stringReverser(value.substring(0,value.length() - 1));
        }
    }
}
