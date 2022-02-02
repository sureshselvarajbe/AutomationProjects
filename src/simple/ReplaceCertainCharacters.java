package simple;

import java.util.Scanner;

public class ReplaceCertainCharacters {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        char[] stringToChar = inputString.toCharArray();
        for(int i=0;i<stringToChar.length;i++){
            if((stringToChar[i]=='a')||(stringToChar[i]=='e')||(stringToChar[i]=='i')||(stringToChar[i]=='o')||(stringToChar[i]=='u')){
                stringToChar[i]='$';
            }
        }
        for(int i=0;i<stringToChar.length;i++) {
            System.out.println(stringToChar[i]);
        }
    }
}
