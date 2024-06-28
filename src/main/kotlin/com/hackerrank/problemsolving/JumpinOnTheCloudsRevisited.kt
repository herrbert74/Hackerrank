package com.hackerrank.problemsolving

import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
	var energy = 100
	var i = 0
	var t = 1
	while (t > 0) {
		i += k
		t = i.rem(c.size)
		energy -= if (c[t] == 1) 3 else 1
	}
	return energy
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val nk = scan.nextLine().split(" ")

	val n = nk[0].trim().toInt()

	val k = nk[1].trim().toInt()

	val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

	val result = jumpingOnClouds(c, k)

	println(result)
}