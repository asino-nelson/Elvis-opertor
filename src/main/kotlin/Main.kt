fun main() {

    val str: String? = null
    var str2: String?
    "This is string 2".also { str2 = it }

    val len1: Int = str ?.length ?: -1
    val len2: Int = str2 ?.length ?: -1

    println("Length of str is $len1")
    println("Length of str2 is $len2")

}