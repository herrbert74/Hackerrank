package com.hackerrank.problemsolving

import java.math.BigInteger


/*
 * Complete the 'acmTeam' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts STRING_ARRAY topic as parameter.
 */

fun acmTeam(topic: Array<String>): Array<Int> {
	var maxSubject = 0
	var teams = 0

	for (a in topic.indices) {
		val aSubject = BigInteger(topic[a])

		for (b in a + 1 until topic.size) {
			val bSubject = BigInteger(topic[b])
			val abSum = aSubject.add(bSubject).toString()
			val possibleSubject = abSum.replace("0".toRegex(), "")

			if (possibleSubject.length > maxSubject) {
				maxSubject = possibleSubject.length
				teams = 1
			} else if (possibleSubject.length == maxSubject) {
				teams++
			}
		}
	}

	return arrayOf(maxSubject, teams)

}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val m = first_multiple_input[1].toInt()

	val topic = Array<String>(n, { "" })
	for (i in 0 until n) {
		val topicItem = readLine()!!
		topic[i] = topicItem
	}

	val result = acmTeam(topic)

	println(result.joinToString("\n"))
}
