package com.hackerrank.problemsolving

/*
 * Complete the 'equalizeArray' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun equalizeArray(arr: Array<Int>): Int {
	val counts = arr.groupingBy { it }.eachCount()
	val maxCount = counts.values.max()
	val all = counts.values.sum()
	println("$maxCount, $all")
	return all - maxCount
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = equalizeArray(arr)

	println(result)
}