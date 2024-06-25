package com.hackerrank.trees

import kotlin.math.min

fun lca(node: Node, a: Int, b: Int): Int {
	val stackA = mutableListOf<Node>()
	stackA.add(node)
	var actualNode: Node = node
	while (true) {
		if (a < actualNode.key) {
			actualNode = actualNode.left!!
			stackA.add(actualNode)
		} else if (a > actualNode.key) {
			actualNode = actualNode.right!!
			stackA.add(actualNode)
		} else {
			break
		}
	}
	val stackB = mutableListOf<Node>()
	stackB.add(node)
	actualNode = node
	while (true) {
		if (b < actualNode.key) {
			actualNode = actualNode.left!!
			stackB.add(actualNode)
		} else if (b > actualNode.key) {
			actualNode = actualNode.right!!
			stackB.add(actualNode)
		} else {
			break
		}
	}
	var result: Node? = node
	for (i in 0 until min(stackA.size, stackB.size)) {
		val resA = stackA.removeAt(0)
		val resB = stackB.removeAt(0)
		if (resA.key != resB.key) {
			return result?.key ?: 0
		} else {
			result = resA
		}
	}
	return result?.key ?: 0
}

class Node(
	var key: Int,
	var left: Node? = null,
	var right: Node? = null
) {

	fun insert(value: Int) {
		if (value > this.key) {
			if (this.right == null) {
				this.right = Node(value)
			} else {
				this.right!!.insert(value)
			}
		} else if (value < this.key) {
			if (this.left == null) {
				this.left = Node(value)
			} else {
				this.left!!.insert(value)
			}
		}
	}

}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val node = Node(a[0])

	a.forEach {
		if (it > 0) node.insert(it)
	}

	println(lca(node, b[0], b[1]))
}