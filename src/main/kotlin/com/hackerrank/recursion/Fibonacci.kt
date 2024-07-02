package com.hackerrank.recursion

fun fibonacci(n: Int): Int {
	return when (n) {
		0 -> 0
		1 -> 1
		else -> fibonacci(n - 1) + fibonacci(n - 2)
	}
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val result = fibonacci(n)

	println(result)
}