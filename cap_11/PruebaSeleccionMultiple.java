// Fig. 11.26: PruebaSeleccionMultiple.java
// Prueba de MarcoSeleccionMultiple.
import javax.swing.JFrame;

public class PruebaSeleccionMultiple
{
public static void main( String args[] )
{
MarcoSeleccionMultiple marcoSeleccionMultiple =
new MarcoSeleccionMultiple();
marcoSeleccionMultiple.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE );
marcoSeleccionMultiple.setSize( 350, 140 ); // establece el tamaño del marco
marcoSeleccionMultiple.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase PruebaSeleccionMultiple