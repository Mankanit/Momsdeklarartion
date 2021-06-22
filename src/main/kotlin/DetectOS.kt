enum class OS {
    WINDOWS, LINUX, MAC, SOLARIS
}

val ops = getOS()

fun getOS(): OS? {
    val os = System.getProperty("os.name").lowercase()
    return when {
        os.contains("win") -> {
            OS.WINDOWS
        }
        os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
            OS.LINUX
        }
        os.contains("mac") -> {
            OS.MAC
        }
        os.contains("sunos") -> {
            OS.SOLARIS
        }
        else -> null
    }
}

fun getIt() {

}

/*
fun main() {
    when (getOS())
    {
        OS.WINDOWS -> println("Windows Operating System")
        OS.LINUX -> println("Linux Operating System")
        OS.MAC -> println("Mac Operating System")
        OS.SOLARIS -> println("Solaris Operating System")
        else -> println("Unknown Operating System")
    }
}
*/
