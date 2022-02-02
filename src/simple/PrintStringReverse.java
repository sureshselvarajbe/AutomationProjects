package simple;

public class PrintStringReverse {
    public static void main(String[] args){
        String word = "Suresh";
        char[] wordArray = word.toCharArray();
        for(int i=(wordArray.length-1);i>=0;i--){
            System.out.println(wordArray[i]);
        }
    }
}
