package com.hackerrank.problemsolving

/*
 * Complete the 'findDigits' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun findDigits(n: Int): Int {
	var result = 0
	n.toString().forEach {
		val i = it.digitToInt()
		when {
			i == 1 -> result++
			i > 0 -> if (n.rem(i) == 0) result++
		}
	}
	return result

}

fun main(args: Array<String>) {
	val t = readLine()!!.trim().toInt()

	for (tItr in 1..t) {
		val n = readLine()!!.trim().toInt()

		val result = findDigits(n)

		println(result)
	}
}
