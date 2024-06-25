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
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
	var min: Int? = null
	var max: Int? = null
	var minCount = 0
	var maxCount = 0
	for (i in scores) {
		if (min == null){
			min = i
			max = i
		}else {
			if (i < min) {
				min = i
				minCount++
			}
			if (i > max!!) {
				max = i
				maxCount++
			}
		}
	}
	return arrayOf(maxCount, minCount)

}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = breakingRecords(scores)

	println(result.joinToString(" "))
}
