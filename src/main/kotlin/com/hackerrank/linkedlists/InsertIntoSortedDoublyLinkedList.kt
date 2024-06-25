package com.hackerrank.linkedlists

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

class DoublyLinkedListNode(nodeData: Int) {
	public var data: Int
	public var next: DoublyLinkedListNode?
	public var prev: DoublyLinkedListNode?

	init {
		data = nodeData
		next = null
		prev = null
	}
}

class DoublyLinkedList {
	public var head: DoublyLinkedListNode?
	public var tail: DoublyLinkedListNode?

	init {
		head = null
		tail = null
	}

	public fun insertNode(nodeData: Int) {
		var node = DoublyLinkedListNode(nodeData)

		if (head == null) {
			head = node
		} else {
			tail?.next = node
			node?.prev = tail
		}

		tail = node
	}

}

fun printDoublyLinkedList(head: DoublyLinkedListNode?, sep: String) {
	var node = head;

	println()
	while (node != null) {
		print(node?.data)
		node = node?.next

		if (node != null) {
			print(sep)
		}
	}
}

/*
 * Complete the 'sortedInsert' function below.
 *
 * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_DOUBLY_LINKED_LIST llist
 *  2. INTEGER data
 */

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data: Int
 *     next: DoublyLinkedListNode
 *     prev: DoublyLinkedListNode
 * }
 *
 */

fun sortedInsert(llist: DoublyLinkedListNode?, data: Int): DoublyLinkedListNode? {
	val node = DoublyLinkedListNode(data)
	if (llist == null) return node
	if (data <= llist.data) {
		node.next = llist
		llist.prev = node
		return node
	}
	val tail = sortedInsert(llist.next, data)
	llist.next = tail
	tail?.prev = llist
	return llist
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val t = scan.nextLine().trim().toInt()

	for (tItr in 1..t) {
		val llistCount = scan.nextLine().trim().toInt()
		val llist = DoublyLinkedList()

		for (i in 0 until llistCount) {
			val llist_item = scan.nextLine().trim().toInt()
			llist.insertNode(llist_item)
		}

		val data = scan.nextLine().trim().toInt()

		val llist1 = sortedInsert(llist?.head, data)

		printDoublyLinkedList(llist1, " ")
	}
}
