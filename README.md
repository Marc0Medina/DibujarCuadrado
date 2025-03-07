# CuadradoAsteriscos

Este es un programa en Java que permite al usuario generar un cuadrado de asteriscos (`*`) de tamaño `n`. El usuario puede cambiar el tamaño del cuadrado, decidir si quiere que sea visible o invisible, y continuar modificando estos parámetros hasta que decida salir. El programa utiliza un ciclo `do-while` para mantener la interacción con el usuario.

## Funcionalidades:

- **Generación de cuadrado:** El programa dibuja un cuadrado de asteriscos con un tamaño específico que el usuario ingresa.
- **Visibilidad controlada:** El cuadrado puede ser visible o invisible, según la elección del usuario.
- **Interactividad:** Permite al usuario modificar el tamaño del cuadrado o cambiar su visibilidad en cualquier momento.
- **Control de entrada:** Valida que el tamaño ingresado sea un número entero positivo.

## Cómo ejecutar el programa:

1. Clona o descarga el repositorio a tu máquina.
2. Asegúrate de tener instalado Java en tu sistema.
3. Compila y ejecuta el programa con los siguientes comandos:

    ```bash
    javac CuadradoAsteriscos.java
    java CuadradoAsteriscos
    ```

## Detalles del código:

- **Atributo `visible`:** Controla la visibilidad del cuadrado. Si es `true`, el cuadrado será visible. Si es `false`, el mensaje "El cuadrado es invisible." será mostrado.
- **Método `dibujarCuadrado(int n)`:** Este método se encarga de imprimir un cuadrado de asteriscos de tamaño `n`. Solo las primeras y últimas filas, así como las primeras y últimas columnas, tendrán asteriscos.
- **Ciclo principal:** El programa ejecuta un ciclo que pide al usuario el tamaño del cuadrado y su visibilidad. El ciclo continuará hasta que el usuario decida salir, ingresando `n` cuando se le pregunte si desea cambiar el tamaño, y `n` o `s` para continuar o salir, respectivamente.


## Requisitos:

- Java 8 o superior.
- Entorno de desarrollo para ejecutar programas Java.

## Licencia:

Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE`.

