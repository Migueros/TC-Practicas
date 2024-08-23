import java.util.Scanner;

public class Run{
    public static void main(String[] args) {
        
        // Instanciamos un objeto Scanner para leer el numero del cual queremos obtener su factorial
        Scanner scanner = new Scanner(System.in);

        // Ingresamos el numero
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();

         // Se inicializa la variable en donde se guardara el factorial
         long factorial = 1;

         // Validamos si el factorial es 0 o culauqier otro mayor a 0
        if (n == 0) {
        System.out.println("El factorial de " + n + " es: " + factorial);
        } else {
             // Calcular el factorial de n
            for (int i = 1; i <= n; i++) {
                factorial *= i;
        }

        // Mostrar el factorial
        System.out.println("El factorial de: " + n + " es: " + factorial);
        }

       
    }

}
