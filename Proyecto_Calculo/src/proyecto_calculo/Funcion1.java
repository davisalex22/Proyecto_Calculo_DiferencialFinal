package proyecto_calculo;
import java.util.Scanner;
public class Funcion1 {
    public static void main(String[] args) {
// INICIO PROGRAMA
Scanner entrada = new Scanner(System.in);
// Declaración de variables importantes
int lim_inferior = 0;
int lim_superior = 0;
int valory = 0;
// Ingreso por teclado de información
System.out.println(" Ingrese el límite inferior de la tabla de valores:\n ");
lim_inferior = entrada.nextInt();
System.out.println("Ingrese el límite superior de la tabla de valores:\n");
lim_superior = entrada.nextInt();
// Generación de límites de la tabla
System.out.println("|------  La función es 2x^2+4x-3  ------|\n" + "\n" +
                   " Límite inferior = "+lim_inferior+"\n"       + "\n" +
                   " Límite superior = "+lim_superior+"\n"       + "\n" +
                   "|_______________________________________| "  + "\n" +
                   "             TABLA DE VALORES             "  + "\n" +
                   "|_______________________________________|");

int contador = lim_inferior -1;
System.out.println("|         x          |        y         |");
while (contador < lim_superior) {    
    contador = contador + 1;
    valory= (2*(contador*contador))+(4*contador)-3;
    
System.out.println(("      "+contador)+"             ==>      "+(valory));  
}
        
    
// FIN PROGRAMA
    }
}
