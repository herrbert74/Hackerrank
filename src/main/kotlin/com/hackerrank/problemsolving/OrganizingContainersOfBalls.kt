package com.hackerrank.problemsolving

/*
 * Complete the 'organizingContainers' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts 2D_INTEGER_ARRAY container as parameter.
 */

fun organizingContainers(container: Array<Array<Int>>): String {
	val containers = Array(container.size){0}
	val types = Array(container.size){0}
	for(i in container.indices) {
		for (j in container.indices){
			containers[i] += container[i][j]
			types[j] += container[i][j]
		}
	}
	val c = containers.sorted()
	val t = types.sorted()
	return if(c == t) "Possible" else "Impossible"
}

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	for (qItr in 1..q) {
		val n = readLine()!!.trim().toInt()

		val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

		for (i in 0 until n) {
			container[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
		}

		val result = organizingContainers(container)

		println(result)
	}
}
