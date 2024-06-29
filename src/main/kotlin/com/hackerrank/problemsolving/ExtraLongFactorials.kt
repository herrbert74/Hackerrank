package com.hackerrank.problemsolving

import java.math.BigInteger

/*
 * Complete the 'extraLongFactorials' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun extraLongFactorials(n: Int): Unit {
	var result = BigInteger.ONE
	for (i in 1 until n +1){
		result *= i.toBigInteger()
	}
	println(result)
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	extraLongFactorials(n)
}