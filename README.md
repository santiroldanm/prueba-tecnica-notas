# Calculadora de Notas

Prueba Técnica de Calculadora de Notas para PROTECCION S.A

## Descripción

Aplicación Java con interfaz gráfica (GUI) que permite gestionar y analizar notas académicas. El sistema utiliza JOptionPane para proporcionar una experiencia de usuario intuitiva mediante cuadros de diálogo.

## Características

### Funcionalidades Principales

- **Ingreso de Notas**: Permite ingresar 3 notas con validación automática (rango 0-5)
- **Cálculo de Promedio**: Calcula el promedio aritmético de las notas ingresadas
- **Identificación de Extremos**: Determina la nota mayor y menor
- **Clasificación del Promedio**: 
  - Sobresaliente: >= 4.5
  - Bueno: >= 3.5
  - Regular: >= 3.0
  - Deficiente: < 3.0
- **Análisis de Tendencia**: Evalúa si el rendimiento está mejorando, empeorando o es inestable
- **Vista Completa**: Muestra toda la información en un solo reporte

### Validaciones

- Validación de rango numérico (0-5)
- Validación de formato numérico
- Confirmación de cancelación de operaciones
- Verificación de ingreso de notas antes de consultar información

## Estructura del Proyecto

```
prueba-proteccion/
├── CalculadoraNotas.java    # Lógica de cálculo y procesamiento de notas
├── MenuNotas.java            # Interfaz de usuario y menú principal
└── README.md                 # Documentación del proyecto
```

## Requisitos del Sistema

- **Java Development Kit (JDK)**: Versión 8 o superior

## Instalación y Ejecución

### Compilación

```bash
javac MenuNotas.java CalculadoraNotas.java
```

### Ejecución

```bash
java MenuNotas
```

## Uso de la Aplicación

### Menú Principal

Al iniciar la aplicación, se presenta un menú con las siguientes opciones:

1. **Ingresar notas**: Permite registrar las 3 notas del estudiante
2. **Consultar información**: Accede al submenú de consultas
3. **Salir**: Cierra la aplicación

### Submenú de Consultas

Una vez ingresadas las notas, puede consultar:

1. **Ver promedio**: Muestra el promedio calculado con 2 decimales
2. **Ver nota mayor**: Muestra la calificación más alta
3. **Ver nota menor**: Muestra la calificación más baja
4. **Ver clasificación**: Muestra la categoría del promedio
5. **Ver tendencia**: Indica si el rendimiento mejora, empeora o es inestable
6. **Ver todo**: Presenta un reporte completo con toda la información
7. **Volver**: Regresa al menú principal

## Detalles Técnicos

### Clase CalculadoraNotas

Métodos principales:

- `leerNota(int numeroNota)`: Lee y valida una nota individual
- `calcularPromedio(double[] notas)`: Calcula el promedio aritmético
- `notaMayor(double[] notas)`: Encuentra la nota máxima
- `notaMenor(double[] notas)`: Encuentra la nota mínima
- `clasificarPromedio(double promedio)`: Clasifica el promedio según rangos
- `calcularTendencia(double[] notas)`: Analiza la tendencia de las notas
- `mostrarTodo(double[] notas)`: Genera un reporte completo

### Clase MenuNotas

- Gestiona la navegación entre menús
- Controla el flujo de la aplicación
- Maneja el estado de las notas ingresadas
- Implementa la interfaz gráfica con JOptionPane

## Manejo de Errores

La aplicación incluye manejo robusto de errores:

- **NumberFormatException**: Captura entradas no numéricas
- **Validación de rangos**: Verifica que las notas estén entre 0 y 5
- **Confirmación de cancelación**: Evita pérdida accidental de datos
- **Verificación de estado**: Asegura que las notas estén ingresadas antes de consultar

## Ejemplos de Uso

### Caso 1: Rendimiento Sobresaliente
```
Nota 1: 4.8
Nota 2: 4.9
Nota 3: 5.0
Promedio: 4.90
Clasificación: Sobresaliente
Tendencia: Mejorando
```

### Caso 2: Rendimiento Regular
```
Nota 1: 3.5
Nota 2: 3.0
Nota 3: 2.8
Promedio: 3.10
Clasificación: Regular
Tendencia: Empeorando
```

### Caso 3: Rendimiento Inestable
```
Nota 1: 4.0
Nota 2: 2.5
Nota 3: 3.8
Promedio: 3.43
Clasificación: Bueno
Tendencia: Inestable
```

## Autor

Santiago Roldán Muñoz.

## Empresa

PROTECCION S.A

## Licencia

Este proyecto fue desarrollado como parte de una prueba técnica para PROTECCION S.A.

## Notas Adicionales

- La aplicación utiliza `JOptionPane` para una interfaz gráfica simple y efectiva
- El código está diseñado para ser fácil de mantener y extender
- Se implementan buenas prácticas de programación Java
- La validación de datos garantiza la integridad de la información
