import java.util.*

fun main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    val scanValue = Scanner(System.`in`)
    val n = scanValue.nextInt()

    var phoneBook = mutableMapOf<String, String>()


    for (i in 0 until n) {
        val name =  scanValue.next()
        val phoneNumber =    scanValue.next()

        if (!phoneBook.containsKey(name) && name != "") {
            phoneBook[name] = phoneNumber
        }
    }

    while (scanValue.hasNext()) {
        val names = scanValue.next()
        if (phoneBook.containsKey(names)) {
            println(names + "=" + phoneBook[names])
        } else {
            println("Not found")
        }
    }

    scanValue.close()

}

