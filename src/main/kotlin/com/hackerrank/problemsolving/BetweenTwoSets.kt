package com.hackerrank.problemsolving

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
	val lcm = lcm(a.toIntArray())
	val gcd = gcd(b.toIntArray())
	var multiple = lcm
	var count = 0
	while (multiple <= gcd) {
		if (gcd.rem(multiple) == 0) {
			count++
		}
		multiple += lcm
	}
	return count

}

private fun lcm(input: IntArray): Int {
	var result = input[0]
	for (i in 1 until input.size) result = lcm(result, input[i])
	return result
}

private fun lcm(a: Int, b: Int): Int {
	return a * (b / gcd(a, b))
}

private fun gcd(a1: Int, b1: Int): Int {
	var a = a1
	var b = b1
	while (b > 0) {
		val temp = b
		b = a % b // % is remainder
		a = temp
	}
	return a
}

private fun gcd(input: IntArray): Int {
	var result = input[0]
	for (i in 1 until input.size) result = gcd(result, input[i])
	return result
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val m = first_multiple_input[1].toInt()

	val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val total = getTotalX(arr, brr)

	println(total)
}
