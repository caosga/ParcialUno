package uniquindio.edu.co;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int opcion = 0;

        while (opcion != 2) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese una opción\n" +
                            "1. Registrar huésped\n" +
                            "2. Salir\n"
            ));
            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Aquí se llamaría el método");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Finalizando programa...");
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta. Intente con otro número válido");
            }
        }
    }

}