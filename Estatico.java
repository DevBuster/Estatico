package clasesEstaticas;

import javax.swing.JOptionPane;

/**
 *
 * @author DevBuster
 */
public class Estatico {

    public static String nombre = "Tomioka";
    public static char genero = 'M';
    public static short edad = 23;
    public static int id = 1221109231;
    public static float saldo = 10.554f;

    public static void mostrarInformacion() {

        JOptionPane.showMessageDialog(null, "nombre: " + nombre
                + "\ngenero: " + genero
                + "\nedad: " + edad
                + "\nid: " + id
                + "\nsaldo: " + saldo);
    }
}
