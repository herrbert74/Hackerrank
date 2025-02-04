package com.hackerrank.dynamicprogramming

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
import kotlin.math.max
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {
	var a = 0
	var b = 0
	for (x in arr) {
		val temp = a
		a = max(a, b + x)
		b = temp
	}
	return a

}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	val res = maxSubsetSum(arr)

	println(res)
}
