package proyecto_calculo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Funcion6 {

    public static void main(String[] args) {
// INICIO PROGRAMA
        Scanner entrada = new Scanner(System.in);
// Declaración de variables importantes
        double lim_inferior = 0;
        double lim_superior = 0;
        double valory = 0;
        double escala = 0;
        String cadena = "";
        String mensaje_final = "";
        // Ingreso por teclado de información
        cadena = JOptionPane.showInputDialog("Ingrese el límite inferior de la tabla de valores:\n ");
        lim_inferior = Double.parseDouble(cadena);

        cadena = JOptionPane.showInputDialog("Ingrese el límite superior de la tabla de valores:\n ");
        lim_superior = Double.parseDouble(cadena);

        cadena = JOptionPane.showInputDialog("Ingrese la escala de la tabla de valores:\n");
        escala = Double.parseDouble(cadena);
// Generación de límites de la tabla
        mensaje_final += "_________________________________________ " + "\n"
                + "|------  La función es 16x^2+4x-5  ------|" + "\n"
                + "_________________________________________ " + "\n"
                + "|* Límite inferior = " + lim_inferior + "\n"
                + "|* Límite superior = " + lim_superior + "\n"
                + "|* Escala = " + escala + "\n"
                + " __________________ " + "\n"
                + "| TABLA DE VALORES  |  " + "\n"
                + "|__________________|\n";

        double contador = lim_inferior;
        mensaje_final +="|         x   |                y         |\n";
        while (contador < lim_superior) {
            contador = contador + escala;
            valory = (16 * Math.pow(contador, 2)) + (4 * contador) - 5;

            mensaje_final += "        " + contador + "                "
                    + valory + "\n";
            contador += escala;
        }
        mensaje_final += "|__________________|\n";

        // FIN PROGRAMA
        JOptionPane.showMessageDialog(null, mensaje_final);
    }
}
