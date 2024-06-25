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
import kotlin.math.floor
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
	var cumulative = 0
	var liked: Int
	var shared = 5
	for (i in 1..n) {
		liked = floor(shared.toDouble() * 0.5).toInt()
		cumulative += liked
		shared = liked * 3
	}
	return cumulative
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val result = viralAdvertising(n)

	println(result)
}
