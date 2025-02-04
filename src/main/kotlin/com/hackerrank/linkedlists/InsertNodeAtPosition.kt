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

class SinglyLinkedListNode(nodeData: Int) {
	public var data: Int
	public var next: SinglyLinkedListNode?

	init {
		data = nodeData
		next = null
	}
}

class SinglyLinkedList {
	public var head: SinglyLinkedListNode?
	public var tail: SinglyLinkedListNode?

	init {
		head = null
		tail = null
	}

	public fun insertNode(nodeData: Int) {
		var node = SinglyLinkedListNode(nodeData)

		if (head == null) {
			head = node
		} else {
			tail?.next = node
		}

		tail = node
	}

}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
	var node = head;

	while (node != null) {
		print(node?.data)
		node = node?.next

		if (node != null) {
			print(sep)
		}
	}
}

/*
 * Complete the 'insertNodeAtPosition' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST llist
 *  2. INTEGER data
 *  3. INTEGER position
 */

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     data: Int
 *     next: SinglyLinkedListNode
 * }
 *
 */

fun insertNodeAtPosition(llist: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
	var node = llist
	var head = llist
	val newNode = SinglyLinkedListNode(data)
	if(position == 0){
		newNode.next = head
		head = newNode
	} else {
		for (i in 1 until position) {
			node = node?.next
		}
		newNode.next = node?.next
		node?.next = newNode
	}
	return head
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val llistCount = scan.nextLine().trim().toInt()
	val llist = SinglyLinkedList()

	for (i in 0 until llistCount) {
		val llist_item = scan.nextLine().trim().toInt()
		llist.insertNode(llist_item)
	}

	val data = scan.nextLine().trim().toInt()

	val position = scan.nextLine().trim().toInt()

	val llist_head = insertNodeAtPosition(llist?.head, data, position)

	printSinglyLinkedList(llist_head, " ")
}
