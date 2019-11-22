fun main(){

    //Part 6 Arithmetic
    var a = 5
    val b = 3.0

//    val result = a + b
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("2 + 2 * 3 = ${ (2 + 2) * 3}")

   // a = a + 2
    //println(a)

    a += 2 // statement
    println("a += 2: $a")

    //unary operators
    println("a++ ${a++}") // return the value and increament
    println("a++ ${++a}") // increment and return

    a -= 2 // statement
    println("a -= 2: $a")

    a *= 2 // statement
    println("a *= 2: $a")

    a /= 2 // statement
    println("a /= 2: $a")

    a %= 2 // statement
    println("a %= 2: $a")

    // assingnments are not expressions
}