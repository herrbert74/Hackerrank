package com.hackerrank.problemsolving

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import kotlin.math.max

/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
	val k = keyboards.sortedDescending().filter { it < b }
	val d = drives.sortedDescending().filter { it < b }
	if(k.isEmpty() || d.isEmpty() || (k.last() + d.last() > b)) return -1
	var maxPrice = 0
	val maxDriverPrice = d.first()
	keyboard@ for (i in k.indices)  {
		if(k[i] + maxDriverPrice < maxPrice) break@keyboard
		driver@ for (j in d.size - 1 downTo 0)  {
			val price = k[i] + d[j]
			if(price > b) break@driver
			if(price > maxPrice) maxPrice = price
		}
	}
	return maxPrice

}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val bnm = scan.nextLine().split(" ")

	val b = bnm[0].trim().toInt()

	val n = bnm[1].trim().toInt()

	val m = bnm[2].trim().toInt()

	val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

	val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

	/*
	 * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
	 */

	val moneySpent = getMoneySpent(keyboards, drives, b)

	println(moneySpent)
}
