package proyecto_calculo;

import java.util.Scanner;
import javax.swing.JOptionPane;

//librerias para graficas
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Funcion1 extends JPanel {
    public static void main(String[] args) {
        // INICIO PROGRAMA
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables importantes
        String cadena;
        double lim_inferior = 0;
        double lim_superior = 0;
        double valory = 0;
        double escala = 0;
        String mensaje_final = "";
        // Ingreso por teclado de información
        cadena = JOptionPane.showInputDialog("Ingrese el límite inferior de la tabla de valores:\n ");
        lim_inferior = Double.parseDouble(cadena);

        cadena = JOptionPane.showInputDialog("Ingrese el límite superior de la tabla de valores:\n ");
        lim_superior = Double.parseDouble(cadena);

        cadena = JOptionPane.showInputDialog("Ingrese la escala de la tabla de valores:\n");
        escala = Double.parseDouble(cadena);
        
//            System.out.println(" Ingrese el límite inferior de la tabla de valores:\n ");
//            lim_inferior = entrada.nextInt();
//            System.out.println("Ingrese el límite superior de la tabla de valores:\n");
//            lim_superior = entrada.nextInt();
//            System.out.println("Ingrese la escala de la tabla de valores:\n");
//            escala = entrada.nextDouble();
        // Generación de límites de la tabla
        mensaje_final +="_________________________________________" + "\n"
                + "|------  La función es 2x^2+4x-3  ------|" + "\n"
                + "_________________________________________" + "\n"
                + "|* Límite inferior = " + lim_inferior + "\n"
                + "|* Límite superior = " + lim_superior + "\n"
                + "|* Escala = " + escala + "\n"
                + "_________________________________________ " + "\n"
                + "|            TABLA DE VALORES           |  " + "\n"
                + "|_______________________________________|\n";

        double contador = lim_inferior;
        mensaje_final += "|         x          |        y         | \n";
        while (contador <= lim_superior) {
            valory = (2 * Math.pow(contador, 2)) + (4 * contador) - 3;

            mensaje_final +="        " + contador + "                "
                    + valory + "\n";
            contador += escala;
        }
        mensaje_final += "|_______________________________________|";

        // FIN PROGRAMA
        JOptionPane.showMessageDialog(null, mensaje_final);
    }
}
