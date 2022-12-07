import java.util.Scanner;

public class Par {
    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

         int [] Numeros = new int[10];

         for (int i = 0; i > Numeros.length; i++){
            System.out.println("Digite um número:");
            Numeros[i] = input.nextInt();
         }

         System.out.println("Os números pares são: ");

         for (int resultado = 0; resultado < Numeros.length; resultado++){
            if(Numeros[resultado] % 2 == 0){
                System.out.println(Numeros[resultado]);
            }
         }

         input.close();
    }
}
