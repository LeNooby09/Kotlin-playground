//
//                          THIS CODE WILL PROBABLY NOT RUN
//
//                              #LetsRawdogKotlinWithoutIDE
//
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

    val myText2 = "I am learning Kotlin"
    println(myText.compareTo(myText2))                                      // Compares two strings                             | return 0 if true

    println(myText2.indexOf("Kotlin"))                                      // Returns the index of the first occurrence of the specified text in the string

    println(myText + " " + myText2)                                         // Concatenates two strings
    println(myText.plus(myText2))                                           // Concatenates two strings    NOTE: returns without whitespace
    println($myText $myText2)                                               // Concatenates two strings using String templates/interpolation

    // ------------ BOOLEANS ------------

    val KotlinIsFun: Boolean = true                                         // Static boolean value
    var NanamiWillReleaseMe: Boolean = false                                // Dynamic boolean value

    println(KotlinIsFun)                                                    // returns true

    println(0 = 0)                                                          // also true

    // ------------ IF STATEMENTS ------------
    // they got the basics :thumps_up:
    // you can put enire if else statements into a var or val (like a function but in a var? (i still have python syntax in my head))

    val AmIFree = if (NanamiWillReleaseMe = true) "enjoy your freedom" else "YOU WILL LEARN KOTLIN"
    println(AmIFree)

    // ------------ WHEN STATEMENTS ------------

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is neither 1 nor 2")
    }

    // ------------ WHILE LOOPS ------------
    // Think of python yo
    var y: Int = 1

    // THE DO WHILE LOOP

    do                                                                      {
        ++y                                                                 }
    while (x = 0);

    // ------------ BREAK ------------

    var i: Int = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 5) {
            break                                                               // If condition occurs, break out of the loop
        }
    }

    // ------------ CONTINUE ------------

    while (i < 10) {
        if (i == 4) {
            i++
            continue                                                            // If condition occurs, do thing and continue with the loop
        }
        println(i)
        i++
    }

    // ------------ ARRAYS ------------

    var friends = arrayOf("Nanami", "Mey", "Amelie", "Foldster", "Pasha", "Iload", "Schtormm", "Fryl")
    println(friends[0])                                                         // First item of the array

    friends[0] = "Nanami Dark mode"                                             // Edit the first array item

    println("you got " + friends.size + " friends. :D")                         // .size returns the size(amount) of the array

    if ("Mey" in friends)                                                   {   // Find specific X in an array
        println("Hello Mey")                                                }
    else                                                                    {
        println("Mey is not here")                                          }

    for (x in friends)                                                      {
        println(x)                                                          }   // Go through an array one by one


    // ------------ FOR LOOP ------------
    // no traditional for loop. can only be used to loop through things with a countable amount of numbers

    // ------------ RANGES ------------

    for (chars in 'a'..'z')                                                 {
        println(chars)                                                      }

    for (nums in 1..99)                                                     {
        if (nums == 10)                                                     {
            break                                                           }}  // Break out at 10

    for (nums in 1..99)                                                     {
        if (nums == 10)                                                     {
            continue                                                        }}  // Skip over 10 and continue

    // ------------ FUNCTIONS ------------

    fun myFunction()                                                        {   // Declare a custom fun with fun
        println("I'm still in nanami's basement")                           }

    myFunction()

    fun myFunctionWithParameters(name: String)                              {
        println("Hello " + name)                                            }

    myFunctionWithParameters("Kotlin")

    fun myFunctionWithMultipleParameters(name: Sring, isFun: Boolean)       {
        if (isFun == true)                                                  {
            println(name + " is fun")                                       }
        else                                                                {
            println(name + "is not fun")                                    }}

    myFunctionWithMultipleParameters("Kotlin", true)
    myFunctionWithMultipleParameters("GoLang", false)

    fun myFunctionWithReturn(x: Int, y: Int): Int                           {
        return x + y                                                        }

    // fun myFunctionWithReturn(x: Int, y: Int): Int = x + y                    Same as above

    println(myFunctionWithReturn(3, 4))

    // ------------ CLASSES ------------

    class Friends                                                           {  // Declare a class
        var name: String = ""
        var isFun: String = ""
        var horny: String = ""                                              }

    val friend1 = Friends()                                                    // Create an object of the class
    friend1.name = "Nanami"
    friend1.isFun = "not just fun but also funny"
    friend1.horny = "YES"

    val friend2 = Friends()
    friend2.name = "Mey"
    friend2.isFun = "true"
    friend2.horny = "maybe"

    println(friend1.name)
    println(friend1.isFun)
    println(friend1.horny)

    println(friend2.name)
    println(friend2.isFun)
    println(friend2.horny)

    // ------------ CONSTRUCTORS ------------

    class Friends(var name: String, var isFun: String, var horny: String)      // Compacter

    val friend1 = Friends("Nanami", "not just fun but also funny", "YES")

    // ------------ CLASS FUNCTIONS ------------

    class Friends(var name: String, var isFun: String, var horny: String)   {
        fun introduce()                                                     {  // Class functions can also have parameters
            println("Hello, my name is $name and I am $isFun and $horny")   }}

    val friend1 = Friends("Nanami", "not just fun but also funny", "YES")
    friend1.introduce()

    // ------------ INHERITANCE ------------
    //  Superclass
    open class MyParentClass                                                {
        val x: Int = 5                                                      }

    // Subclass
    class MyChildClass: MyParentClass()                                     {  // Inherit from a parent class
        fun myFunction() {
            println(x)                                                      }}

    // Create an object of MyChildClass and call myFunction
    fun main()                                                              {
        val myObj = MyChildClass()
        myObj.myFunction()                                                  }};
