package com.hackerrank.problemsolving

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'designerPdfViewer' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h
 *  2. STRING word
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
	var maxHeight = 0
	word.forEach {
		val height = h[(it - 97).code]
		if (height > maxHeight) {
			maxHeight = height
		}
	}
	return maxHeight * word.length
}

fun main(args: Array<String>) {

	val h = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val word = readLine()!!

	val result = designerPdfViewer(h, word)

	println(result)
}
