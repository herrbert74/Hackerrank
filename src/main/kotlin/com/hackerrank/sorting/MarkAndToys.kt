package com.hackerrank.sorting

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'maximumToys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY prices
 *  2. INTEGER k
 */

fun maximumToys(prices: Array<Int>, k: Int): Int {
	val sortedPrices = prices.sorted()

	var payable = 0
	var toyCount = 0
	sortedPrices.forEach { price ->
		payable += price
		if (payable <= k) toyCount++
		else return toyCount
	}
	return toyCount
}

private fun swap(a: Array<Int>, i: Int) {
	val temp = a[i]
	a[i] = a[i+1]
	a[i+1] = temp
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val k = first_multiple_input[1].toInt()

	val prices = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = maximumToys(prices, k)

	println(result)
}
