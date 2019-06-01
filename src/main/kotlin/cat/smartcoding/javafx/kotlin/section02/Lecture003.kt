package cat.smartcoding.javafx.kotlin.section02

/*
*
* Sintaxis Básica
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
* La keyword o palabra reservada no esta limitada a importar clases, también podemos importar:
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

/* El tipo del valor de retorno es implícito */
fun suma(a: Int, b: Int) = a + b

/* El tipo del valor de retorno es explicito, calculado y devuelto dentro del bloque */
fun multiplica(a: Int, b: Int): Int {
    return a * b
}

/* Si una función no devuelve ningun valor, se expresa con el tipo de retorno Unit que es opcional */
fun printIt(): Unit {
    println("""Hola con una
        |cadena multilinea""".trimMargin())
}

/* Kotlin soporta String template */
fun printIt(nombre: String, apellidos: String) {
    println("hola $nombre, ${apellidos.toUpperCase()}")
}

/* En Kotlin, la construcción if() es una expresión, es decir, retorna un valor */
fun maximo(a: Int, b: Int) = if (a > b) a else b

/* Cuando se puede dar el valor null tenemos que declararlo explícitamente */
fun divide(a: Double, b: Double): Double? = if (b == 0.0) null else a / b

/* El operador is y !is comprueba si un objeto es de un determinado tipo o no */
fun longitud(obj: Any): Int? {
    // El cast o conversión de tipos no es necesario, la hace el compilador
    if (obj is String) return obj.length
    return null
}