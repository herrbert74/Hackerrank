package com.hackerrank.sorting

/*
 * Complete the 'countSwaps' function below.
 *
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun countSwaps(a: Array<Int>): Unit {
	var swaps = 0
	for (i in a.indices) {
		for (j in 0 until a.size - 1) {
			// Swap adjacent elements if they are in decreasing order
			if (a[j] > a[j + 1]) {
				swaps++
				swap(a, j)
			}
		}
	}
	println("Array is sorted in $swaps swaps.")
	println("First Element: ${a[0]}")
	println("Last Element: ${a[a.size - 1]}")

}

private fun swap(a: Array<Int>, i: Int) {
	val temp = a[i]
	a[i] = a[i+1]
	a[i+1] = temp
}

fun main(args: Array<String>) {
	val n = readLine()!!.trim().toInt()

	val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	countSwaps(a)
}
