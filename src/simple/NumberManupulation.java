package simple;

public class NumberManupulation {
    public static void main(String[] args){
        int count;
        for(int i=1;i<7;i++){
            if(i%2==0){
                count=1;
                do{
                        System.out.print(i);
                        count++;
            }while(count<=i);
        }
        else{
            System.out.println();
            System.out.println(i);
        }
    }
    }
}
