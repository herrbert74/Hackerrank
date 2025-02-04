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

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
	val dA = abs(z - x)
	val dB = abs(z - y)
	return when {
		dA > dB -> "Cat B"
		dA < dB -> "Cat A"
		else -> "Mouse C"
	}
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val q = scan.nextLine().trim().toInt()

	for (qItr in 1..q) {
		val xyz = scan.nextLine().split(" ")

		val x = xyz[0].trim().toInt()

		val y = xyz[1].trim().toInt()

		val z = xyz[2].trim().toInt()

		val result = catAndMouse(x, y, z)

		println(result)
	}
}
