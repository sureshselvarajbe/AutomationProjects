package simple;

public class PrintCircleOfStars {
    static int wordcount(String string)
    {
        int count=0;

        char[] letter = new char[string.length()];
        for(int i=0;i<string.length();i++){
            letter[i] = string.charAt(i);
                if(((i==0)&&(letter[i]!=' '))||((i>0)&&(letter[i-1]==' ')&&(letter[i-1]==' '))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string ="India Is My Country";
        System.out.println(wordcount(string) + " words.");
    }
}
