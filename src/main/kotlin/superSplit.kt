val s: String = "#VER  A 1807 20201231  \"Överföring förutbetalda försäkringar\" 20210302"

fun sSplit(str1: String): MutableList<String> {
    val pat = "\\s+".toRegex()
    val str2: String = str1.replace(pat, " ").trim()
    val le = str2.length
    val pol: MutableList<Int> = arrayListOf()
    val parts: MutableList<String> = arrayListOf()
    var space: Boolean = true
    for (i in 0..str2.length-1) {
        if (str2[i].compareTo(' ') == 0) {
            if (space) {
                pol.add(i)
            }
        } else if (str2[i].compareTo('"') == 0) {
            space = !space
        }
    }
    parts.add(str2.substring(0,pol.first()))
    for (i in 0..pol.size - 2) {
        parts.add(str2.substring(pol[i]+1, pol[i + 1]))
    }
    parts.add(str2.substring(pol[pol.size-1]+1,le))
    return parts
}

fun main() {
    println(sSplit(s))

}
