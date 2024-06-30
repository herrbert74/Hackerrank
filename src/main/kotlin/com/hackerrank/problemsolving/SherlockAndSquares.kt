package com.hackerrank.problemsolving

import kotlin.math.ceil
import kotlin.math.sqrt

/*
 * Complete the 'squares' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER a
 *  2. INTEGER b
 */

fun squares(a: Int, b: Int): Int {
	val start = ceil(sqrt(a.toFloat())).toInt()
	var result = 0
	var int =start
	while(int * int <= b) {
		result++
		int++
	}
	return result
}

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	for (qItr in 1..q) {
		val first_multiple_input = readLine()!!.trimEnd().split(" ")

		val a = first_multiple_input[0].toInt()

		val b = first_multiple_input[1].toInt()

		val result = squares(a, b)

		println(result)
	}
}
