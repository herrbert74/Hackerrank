package com.hackerrank.problemsolving

import java.util.*


/*
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */
fun biggerIsGreater(w: String): String {

	for (i in w.length - 2 downTo 0 step 1) {
		for (j in w.length - 1 downTo i step  1) {
		if (w[i] < w[j]) {
			val wb =  StringBuilder(w)

			// Swap to pivot position
			val pivot = w [i]
			wb.setCharAt(i, w[j])
			wb.setCharAt(j, pivot)

			// All strings before pivot + pivot + all strings after pivot in ascending order
			return wb.substring(0, i) + wb.substring(i, i + 1) + ascendingOrder(wb.substring(i + 1, wb.length));
		}
	}
	}
	return ("no answer");
}

fun ascendingOrder(input: String): String {
	val chars = input.toCharArray()
	Arrays.sort(chars)
	return String(chars)
}

fun main(args: Array<String>) {
	val T = readLine()!!.trim().toInt()

	for (TItr in 1..T) {
		val w = readLine()!!

		val result = biggerIsGreater(w)

		println(result)
	}
}