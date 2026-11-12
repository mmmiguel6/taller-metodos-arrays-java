# Respuestas a Escenarios Exploratorios ("¿Y si...?") - Métodos y Arrays Java 25

Este documento contiene la resolución conceptual a los escenarios alternativos planteados en los ejercicios del taller de Métodos y Arrays.

* **01 LavaYa: el ticket**
  * **¿Qué pasa si escribes `imprimirTicket(6, "Ana")`?**
    Genera un error de compilación por discordancia de tipos (*Type mismatch*). Java exige que los argumentos coincidan estrictamente con el orden y tipo de los parámetros definidos (`String`, y luego `int`).
* **02 LavaYa: ¿cuánto cuesta lavar?**
  * **¿Por qué conviene que el método devuelva el precio en vez de imprimirlo?**
    Por modularidad. Si el método devuelve el valor con `return`, el contexto de llamada (`main`) puede utilizar ese dato aritméticamente (sumarlo a un ingreso total, aplicar un impuesto adicional, guardarlo en una base de datos) en lugar de solo limitarse a mostrarlo en la consola.
* **03 TeleRed: costo de una llamada**
  * **¿Cómo agregarías un tercer tipo de llamada, a celular, de $200 por minuto?**
    Se reemplaza el parámetro `boolean internacional` por un `String tipo` o un `int tipoDestino`. Dentro del método, se implementa una estructura condicional `switch` o `if/else if` para asignar la tarifa de 150, 900 o 200 según el tipo ingresado.
* **04 Videojuego: experiencia y rango**
  * **¿Qué rango tendría un jugador con exactamente 500 XP?**
    Obtendría el rango "Guerrero". La condición relacional planteada evalúa si los puntos son `>= 500` (mayor o igual a 500), por lo que el 500 es inclusivo en este bloque lógico.
* **05 Parqueadero: un método llama a otro**
  * **¿Qué ventaja tiene que `cobrar` use `horasCobradas` en vez de repetir el cálculo?**
    Evita la duplicación de código y respeta el principio DRY (*Don't Repeat Yourself*). Si cambian las políticas del parqueadero (ej. cobrar por fracción de 30 minutos), solo se modifica un método, y todos los procesos dependientes asimilarán el cambio automáticamente.
* **06 Tu playlist: recorrer un array**
  * **¿Qué pasa si intentas mostrar `canciones[4]`?**
    Se lanza la excepción en tiempo de ejecución `ArrayIndexOutOfBoundsException`. Como el arreglo tiene tamaño 4, sus índices válidos en base-cero son exclusivamente `0`, `1`, `2` y `3`.
* **07 LavaYa: ventas de la semana**
  * **¿Cómo mostrarías solo el total de lunes a viernes?**
    Cambiando el límite superior del ciclo iterativo. En lugar de iterar hasta `ventas.length`, el `for` debe evaluar `i < 5`, lo que sumará únicamente los índices del 0 (lunes) al 4 (viernes).
* **08 TeleRed: el mes de más consumo**
  * **¿Qué cambias para encontrar el mes de menor consumo?**
    Se invierte el operador relacional en la evaluación lógica del iterador. La condición cambiaría a `if (gigas[i] < gigas[posMenor])`.
* **09 Torneo: ¿cuántos ganan premio?**
  * **¿Cuándo no sirve el for-each?**
    No sirve en tres escenarios principales: cuando se necesita saber el índice de la posición actual, cuando se requiere alterar el valor original almacenado en el arreglo, o cuando se desea iterar en un orden no secuencial (ej. de atrás hacia adelante o saltando posiciones).
* **10 Línea de atención: buscar un cliente**
  * **¿Qué pasa si buscas "sara" en minúscula? ¿Cómo lo arreglas con `equalsIgnoreCase`?**
    La búsqueda fallará porque `.equals()` es sensible a mayúsculas. Para arreglarlo y flexibilizar la entrada, se cambia la evaluación por `if (clientes[i].equalsIgnoreCase(buscado))`, ignorando las diferencias de caja fuerte.
* **11 Un método que recibe un array**
  * **¿Qué pasaría si le pasas un array vacío? ¿Cómo lo evitarías?**
    La división `suma / notas.length` provocaría una división por cero (`0.0 / 0.0`), resultando en `NaN` (*Not a Number*). Se evita insertando una guarda al inicio de la subrutina: `if (notas.length == 0) return 0.0;`.
* **12 Tienda de celulares: llenar un array**
  * **¿Cómo mostrarías también cuántas unidades hay en total?**
    Declarando una variable sumadora `int total = 0;` en el `main`. Dentro de cualquiera de los ciclos `for`, se acumula cada ingreso: `total += stock[i];`. Al finalizar, se imprime la variable.
* **13 LavaYa: precio de cada servicio**
  * **¿Cómo calcularías el total si el cliente pide dos servicios?**
    Capturando dos lecturas por consola, pasándolas al método `buscar()` y depositando sus resultados en dos variables (ej. `pos1` y `pos2`). Luego, si ambos resultados son diferentes de `-1`, se suman las tarifas: `precios[pos1] + precios[pos2]`.
* **14 TeleRed sube sus tarifas**
  * **¿Por qué aquí no sirve el for-each para cambiar los valores?**
    Porque la variable declarada en un `for-each` contiene una copia del valor iterado, no la referencia de la celda de memoria. Alterar esta copia local no muta el contenido del arreglo original; se requiere un `for` clásico para modificar usando `tarifas[i]`.
* **15 Encuesta del internet hogar**
  * **¿Cómo mostrarías el porcentaje de clientes que dieron 5 estrellas?**
    Se calcula aplicando una regla de tres mediante conversión flotante para no truncar decimales: `double porcentaje = (conteo[5] * 100.0) / votos.length;` y se imprime el resultado.
* **16 Reto final: tabla del torneo gamer**
  * **¿Cómo escribirías un método que muestre la tabla completa: nombre y puntos?**
    Definiendo `void mostrarTabla(String[] n, int[] p)` y utilizando un ciclo `for` tradicional iterando sobre el tamaño de cualquiera de ellos (ya que son paralelos). Dentro del ciclo se imprime: `n[i] + ": " + p[i]`.
