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
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
	val l = a.sorted()
	var result = 0
	var start = 0
	var end = 1
	while (end < a.size) {
		val sub = l.subList(start, end + 1)
		if (end + 1 - start < result) {
			end++
		} else {
			val diff = sub.max() - sub.min()
			if (diff < 2) {
				result = end - start + 1
				end++
			} else {
				start++
			}
		}
	}
	return result
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = pickingNumbers(a)

	println(result)
}
