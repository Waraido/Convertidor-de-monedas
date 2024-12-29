Conversor de Monedas

Este es un programa desarrollado en Java que permite convertir diversas monedas latinoamericanas a dólares estadounidenses. Es una aplicación sencilla que utiliza la consola para interactuar con el usuario, ofreciendo diferentes opciones de conversión.

Características

Conversión de Soles Peruanos, Pesos Mexicanos, Pesos Colombianos, Pesos Chilenos. Yenes a dólares estadounidenses.

Cálculos precisos con dos decimales.

Menú interactivo en la consola.

Validación básica para opciones incorrectas.

Permite realizar múltiples conversiones sin reiniciar el programa.

Requisitos del Sistema

Java Development Kit (JDK) versión 8 o superior.

Entorno de desarrollo como IntelliJ IDEA, Eclipse, NetBeans, o simplemente un editor de texto como Visual Studio Code.

Consola o terminal para ejecutar el programa.

Cómo Ejecutar el Programa

Clona este repositorio o descarga el archivo Main.java.

Abre el archivo en tu entorno de desarrollo o editor de preferencia.

Compila y ejecuta el programa con los siguientes comandos en la terminal:

javac Main.java
java Main

Sigue las instrucciones que aparecen en la consola para realizar las conversiones.

Funcionamiento del Programa

Al iniciar, el programa muestra un menú interactivo con las siguientes opciones:

1: Convertir Soles Peruanos a dolares.

2: Convertir Pesos Mexicanos a dolares.

3: Convertir Pesos Colombianos a dolares.

4: Convertir Pesos Chilenos a dolares.

5: Convertir Yenes a dolares.

6: Salir del programa.

Ingresa el número de la opción deseada.

Si eliges una opción de conversión, el programa solicitará la cantidad de la moneda local a convertir.

El resultado se mostrará con dos decimales, indicando la cantidad equivalente en dólares.

El programa continuará ejecutándose hasta que selecciones la opción 6 para salir.

Ejemplo de Uso

CONVERSOR DE MONEDAS
1 - Soles Peruanos a dolares
2 - Pesos Mexicanos a dolares
3 - Pesos Colombianos a dolares
4 - Pesos Chilenos a dolares
5 - Yenes a Dolares
6 - Salir
INGRESE UNA OPCIÓN: 1
Ingrese la cantidad de Soles Peruanos: 100
----------------------------------
│  Tienes $27.93 Dólares          │
----------------------------------

Personalización

Si deseas agregar más monedas o modificar las tasas de cambio, edita el método convertir en el código fuente:

case 'X':
    convertir(TASA_DE_CAMBIO, "Nombre de la Moneda", leer);
    break;

Licencia

Este proyecto está bajo la Licencia MIT. Puedes usar, modificar y distribuir el código según los términos de esta licencia.

Autor

Desarrollado por Waraido.

