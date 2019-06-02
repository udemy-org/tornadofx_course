package cat.smartcoding.javafx.kotlin.section02

/*
*
* Los Idioms
*
* En esta lección veremos por encima algunas de las construcciones más características de Kotlin.
*
* */


/*
* La forma más facil que crear un POJO (Plain Old Java Object) es mediante una data clas que proporciona
* getters y setters, y los métodos equals, hashCode, toString, copy, component1, component2, ...
* */
data class Estudiante(val id: Long, val nombre: String = "Desconocido")

/* En Kotlin se pueden asignar valores por defecto a las propiedades de las clases y parámetros de funciones */
