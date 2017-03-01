package p5;

/**
 * Created by Eric on 2/28/2017.
 */
public class CharCounterDemo {
    public static void main(String[] args){
        char[] chars = {'a','a','a','b','b','c','d','a'};
        System.out.println(charCounter(chars, 'a',chars.length - 1 ));
        System.out.println(charCounter(chars, 'b',chars.length - 1 ));
        System.out.println(charCounter(chars, 'c',chars.length - 1 ));
    }
    public static int charCounter(char[] characters, char searchTerm, int length){
        int counter = 0;
        if (length == 0){
            if (characters[length] == searchTerm){
                counter++;
            }
            return counter;
        }else{
            if (characters[length] == searchTerm){
                counter++;
                return counter + charCounter(characters,searchTerm,length - 1);
            }else{
                return charCounter(characters,searchTerm,length - 1);
            }
        }
    }
}
