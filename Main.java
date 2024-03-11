import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int r;

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a>b)&(a>c)){
            r = a;
        } else if (b>c){
            r = b;    
        } else {
            r = c;
        }

        System.out.println(r+" eh o maior");
        scanner.close();
    }
 
}