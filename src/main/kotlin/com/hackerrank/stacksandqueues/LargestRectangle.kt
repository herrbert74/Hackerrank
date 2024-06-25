package com.hackerrank.stacksandqueues

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.max
import kotlin.text.*

/*
 * Complete the 'largestRectangle' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts INTEGER_ARRAY h as parameter.
 */
fun Stack<Int>.safePeek() = if (empty()) -1 else peek()

fun largestRectangle(h: Array<Int>): Long {
	var maxArea = 0L
	val stack = Stack<Int>()
	var i = 0
	while (i < h.size) {
		if (stack.isEmpty() || h[stack.peek()] <= h[i]) {
			stack.add(i++)
		} else {
			maxArea = max(maxArea, h[stack.pop()].toLong() * (i - 1 - stack.safePeek()))
		}
	}
	while (stack.isNotEmpty()) maxArea = max(maxArea, h[stack.pop()].toLong() * (h.lastIndex - stack.safePeek()))
	return maxArea
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val result = largestRectangle(h)

	println(result)
}
