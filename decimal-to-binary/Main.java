import java.util.*;

class Main {
    
    public static void main (String[]args){
        for (int i=0; i<31; i++){
            System.out.println(decimalToBinary(i)); //Test inputs
        }
    }

    static int decimalToBinary(int num){
        if(num==0){
            return 0;
        }
        else{
            return ((10*decimalToBinary(num/2))+(num%2));
        }
    }
}
