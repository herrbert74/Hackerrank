package com.hackerrank.hashmaps

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
 * Complete the 'twoStrings' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 *
 * Started at 16:00
 * Finished at 16:05
 */

fun twoStrings(s1: String, s2: String): String {
	val map1 = s1.groupBy { it }
	val map2 = s2.groupBy { it }

	map1.keys.forEach {
		if(map2.keys.contains(it)) {
			return "YES"
		}
	}
	return "NO"
}

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	for (qItr in 1..q) {
		val s1 = readLine()!!

		val s2 = readLine()!!

		val result = twoStrings(s1, s2)

		println(result)
	}
}
