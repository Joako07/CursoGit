package clases;

import javax.swing.JOptionPane;

public class ClaseMain {

    public static void main(String[] args) {
        int opcion = 0, nodo_informacion = 0;
        Cola cola = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones \n\n"
                        + "1. Insertar un nodo \n"
                        + "2. Extraer un nodo \n"
                        + "3. Mostrar contenido de la Cola \n"
                        + "4. Salir. \n\n"));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingresa el valor a guardar"));
                        cola.Insertar(nodo_informacion);
                        break;

                    case 2:
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                    + cola.Extraer());
                        } else {
                            JOptionPane.showMessageDialog(null,"La Cola esta Vacia");
                        }
                        break;
                        
                    case 3:
                        cola.MostrarContenido();
                        break;

                    case 4:
                        opcion = 4;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 4);
    }
    //Párrafo que agrege para probar Git. No le des importancia
    //Segunda modificacion que le hice 
    //Otra pu
}
