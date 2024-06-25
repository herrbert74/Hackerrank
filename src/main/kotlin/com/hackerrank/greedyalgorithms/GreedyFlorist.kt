package com.hackerrank.greedyalgorithms

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

// Complete the getMinimumCost function below.
fun getMinimumCost(k: Int, c: Array<Int>): Int {
	var result = 0
	val windows = c.sorted().reversed().chunked(k)
	windows.forEachIndexed { i, list ->
		result += list.sum() * (i + 1)
	}
	return result
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val nk = scan.nextLine().split(" ")

	val n = nk[0].trim().toInt()

	val k = nk[1].trim().toInt()

	val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

	val minimumCost = getMinimumCost(k, c)

	println(minimumCost)
}
