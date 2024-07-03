package com.hackerrank.problemsolving

import kotlin.math.ceil
import kotlin.math.sqrt

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun encryption(s: String): String {
	val l = s.length
	val sqrt = sqrt(l.toFloat())
	val ceiling = ceil(sqrt).toInt()
	val rowCount = if(l>ceiling*(ceiling-1)) ceiling else ceiling-1
	val sp = s.windowed(ceiling, ceiling, true)
	val sb = StringBuilder()
	for (i in 0 until ceiling) {
		for (j in 0 until rowCount) {
			if (i < sp[j].length) {
				sb.append(sp[j][i])
			}
		}
		if (i < ceiling - 1) {
			sb.append(" ")
		}
	}
	return sb.toString()
}

fun main(args: Array<String>) {
	val s = readLine()!!

	val result = encryption(s)

	println(result)
}