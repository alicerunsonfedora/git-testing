import kotlin.system.exitProcess

/*
 * Main.kt
 * (C) 2022 Marquis Kurt and authors.
 *
 * This file is part of the Comparinator program.
 */

/** Executes the main program. */
fun main(args: Array<String>) {
    exitProcess(mainWithReturn(args))
}

fun mainWithReturn(args: Array<String>): Int {
    val argsCode: Int = args.check()
    if (argsCode > 0)
        return argsCode

    val numbers: List<Int> = args.first().parseInput()

    val formatCheck = numbers.checkFormat()
    if (formatCheck > 0) {
        println("""
            Error: The format for the number list is incorrect. See the example for a valid list.
            See the example below for a valid list.
            Example: 22,22,23,1,45,45,44,0
        """.trimIndent())
        return formatCheck
    }

    val (correctVerified, incorrectVerified) = comparinator(numbers)
    println("""
        Number of correctly verified pairs:	    $correctVerified
        Number of incorrectly verified pairs:	$incorrectVerified
    """.trimIndent())
    return 0
}