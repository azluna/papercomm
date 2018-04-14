fun main(args: Array<String>) {

    /*
    * Logical Operation
    * && dua & untuk DAN
    * || bukan L i l tapi || untuk ATAU
    * ! untuk tidak NOT
    * */

    var a = 10
    var b = 9
    var c = 8

    //&& intinya keduanya harus benar
    if ((a > b) && (b < a)) {
        println("Ya")
    } else {
        println("Tidak")
    }

    //|| atau salah satu harus benar
        //salah         benar
    if ((a == b) || (b < a)) {
        println("benar")
    } else {
        println("Salah")
    }

}