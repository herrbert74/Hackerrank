package com.hackerrank.problemsolving

import kotlin.math.max

/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
	var max = 0
	val map = s.toList().groupingBy { it.rem(k) }.eachCount()
	if (map[0] != null) max++
	if (k.rem(2) == 0 && map[k / 2] != null) max++

	for (i in 1 until k / 2 + 1) {
		if (k == 2 * i) continue  //avoid double counting when k is even

		max +=  max(map.getOrElse(i) { 0 }, map.getOrElse(k - i) { 0 })
	}
	return max
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val k = first_multiple_input[1].toInt()

	val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = nonDivisibleSubset(k, s)

	println(result)
}
