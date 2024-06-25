package com.hackerrank.problemsolving

import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.pow

/*
 * Complete the 'beautifulDays' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER i
 *  2. INTEGER j
 *  3. INTEGER k
 */

fun beautifulDays(i: Int, j: Int, k: Int): Int {
	var result = 0
	for (h in i..j) {
		var reverse = 0
		val kLength = log10(h.toDouble()).toInt() + 1
		for (l in 0 until kLength) {
			val rem = h.rem(10.0.pow(kLength - l.toDouble()))
			val digit = rem / 10.0.pow(kLength - l.toDouble() - 1)
			reverse += digit.toInt() * 10.0.pow(l.toDouble()).toInt()
		}
		if(abs(h - reverse).rem(k) == 0) result++
	}
	return result
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val i = first_multiple_input[0].toInt()

	val j = first_multiple_input[1].toInt()

	val k = first_multiple_input[2].toInt()

	val result = beautifulDays(i, j, k)

	println(result)
}
