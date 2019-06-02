package cat.smartcoding.javafx.kotlin.section02

/*
*
* Sintaxis Básica
*
* En esta lección veremos la sintaxis básica de Kotlin, posteriormente se profundizará en cada uno de los temas.
*
* Igual que en Java la declaración de package debería estar al inicio del fichero, pero a diferencia de Java,
* no es necesario que haya una correspondencia entre paquetes y directorios.
*
* En Kotlin también hay un paquete por defecto, en el caso de que la declaración package se omita.
*
* Recuerda que estos paquetes siempre se importan automáticamente, por tanto sus clases estan disponibles:
*
* kotlin.*
* kotlin.annotation.*
* kotlin.collections.*
* kotlin.comparisons.* (since 1.1)
* kotlin.io.*
* kotlin.ranges.*
* kotlin.sequences.*
* kotlin.text.*
*
* Y en función de la plataforma se importan otros paquetes. En el caso de la plataforma JVM, se importan:
*
* java.lang.*
* kotlin.jvm.*
*
* Además, también podemos importar otras clases o paquetes:
*
* import paquete.C // La clase C esta disponible sin necesidad de cualificadores
*
* import paquete.* // El contenido del paquete en su totalidad esta disponible sin necesidad de cualificadores
*
* La keyword o palabra reservada 'import' no esta limitada a importar clases, también podemos importar:
*
* Funciones y propiedades
* Funciones y propiedades declaradas dentro de un object
* Constantes enum
*
* Por último, a diferencia de Java, Kotlin no contempla la sintaxis import static; todas esas declaraciones se
* importan mediante la sintaxis regular de la keyword import.
*
* */

/* Así se definen top-level variables de sólo lectura */

val i: Int = 0
val j = 0 // El compilador infiere el tipo Int

/* Así se definen top-level variables de lectura y escritura */

var k: Int = 0
var l = 0

// Al igual que Java y JavaScript, Kotlin soporta comentarios de una línea
/* Y comentarios
   de bloque */
/** Y comentarios Javadoc */

/* Pero a diferencia de Java, /* los comentarios pueden anidarse */ */

/* Así se definen funciones en Kotlin */

/* El tipo del valor de retorno es implícito, Int */
fun suma(a: Int, b: Int) = a + b

/* El tipo del valor de retorno es explicito, calculado y retonado dentro del bloque */
fun multiplica(a: Int, b: Int): Int {
    return a * b
}

/* Si una función no devuelve ningun valor, se expresa con el tipo de retorno 'Unit' que es opcional */
fun printIt(): Unit {
    println(
        """Hola con una
        |cadena multilinea""".trimMargin()
    )
}

/* Kotlin soporta String templates */
fun printIt(nombre: String, apellidos: String) {
    println("hola $nombre, ${apellidos.toUpperCase()}")
}

/* En Kotlin, la construcción 'if' es una expresión, es decir, retorna un valor */
fun maximo(a: Int, b: Int) = if (a > b) a else b

/* Cuando se puede dar el valor 'null' tenemos que declararlo explícitamente */
fun divide(a: Double, b: Double): Double? = if (b == 0.0) null else a / b

/* El operador 'is' y '!is' comprueba si un objeto es de un determinado tipo o no */
fun longitud(obj: Any): Int? {
    // El cast o conversión de tipos no es necesario, la hace el compilador automáticamente
    if (obj is String) return obj.length
    return null
}

/* 'when', el 'switch' de Java, también es una expresión y no un statement u orden, puede retornar un valor */
fun desc(obj: Any): String = when (obj) {
    0 -> "Cero"
    "Hola" -> "Cadena"
    is Int -> "Entero"
    !is String -> "No es cadena"
    else -> "Tipo desconocido"
}

/* El método 'main' sigue siendo el punto de entrada a un fichero o clase Kotlin */
fun main(args: Array<String>) {

    /* Si items es una lista de elementos, podemos recorrer la lista de diferentes maneras */
    val items = arrayOf("Delta", "Alpha", "Echo", "Golf", "Bravo", "Foxtrot", "Charlie")
    for (item in items) println(item)
    for (index in items.indices) println("$index ${items[index]}")

    /* Kotlin también tiene rangos! 'step' es opcional y por defecto és 1. Este bucle escribe del 1 al 5 */
    for (i in 1..5 step 1) println(i)

    /* Este bucle escibe 5, 3, 1 */
    for (i in 5 downTo 1 step 2) println(i)

    /* El operador 'in' nos permite saber si una constante esta dentro de un rango */
    println(1 in 1..5)

    /* En Kotlin la API Collections de Java ha sido mejorada com funciones de extensión y lambdas */
    items
        .filter { it.contains("l") }
        .sortedBy { it.length }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    /* En Kotlin no se utiliza el operador 'new' para crear una instancia de una clase */
    class Cuadrado
    val cuadrado = Cuadrado()
}