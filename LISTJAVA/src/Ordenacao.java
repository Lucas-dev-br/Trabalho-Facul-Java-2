import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        int [] NumList = new int [11];

        for (int i = 0; 1 < NumList.length; i++){
            System.out.println("Digite um número:");
            NumList[i] = input.nextInt();
        }

        Arrays.sort(NumList);

        System.out.println("A ordem crescente dos números:");

        for (int Num = 1; Num < NumList.length; Num++){
            System.out.println(NumList[Num] + " ");
        }

        input.close();
    }
}
