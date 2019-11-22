// a new function
// main has a special purpose, same as Java
fun main() {
    // we use val instead of var since we don't want to change userName
    // val is like final keyword in JAva
    // we don't need to kotlin what type (String) it is
    val userName = "Steve" // new variable with camelCase, of type String

    // statically typed checked variables. "at compile time"
    var age: Int = 44

    println("Hello, World! My name is $userName. I am $age years old. In two years i will ${age + 5}")
    //secondFunction()
}

fun secondFunction(){
    println("2nd function")
}