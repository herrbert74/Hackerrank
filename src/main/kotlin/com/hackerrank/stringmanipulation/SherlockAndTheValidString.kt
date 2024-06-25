package com.hackerrank.stringmanipulation

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
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun isValid(s: String): String {
	val mapChars = mutableMapOf<Char, Int>()
	s.forEach {
		val current = (mapChars[it] ?: 0) + 1
		mapChars[it] = current
	}
	val mapFreq = mutableMapOf<Int, Int>()
	mapChars.values.forEach {
		val current = (mapFreq[it] ?: 0) + 1
		mapFreq[it] = current
	}
	return if (
		mapFreq.size == 1
		|| mapFreq.size == 2 && (mapFreq.keys.min() + 1 == mapFreq.keys.max()) && mapFreq[mapFreq.keys.max()] == 1
		|| mapFreq.size == 2 && mapFreq[mapFreq.keys.min()] == 1
	) {
		"YES"
	} else {
		"NO"
	}
}

fun main(args: Array<String>) {
	val s = readLine()!!

	val result = isValid(s)

	println(result)
}
