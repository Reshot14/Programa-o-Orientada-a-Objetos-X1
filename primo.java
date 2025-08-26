import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero: ");
        numero = teclado.nextInt();
        teclado.close();
        
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero%i==0){
              cont+=1;}}

           
           if (cont!=2){
    System.out.println("O número não é primo");
} else {
    System.out.println("O número é primo");
}
        
    }}   

            
 



