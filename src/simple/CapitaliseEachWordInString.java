package simple;

public class CapitaliseEachWordInString {
    public static void main(String[] args){
        String sentence = "suresh selvaraj";
        String firstLetter = sentence.substring(0,1);
        String restLetter = sentence.substring(1,sentence.length());
        String cap = firstLetter.toUpperCase()+restLetter;
        System.out.println(cap);
        }
    }
