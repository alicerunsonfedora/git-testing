/*
 * Utils.kt
 * (C) 2022 Marquis Kurt and authors.
 *
 * This file is part of the Comparinator program.
 */

/** A type alias for an array of strings representing arguments to the program. */
typealias Arguments = Array<String>

/**
 * Checks that a given array of strings works as a valid list of arguments for the program.
 * @return The return code for the program if the check fails.
 */
fun Arguments.check(): Int {
    if (count() != 1) {
        println("""
            Usage: comparinator <num_list>
            
            ARGUMENTS:
                <num_list>      A list of numbers to be used to run the comparinator program.
        """.trimIndent())
        return 1
    }

    val checkedRegex = Regex("^(\\d+,?)+$", options = setOf(RegexOption.MULTILINE))
    if (!checkedRegex.matches(first())) {
        println("""
            Error: Argument supplied is not a list of numbers, or is formatted incorrectly.
            Example: 22,22,23,1,45,45,44,0
        """.trimIndent())
        return 1
    }

    return 0
}


/**
 * Converts a string of formatted numbers into an appropriate list to be use for the comparinator program.
 *
 * The input format is a list of numbers, separated by a comma: `23,23,22,1,22,22,21,0`.
 * @return A list of numbers to run the program with.
 */
fun String.parseInput(): List<Int> = this
    .split(",")
    .map { it.toInt() }

/**
 * Verifies that the list of numbers is of a correct format.
 * @return The return code for the program if the check fails.
 */
fun List<Int>.checkFormat(): Int = if (this.count() % 4 != 0) 2 else 0