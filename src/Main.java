import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


            Scanner input = new Scanner(new File("C:/Users/User/IdeaProjects/untitled/src/java_doc.txt"));
            String A[] = new String[10];
            int i = 0;
            while(input.hasNext()) {


                A[i] = input.next();;
                System.out.println( A[i]);
                System.out.println("new"+A[i]);
                i++;

            }
            int total = Calculate(A);
            System.out.println("Experiment Over ");
            System.out.println("Total is : "+total);

            System.err.println("Invalid arguments count:" + args.length);
            String loud = " ";

            System.exit(0);

    }


    public static int Calculate(String input[]){
        int total = 0;
        for(int i=0;i<input.length;i++){
            for(int j=0; j< input.length; j++){
                if (Integer.parseInt(input[i]) > Integer.parseInt(input[j])&& (i < j)){
                    total =+ 3;

                }else if(Integer.parseInt(input[i]) == Integer.parseInt(input[j])){
                    total =+2;
                }else{
                    total =+0;

                }
            }

        }
        return total;
    }
}
