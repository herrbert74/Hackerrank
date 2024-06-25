package com.hackerrank.problemsolving

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
	var a = 0
	var b = 0
	val s = arr.size
	for (i in arr.indices) {
		a += arr[i][i]
		b += arr[i][s - i - 1]
	}
	return abs(a - b)
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

	for (i in 0 until n) {
		arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
	}

	val result = diagonalDifference(arr)

	println(result)
}
