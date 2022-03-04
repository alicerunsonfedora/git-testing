/*
 * Comparinator.kt
 * (C) 2022 Marquis Kurt and authors.
 *
 * This file is part of the Comparinator program.
 */


/**
 * Runs the comparinator algorithm on a list of numbers.
 *
 * A list of integers is broken up into chunks of four numbers. On each chunk, the algorithm will perform the following:
 * 1. Check whether the first three numbers is even or odd.
 * 2. Verify whether the last number in the list appropriately matches the description of the chunk. If the first two
 *    numbers are _even_ and the last number is _odd_, the verification number should be 1. If the first two numbers are
 *    _odd_ and the last number is _even_, the verification number should be 0.
 * 3. Store the number of correctly verified chunks and incorrectly verified chunks.
 *
 * Succinctly, this algorithm checks the parity of the first three numbers and verifies the last number in the chunk by
 * stating that 0 = 2 odd, 1 even, and 1 = 2 even, 1 odd.
 *
 * @param numbers The list of numbers to use to run the algorithm.
 * @return A pair of integers describing the general behavior of the algorithm.
 *
 */
fun comparinator(numbers: List<Int>): Pair<Int, Int> {

    // Run the algorithm for each appropriate chunk. Using the windowed function from the Kotlin standard library makes
    // this easy and abstracts away creating a sliding window.
    numbers.windowed(4, step = 4) { chunk ->

    }

    return Pair(0, 0)
}