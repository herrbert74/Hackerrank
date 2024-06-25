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
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
	val notLeapYear = "13.09."
	val conversionYear = "26.09."
	val leapYear = "12.09."
	val isLeapYear = (year < 1918 && year.rem(4) == 0) ||
		(year > 1918 && year.rem(4) == 0 && (year.rem(100) != 0 || year.rem(400) == 0 ))
	return "${if (isLeapYear) leapYear else if(year==1918) conversionYear else notLeapYear}$year"
}

fun main(args: Array<String>) {
	val year = readLine()!!.trim().toInt()

	val result = dayOfProgrammer(year)

	println(result)
}
