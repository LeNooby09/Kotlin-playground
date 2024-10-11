fun main(args : Array<String>)                                          {
    println("Hello from the Zed Editor, I forgot to install the IDE.")
    println("I am doing stuff here.")
    println("This is fun!")                                                 // can't forget the comments ;)
    print(" woah same line :)")
    var Stringy: String = "String"                                          // String and mutable
    val Intiger: Int = 69                                                   // Int and Immutable
    var Variable: String                                                    // Declared but not assigned
    print(Stringy)
    print(Intiger)
    Variable = "assined"                                                    // Assined here
    println(Variable)
    println(Stringy + Variable)                                             // Add vars, I like it
    // ------------ DATA TYPES ------------
    val myNum: Int = 5                                                      // Int
    val myDoubleNum: Double = 6.9                                           // Double
    val myLetter: Char = 'D'                                                // Char
    val myBoolean: Boolean = true                                           // Boolean
    val myText: String = "this is fun"                                      // String
    // ------------ NUMBERS ------------
    val mySmallNum: Byte = 24                                               // only from -128 to 127
    val myShortNum: Short = 32767                                           // only from -32768 to 32767
    val myIntNum: Int = -2147483648                                         // only from -2147483648 to 2147483647
    val myLongNum: Long = 15000000000L                                      // only from -9223372036854775808 to 9223372036854775807
    val myFloatNum: Float = 3.14F                                           // we got decimals OwO                                      | 6 decimals
    val myDoubleNum: Double = 19.99                                         // like "Float" but better                                  | fifteen decimals
    val myPowerOTNum: Double = 12E99                                        // power of ten? SCIENCE
    /* ------------ CONVERTING ------------
    toByte()                                                                be carefull. might bite your finger
    toShort()                                                               yeah, you need to grow more
    toInt()                                                                 (couldn't find a pun)
    toLong()                                                                never heard that...
    toFloat()                                                               I inhaled too much helium
    toDouble()                                                              might aswell go all in
    toChar()                                                                I ain't charming nobody                               */
    /* ------------ MATH ------------
                                                                            It exists
    ++                                                                      Increment by 1
    --                                                                      Decrement by one                                      */
    x++                                                                     //Is this valid?
    ++x                                                                     //Tutorial said that this ia valid
    // ------------ OPERATORS ------------
    val x: Int = 0

    // ------------ COMPARISON OPERATORS ------------

    x == 0                                                                  // Equal to
    x != 1                                                                  // Not equal to
    x > -1                                                                  // Greater than
    x < 1                                                                   // Less than
    x <=0                                                                   // Less than or equal to
    x >=0                                                                   // Greater than or equal to

    // ------------ LOGICAL OPERATORS ------------

    x > 0 && x < 10                                                         // Returns true if both statements are true
    x = 0 || x > 0                                                          // Returns true if one of the statements is true
    // '!'                                                                  Returns false if the statement is true

    // ------------ STRING ACCESS ------------

    println(myText[0])                                                      // Prints the first character of the string
    println(myText[1])                                                      // Prints the second character of the string

    println("myText is " + myText.length + "characters long")               // Prints the length of the string

    println(myText.toUpperCase())                                           // Prints the string in uppercase
    println(myText.toLowerCase())                                           // Prints the string in lowercase


};
