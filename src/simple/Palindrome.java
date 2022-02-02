package simple;

public class Palindrome {
    public static void main(String[] args){
        String input = "Sangeetha";
        System.out.println(input);
        char[] charInput = input.toCharArray();
        char[] reversedInput = new char[charInput.length];
        for(int i=(charInput.length-1);i>=0;i--){
            reversedInput[i] = charInput[i];
            System.out.println(reversedInput[i]);
        }
        StringBuffer reversedString = new StringBuffer();
        for(int i=(reversedInput.length-1);i>=0;i--){
            reversedString.append(reversedInput[i]);
        }
        String rev = reversedString.toString();
        System.out.println(rev);
        if(input.equalsIgnoreCase(rev)){
            System.out.println("The entered string is Palindrome");
        }
        else{
            System.out.println("The entered string is not a Palindrome");
        }
    }
}
