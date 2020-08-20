public class Fibonacci{

    public static void main(String []args){
        int F0 = 0,F1 = 1,F2,sum = 20;
        System.out.print(F0 + " " + F1);
        for(int i = 2;i < sum;i++){
            F2 = F0 + F1;
            System.out.print(" " + F2);
            F0 = F1;
            F1 = F2;
        }
    }
}