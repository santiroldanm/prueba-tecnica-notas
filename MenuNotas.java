import javax.swing.JOptionPane;

public class MenuNotas {
    public static void main(String[] args) {
        double[] notas = new double[3];
        boolean notasIngresadas = false;
        int opcion;

        do {
            String[] opciones = { "Ingresar notas", "Consultar información", "Salir" };

            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción:",
                    "MENÚ PRINCIPAL - Calculadora de Notas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                opcion = 2;
            }

            switch (opcion) {
                case 0:
                    boolean cancelado = false;
                    for (int i = 0; i < notas.length; i++) {
                        double nota = CalculadoraNotas.leerNota(i + 1);
                        if (nota == -1) {
                            cancelado = true;
                            break;
                        }
                        notas[i] = nota;
                    }

                    if (!cancelado) {
                        notasIngresadas = true;
                        JOptionPane.showMessageDialog(null,
                                "Notas registradas correctamente.",
                                "Éxito",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 1:
                    if (!notasIngresadas) {
                        JOptionPane.showMessageDialog(null,
                                "Primero debe ingresar las notas.",
                                "Advertencia",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        mostrarSubmenu(notas);
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar la Calculadora de Notas.\n¡Hasta pronto!",
                            "Salir",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (opcion != 2);
    }

    private static void mostrarSubmenu(double[] notas) {
        int opcion;
        do {
            String[] opciones = {
                    "Ver promedio",
                    "Ver nota mayor",
                    "Ver nota menor",
                    "Ver clasificación",
                    "Ver tendencia",
                    "Ver todo",
                    "Volver"
            };

            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione la información que desea consultar:",
                    "CONSULTAS - Información de Notas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                return;
            }

            switch (opcion) {
                case 0:
                    double promedio = CalculadoraNotas.calcularPromedio(notas);
                    JOptionPane.showMessageDialog(null,
                            "Promedio: " + String.format("%.2f", promedio),
                            "Promedio de Notas",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Nota mayor: " + CalculadoraNotas.notaMayor(notas),
                            "Nota Mayor",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Nota menor: " + CalculadoraNotas.notaMenor(notas),
                            "Nota Menor",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    double prom = CalculadoraNotas.calcularPromedio(notas);
                    String clasificacion = CalculadoraNotas.clasificarPromedio(prom);
                    JOptionPane.showMessageDialog(null,
                            "Clasificación: " + clasificacion,
                            "Clasificación del Promedio",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4:
                    String tendencia = CalculadoraNotas.calcularTendencia(notas);
                    JOptionPane.showMessageDialog(null,
                            "Tendencia: " + tendencia,
                            "Tendencia de las Notas",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 5:
                    CalculadoraNotas.mostrarTodo(notas);
                    break;

                case 6:
                    return;
            }

        } while (opcion != 6);
    }
}
