fun main() {

    println("Pow!")

    //-------------------------
    var x = 3
    val name = "Cormoran"
    x = x * 10
    print("X is $x.")
    //---------------------------
    while (x > 20) {
        x = x - 1
        println(" X is now $x")
    }
    //---------------------------

    for (i in 1..10) {

       println("X is now $i")
    }
    //---------------------------

    if (x == 20) {
        println("X must be 20")
    } else {
        println("X isn't 20.")
    }
    //----------------------------
    if (name.equals ("Cormoran")) {
        println("$name Strike")
    }





}