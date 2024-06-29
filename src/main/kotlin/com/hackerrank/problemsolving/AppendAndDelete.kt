package com.hackerrank.problemsolving

/*
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */

fun appendAndDelete(s: String, t: String, k: Int): String {
	var matchCount = 0
	var match = true
	while (match) {
		if (s.length > matchCount && t.length > matchCount && s[matchCount] == t[matchCount]) {
			matchCount++
		} else {
			match = false
		}
	}
	val minRequiredSteps = s.length + t.length - 2 * matchCount
	val maxRequiredSteps = s.length + t.length
	if (minRequiredSteps > k) {
		return "No"
	} else {
		if (k in (minRequiredSteps + 1)..<maxRequiredSteps) {
			return if ((minRequiredSteps - k).rem(2) == 0) {
				"Yes"
			} else {
				"No"
			}
		}
		return "Yes"
	}
}

fun main(args: Array<String>) {
	val s = readLine()!!

	val t = readLine()!!

	val k = readLine()!!.trim().toInt()

	val result = appendAndDelete(s, t, k)

	println(result)
}
