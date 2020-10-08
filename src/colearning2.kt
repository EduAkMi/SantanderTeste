import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val arrayNulo : ArrayList<String?> = arrayListOf()

    arrayNulo.add(null)
    arrayNulo.add("Pato")
    arrayNulo.add("Cachorro")
    arrayNulo.add("Gato")

    println(arrayNulo[0])
    println(arrayNulo[1])
    println(arrayNulo[2])
    println(arrayNulo[3])
}