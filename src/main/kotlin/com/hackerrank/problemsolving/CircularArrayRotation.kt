package com.hackerrank.problemsolving

/*
 * Complete the 'circularArrayRotation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER k
 *  3. INTEGER_ARRAY queries
 */

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
	val rotations = k.rem(a.size)
	val array = a.toList().subList(a.size - rotations, a.size) + a.toList().subList(0, a.size - rotations)
	return  array.slice(queries.toList()).toTypedArray()
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val k = first_multiple_input[1].toInt()

	val q = first_multiple_input[2].toInt()

	val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val queries = Array<Int>(q, { 0 })
	for (i in 0 until q) {
		val queriesItem = readLine()!!.trim().toInt()
		queries[i] = queriesItem
	}

	val result = circularArrayRotation(a, k, queries)

	println(result.joinToString("\n"))
}
