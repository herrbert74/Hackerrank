package com.hackerrank.hashmaps

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'sherlockAndAnagrams' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 *
 * Started at 16:11
 * Started at 17:14
 */

fun sherlockAndAnagrams(s: String): Int {
	var result = 0
	for (i in 1 until s.length) {
		val windowedListOfStrings = s.windowed(i, 1)
		val mapsOfCharacterCounts = windowedListOfStrings.map { str -> str.groupingBy { it }.eachCount() }
		val mapsOfSameCharacterCounts = mapsOfCharacterCounts.groupingBy { it }.eachCount()
		result += mapsOfSameCharacterCounts.values.sumOf {
			var combinations = 0
			for (j in 0 until it) combinations += j
			combinations
		}
	}
	return result
}

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	for (qItr in 1..q) {
		val s = readLine()!!

		val result = sherlockAndAnagrams(s)

		println(result)
	}
}
