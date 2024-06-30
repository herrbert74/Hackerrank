package com.hackerrank.problemsolving

import java.util.Collections.max

/*
 * Complete the 'cutTheSticks' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun cutTheSticks(arr: Array<Int>): Array<Int> {
	var result = arrayOf<Int>()
	var a = arr
	while (a.isNotEmpty()) {
		result = result.plus(a.size)
		val min = a.min()
		var aRes = arrayOf<Int>()
		a.forEach {
			if (it > min) {
				aRes = aRes.plus(it - min)
			}
		}
		a = aRes
	}
	return result
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = cutTheSticks(arr)

	println(result.joinToString("\n"))
}
