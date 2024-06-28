package com.hackerrank.problemsolving

/*
 * Complete the 'permutationEquation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY p as parameter.
 */

fun permutationEquation(p: Array<Int>): Array<Int> {
	val positions = Array(p.size) { -1 }
	val positions2 = Array(p.size) { -1 }
	p.forEachIndexed { index, i ->
		positions[i - 1] = index + 1
	}
	positions.forEachIndexed { index, i ->
		positions2[index] = positions[i-1]
	}

	return positions2
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val p = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

	val result = permutationEquation(p)

	println(result.joinToString("\n"))
}
