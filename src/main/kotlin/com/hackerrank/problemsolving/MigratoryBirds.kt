package com.hackerrank.problemsolving

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
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
	val result = arr.groupingBy { it }.eachCount()
	val maxValue = result.values.max()
	val mostFrequent = result.filter { it.value == maxValue }
	return mostFrequent.keys.min()
}

fun main(args: Array<String>) {
	val arrCount = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = migratoryBirds(arr)

	println(result)
}
