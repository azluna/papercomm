fun main(args: Array<String>) {

    var bilanganOne = 10
    var bilanganDua = 3

    var hasilBagi: Double?

    //dia pasti bermasalah karena bilanganOne dan dua itu tipe datanya Int
    //conversi tipe data
    /*
    * toInt() = conversi dari apa ke int
    * toString() = conversi dari apa ke String
    * toFloat() = conversi dari apa ke float
    * toDouble = conversi dari apa ke double
    * */

    hasilBagi = bilanganOne.toDouble() / bilanganDua.toDouble()

    println(hasilBagi)

    println("Hasil dari $bilanganOne / $bilanganDua = ${bilanganOne.toDouble()/bilanganDua.toDouble()}")

}