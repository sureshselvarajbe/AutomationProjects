package simple;

public class SortAnCharArray {
        public static void main(String[] args){
            char[] character = new char[]{'h','t','l','c','e','w','o'};
            char temp=' ';
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
            for(int i=0;i<character.length;i++){
                for(int j=(i+1);j<character.length;j++){
                    if(character[i]>character[j]) {
                        temp = character[i];
                        character[i] = character[j];
                        character[j] = temp;
                    }
                }
            }
            for(int i=0;i<character.length;i++){
                System.out.println(character[i]);
            }

        }
    }

