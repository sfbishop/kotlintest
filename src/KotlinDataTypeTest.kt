fun main(){
    val exampleString  = "Steve"
    val exampleRawString  = """Test Raw"""
    println(exampleString)
    println(exampleRawString)
    val exampleNumberDouble : Double // declare
    exampleNumberDouble = 2000.22 // init

    val exampleNumber = 44 // compiler figures out the type, in this case Int
    val exampleNumberAsLong : Long = exampleNumber.toLong() // with the Type Defined

    val exampleChar = 'A' //unlike Java char are not Int
    val exampleBoolean = false

}