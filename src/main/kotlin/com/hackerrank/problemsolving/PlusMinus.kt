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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
	val groups = arr.groupingBy {
		when{
			it > 0-> "pos"
			it < 0-> "neg"
			else-> "zero"
		}
	}.eachCount()
	println(BigDecimal.valueOf(groups["pos"]?.toDouble() ?: 0.0).divide(BigDecimal(arr.size), 6, RoundingMode.UP))
	println(BigDecimal.valueOf(groups["neg"]?.toDouble() ?: 0.0).divide(BigDecimal(arr.size), 6, RoundingMode.UP))
	println(BigDecimal.valueOf(groups["zero"]?.toDouble() ?: 0.0).divide(BigDecimal(arr.size), 6, RoundingMode.UP))
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	plusMinus(arr)
}
