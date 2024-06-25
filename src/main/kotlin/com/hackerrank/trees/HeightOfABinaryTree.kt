package com.hackerrank.trees

import kotlin.math.max

fun height(root: Node?): Int {
	return if (root == null) -1 else 1 + max(height(root.left), height(root.right))
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val node = Node(a[0])

	a.forEach {
		if (it > 0) node.insert(it)
	}
	println(height(node))
}