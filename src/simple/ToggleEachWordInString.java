package simple;

public class ToggleEachWordInString {
    public static void main(String[] args){
        String sentence = "I am an Engineer";
        String toggle="";
        String[] charArrayInput = sentence.split("\\s");
        for(String s: charArrayInput){
            String firstLetter = s.substring(0,1);
            String restLetters = s.substring(1);
            toggle=toggle+firstLetter.toLowerCase()+restLetters.toUpperCase()+" ";
        }
        System.out.println(toggle);
    }
}
