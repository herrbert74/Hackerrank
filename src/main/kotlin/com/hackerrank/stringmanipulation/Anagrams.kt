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
import kotlin.math.min
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.streams.asSequence
import kotlin.text.*

/*
 * Complete the 'makeAnagram' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING a
 *  2. STRING b
 */

fun makeAnagram(a: String, b: String): Int {

	val mapA = mutableMapOf<Char, Int>()
	val mapB = mutableMapOf<Char, Int>()
	a.forEach {
		val current = (mapA[it] ?: 0) + 1
		mapA[it] = current
	}
	b.forEach {
		val current = (mapB[it] ?: 0) + 1
		mapB[it] = current
	}
	var commonCount = 0
	for (i in 'a'..'z' ) {
		commonCount += min(mapA[i] ?: 0, mapB[i] ?:0)
	}
	return a.length + b.length - 2 * commonCount
}

fun main(args: Array<String>) {
	val a = readLine()!!

	val b = readLine()!!

	val res = makeAnagram(a, b)

	println(res)
}
