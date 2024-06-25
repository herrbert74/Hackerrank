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
 * Complete the 'alternatingCharacters' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun alternatingCharacters(s: String): Int {
	var previous = 'C'
	return s.fold(0) { acc, current ->
		when (previous) {
			'C' -> {
				previous = current
				acc
			}
			current -> {
				acc + 1
			}
			else -> {
				previous = current
				acc
			}
		}
	}

}

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	for (qItr in 1..q) {
		val s = readLine()!!

		val result = alternatingCharacters(s)

		println(result)
	}
}
