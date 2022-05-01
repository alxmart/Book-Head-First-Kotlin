fun main() {
    var x = 10
    while (x > 1) {
        x = x - 1
        print(if (x < 3) "Small x. X is $x" else "Big X.")
    }
}