import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean presentacion = true;
        boolean iniciarPrograma = false;

        while (presentacion) {
            int Bienvenida = JOptionPane.showConfirmDialog(null, "<html><body style='text-align: center;'><font face='Arial' size='4' color='green'>Bienvenido al programa de conversion de moneda<br>Challenge java de Alura G4<br><br>By Matias Cabrera</font></body></html>", "Convertidor de moneda",JOptionPane.DEFAULT_OPTION);
            if (Bienvenida != JOptionPane.DEFAULT_OPTION) {
                iniciarPrograma = true;
                presentacion = false;
            } else {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0); // Terminar la ejecución del programa
            }
        }
        while (iniciarPrograma) {
            /* el componente JOptionPane de Swing admiten el uso de etiquetas HTML para formatear el texto en los mensajes. 
            Puedes utilizar etiquetas HTML como <html>, <b>, <i>, <font>,
            entre otras, para personalizar el estilo del texto.*/
                  
            

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos (Arg): ");
            double pesos;
            try {
                pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                continue;
            }
            DecimalFormat FormatoDecimal = new DecimalFormat("#.##");
            //JOptionPane - creamos el cuadro de dialogo
            //showInputDialog -  Metodo para mostrar el cuadro de dialogo
            //1 -parentComponent:null - especifica la ubicacion del cuadro de dialogo 
            //null - es para que se ubique en el centro
            //2 - message: - mensaje para elegir opcion
            //3 - title - nos da el titulo dl cuadro de diaogo
            //4 - JOptionPane.QUESTION_MESSAGE - ícono de pregunta que se muestra junto al mensaje.
            //5 - icon: null - seleccion por defecto
            //6 - String que muestra las opciones a elegir

            String[] categorias = { "Pesos(Arg) a Dólares", "Pesos(Arg) a Euros", "Pesos(Arg) a Libras Esterlinas", "Pesos(Arg) a yenes",
                                "Pesos(Arg) a real"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Convertidor de Moneda", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);


            if (opcion.equals("Pesos(Arg) a Dólares")) {
                double cotizaciondol = 249;
                double dolares = pesos / cotizaciondol ;
                // JOptionPane.showMessageDialog - Cuadro de dialogo
                //1 - Ubicacion de cuadro
                //2 - Mensaje a mostrar
                //3 - Formatea el parametro para mostrarlo adecuadamente
                JOptionPane.showMessageDialog(null,
                        pesos + " Pesos(Arg) son " + FormatoDecimal.format(dolares) + " dolares" + "\nCotizacion dolar oficial: " + cotizaciondol);
            } else if (opcion.equals("Pesos(Arg) a Euros")) {
                double cotizacioneuro = 254.86 ;
                double euros = pesos / cotizacioneuro;
                JOptionPane.showMessageDialog(null, pesos + " Pesos(Arg) son:  " + FormatoDecimal.format(euros) + " euros" + "\nCotizacion Euro: " + cotizacioneuro);
            } else if (opcion.equals("Pesos(Arg) a Libras Esterlinas")) {
                double cotizacionlibra = 296.91 ;
                double libra = pesos / cotizacionlibra;
                JOptionPane.showMessageDialog(null, pesos + " Pesos(Arg) son:  " + FormatoDecimal.format(libra) + " libras esterlinas" + "\nCotizacion Libra: " + cotizacionlibra);
            } else if (opcion.equals("Pesos(Arg) a yenes")) {
                double cotizacionyenes = 1.73;
                double yenes = pesos / cotizacionyenes;
                JOptionPane.showMessageDialog(null, pesos + " Pesos(Arg) son:  " + FormatoDecimal.format(yenes) + " yenes" + "\nCotizacion Yenes: " +  cotizacionyenes);
            } else if (opcion.equals("Pesos(Arg) a real")) {
                double cotizacionreal = 47.57;
                double real = pesos / cotizacionreal;
                JOptionPane.showMessageDialog(null, pesos + " Pesos(Arg) son:  " + FormatoDecimal.format(real) + " real" + "\nCotizacion Real: " +  cotizacionreal);
            }

            //showConfirmDialog - método muestra un cuadro de diálogo con opciones 
            //de confirmación y devuelve un valor que representa la opción 
            //seleccionada por el usuario.
            //1 - Posicion , 2 - mensaje , 3 - titulo 
            //4 - JOptionPane.YES_NO_CANCEL_OPTION, lo que significa que se muestran opciones de "Sí", "No" y "Cancelar". 
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Convertidor de moneda",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmacion == JOptionPane.NO_OPTION || confirmacion == JOptionPane.CANCEL_OPTION) {
                iniciarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0); // Terminar la ejecución del programa
            }
        }

    }
}