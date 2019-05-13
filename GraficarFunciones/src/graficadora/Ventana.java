package graficadora;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 *
 * @author JuanPablo
 */
public class Ventana extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Graficadora.plano.dibujarFuncion(Graficadora.plano.getGraphics(), 0.6, 0.3, -0.10, -1000, 1000);
    }

}
