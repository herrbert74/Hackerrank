package com.hackerrank.greedyalgorithms

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.abs
import kotlin.math.min
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'minimumAbsoluteDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
	arr.sort()
	var minDiff = 2000000000
	for (i in 0 until arr.size - 1) {
		val absDiff = abs(arr[i + 1] - arr[i])
		minDiff = min(minDiff, absDiff)
	}
	return minDiff
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val result = minimumAbsoluteDifference(arr)

	println(result)
}
