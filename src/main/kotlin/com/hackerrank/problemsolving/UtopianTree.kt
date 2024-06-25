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
 * Complete the 'utopianTree' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun utopianTree(n: Int): Int {
	var isDoubling = true
	var result = 1
	for (i in 0 until n) {
		if(isDoubling) result *= 2
		else result+=1
		isDoubling = !isDoubling
	}
	return result
}

fun main(args: Array<String>) {
	val t = readLine()!!.trim().toInt()

	for (tItr in 1..t) {
		val n = readLine()!!.trim().toInt()

		val result = utopianTree(n)

		println(result)
	}
}
