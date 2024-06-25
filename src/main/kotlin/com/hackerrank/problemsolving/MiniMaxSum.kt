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
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
	val sum = arr.fold(0L) { acc, i ->
		val a = acc + i.toLong()
		a
	}
	val min = arr.min()
	val max = arr.max()
	println("${sum-max} ${sum - min}")

}

fun main(args: Array<String>) {

	val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	miniMaxSum(arr)
}
