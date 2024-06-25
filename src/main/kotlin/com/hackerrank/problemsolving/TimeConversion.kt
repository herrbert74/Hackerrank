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
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
	val hours = s.substring(0,2).toInt()
	val amPm = s.substring(8,10)
	val truncated = s.removeRange(8,10).removeRange(0,2)
	return when{
		hours == 12 && amPm == "AM" -> "00".plus(truncated)
		hours == 12 && amPm == "PM" -> "12".plus(truncated)
		amPm == "PM" -> (hours+12).toString().plus(truncated)
		hours < 10 -> "0".plus(hours.toString()).plus(truncated)
		else -> hours.toString().plus(truncated)
	}

}

fun main(args: Array<String>) {
	val s = readLine()!!

	val result = timeConversion(s)

	println(result)
}
