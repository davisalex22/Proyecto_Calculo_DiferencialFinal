package proyecto_calculo;
import java.util.Scanner;
public class Funcion5 {
    public static void main(String[] args) {
// INICIO PROGRAMA
Scanner entrada = new Scanner(System.in);
// Declaración de variables importantes
double lim_inferior = 0;
double lim_superior = 0;
double valory = 0;
double escala = 0;
// Ingreso por teclado de información
System.out.println(" Ingrese el límite inferior de la tabla de valores:\n ");
lim_inferior = entrada.nextInt();
System.out.println("Ingrese el límite superior de la tabla de valores:\n");
lim_superior = entrada.nextInt();
System.out.println("Ingrese la escala de la tabla de valores:\n");
escala = entrada.nextDouble();
// Generación de límites de la tabla
System.out.println("_________________________________________ "  + "\n" +
                   "|---  La función es 14x^3+1/2x^2-7x-2  --|"  + "\n" +
                   "_________________________________________ "  + "\n" +
                   "|* Límite inferior = "+lim_inferior          + "\n" +
                   "|* Límite superior = "+lim_superior          + "\n" +
                   "|* Escala = "+escala                         + "\n" +        
                   "_________________________________________ "  + "\n" +
                   "|            TABLA DE VALORES           |  " + "\n" +
                   "|_______________________________________|");

double contador = lim_inferior-escala;
System.out.println("|         x          |        y         |");
while (contador < lim_superior) {    
    contador = contador + escala;
    valory = (14*(Math.pow(contador,3)))+(0.5)*(Math.pow(contador,2))-
            (7*contador)-2;
    
System.out.println(("        "+contador)+"                "+(valory));  
}
System.out.println("|_______________________________________|");        

    
// FIN PROGRAMA
    }
}
