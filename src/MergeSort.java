import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) throws FileNotFoundException {


            Scanner input = new Scanner(new File( args[0]));
            Scanner numbers = new Scanner(new File(args[0]));

            String x = input.nextLine();
            int num = 0;
            for(int i = 0; i <x.length(); i ++){
                char ch = x.charAt(i);
                if( ch == ' '){
                    num++;
                }
            }
            System.out.println(num);
            int[] A = new int[num+1];
            int i = 0;
            while(numbers.hasNext()) {


                A[i] = numbers.nextInt();
                System.out.println( A[i]);
                System.out.println("new"+A[i]);
                i++;

            }
            int sum = 0;
            int total = Calculate(A, sum);
            System.out.println("Experiment Over ");
            System.out.println("Total is : "+total);


            System.exit(0);

    }


    public static int Calculate(int[] input, int total){
        for(int i=0;i<=input.length;i++){
            for(int j=i+1; j< input.length; j++){
                if (input[i] > input[j]){
                    total += 3;

                }
                if(input[i] == input[j]+1){
                    total -= 1;
                }
            }

        }
        return total;
    }


}
