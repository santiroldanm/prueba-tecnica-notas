import javax.swing.JOptionPane;

public class CalculadoraNotas {

    public static double leerNota(int numeroNota) {
        double nota;

        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null,
                        "Ingrese la nota " + numeroNota + " (0 a 5):",
                        "Entrada de Notas",
                        JOptionPane.QUESTION_MESSAGE);

                if (input == null) {
                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "¿Desea cancelar el ingreso de notas?",
                            "Confirmar Cancelación",
                            JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        return -1;
                    }
                    continue;
                }

                nota = Double.parseDouble(input);

                if (nota >= 0 && nota <= 5) {
                    return nota;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "La nota debe estar entre 0 y 5.",
                            "Error de Validación",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Debe ingresar un número válido.",
                        "Error de Formato",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static double notaMayor(double[] notas) {
        double mayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }

    public static double notaMenor(double[] notas) {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    public static String clasificarPromedio(double promedio) {
        if (promedio >= 4.5)
            return "Sobresaliente";
        if (promedio >= 3.5)
            return "Bueno";
        if (promedio >= 3.0)
            return "Regular";
        return "Deficiente";
    }

    public static String calcularTendencia(double[] notas) {
        if (notas[0] <= notas[1] && notas[1] <= notas[2]) {
            return "Mejorando";
        } else if (notas[0] >= notas[1] && notas[1] >= notas[2]) {
            return "Empeorando";    
        } else {
            return "Inestable";
        }
    }

    public static void mostrarTodo(double[] notas) {
        double promedio = calcularPromedio(notas);
        String mensaje = "=== INFORMACIÓN COMPLETA ===\n\n" +
                "Promedio: " + String.format("%.2f", promedio) + "\n" +
                "Nota mayor: " + notaMayor(notas) + "\n" +
                "Nota menor: " + notaMenor(notas) + "\n" +
                "Clasificación: " + clasificarPromedio(promedio) + "\n" +
                "Tendencia: " + calcularTendencia(notas);

        JOptionPane.showMessageDialog(null,
                mensaje,
                "Información Completa",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
