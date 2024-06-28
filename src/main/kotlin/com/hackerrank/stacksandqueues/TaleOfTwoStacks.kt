package com.hackerrank.stacksandqueues

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

class Q {
	private val stackA = Stack<Int>()
	private val stackB = Stack<Int>()

	fun put(i: Int) {
		stackA.push(i)
	}

	fun pop() {
		if(stackB.isEmpty()) {
			while (!stackA.empty()) {
				stackB.push(stackA.pop())
			}
		}
		stackB.pop()
	}

	fun peek() {
		if(stackB.isEmpty()) {
			while (!stackA.empty()) {
				stackB.push(stackA.pop())
			}
		}
		println(stackB.peek())
	}
}

fun main(args: Array<String>) {
	val t = readln().trim().toInt()

	val list = mutableListOf<List<Int>>()
	for (tItr in 1..t) {
		val s = readln().split(" ").map { it.toInt() }

		list.add(s)

	}
	val queue = Q()
	list.forEach { l ->
		when (l[0]) {
			1 -> queue.put(l[1])
			2 -> queue.pop()
			else -> queue.peek()
		}
	}
}
