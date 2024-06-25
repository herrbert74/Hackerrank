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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'formingMagicSquare' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY s as parameter.
 */

fun formingMagicSquare(s: Array<Array<Int>>): Int {
//There are 8 permutations with 5 in the middle. Calculate the costs for all 8 and return the minimum
	val square = s[0]+s[1]+s[2]
	val matrix = arrayOf(
		intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
		intArrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8),
		intArrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4),
		intArrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
		intArrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
		intArrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
		intArrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
		intArrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6)
	)

	var minOff = 99
	for (i in 0..7) {
		var off = 0
		for (j in 0..8) {
			if (square[j] != matrix[i][j]) {
				off += abs((square[j] - matrix[i][j]))
			}
		}
		if (off < minOff) minOff = off
	}
	return minOff
}

fun main(args: Array<String>) {

	val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

	for (i in 0 until 3) {
		s[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
	}

	val result = formingMagicSquare(s)

	println(result)
}
