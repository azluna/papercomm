fun main(args: Array<String>) {

    var a = 3
    var b = 4


    //versi curly
    if (a == b) {
        println("Benar!")
    } else {
        println("Kurang benar")
        println("Benarkah?")
        b = 3
    }

    //versi one line, syarat aksinya itu harus 1

    if (a == b) println("Benars") else println("Salah")

}