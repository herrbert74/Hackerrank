package com.hackerrank.trees

import kotlin.math.max

fun checkBST(node: Node?): Boolean {
	val leftOK = (node?.left?.key != null &&  node.left!!.key < node.key) || node?.left?.key == null
	val rightOK = (node?.right?.key != null &&  node.right!!.key > node.key) || node?.right?.key == null
	return if (node == null) true else leftOK && rightOK && checkBST(node.left) && checkBST(node.right)
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val node = Node(a[0])

	a.forEach {
		if (it > 0) node.insert(it)
	}
	println(if (checkBST(node)) "Yes" else "No")
}