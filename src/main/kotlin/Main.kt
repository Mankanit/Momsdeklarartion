import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


val finLin = File("/home/bael/sie/moms.SI")
val finWin = File("c:/sie/moms.si")

fun readLines() {
    val fin: File

    if (OS.WINDOWS == getOS()) {
        fin = finWin
    } else {
        fin = finLin
    }
    fin.bufferedReader().forEachLine {
        val li: List<String> = it.trim().split(" ")
        println("${li.size}")
        for (i in li) {
            print(" $i")
        }
        println()
    }

}

fun main() {
    readLines()
//    println(getOS())

}