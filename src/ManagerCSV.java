import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;

public class ManagerCSV {
    private BufferedReader lector;//lee el archivo
    private String linea;//recibe la linea
    private String partes[] = null;//almacena las lineas

    /**
     * Permite la lectura del archivo en terminal
     * @param nombreArchivo
     */
    public void leerArchivos(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo)) ;
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(";");
                imprimirlinea();
                System.out.println();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    /**
     * método para imprimir las lineas
     */
    public void imprimirlinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]+" | ");
        }
    }
}
