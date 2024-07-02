package com.hackerrank.problemsolving

/*
 * Complete the 'taumBday' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER b
 *  2. INTEGER w
 *  3. INTEGER bc
 *  4. INTEGER wc
 *  5. INTEGER z
 */

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
	return if ((bc - wc) > z) {
		(b + w) * wc.toLong() + b * z.toLong()
	} else if ((wc - bc) > z) {
		(b + w) * bc.toLong() + w * z.toLong()
	} else {
		b * bc.toLong() + w * wc.toLong()
	}

}

fun main(args: Array<String>) {
	val t = readLine()!!.trim().toInt()

	for (tItr in 1..t) {
		val first_multiple_input = readLine()!!.trimEnd().split(" ")

		val b = first_multiple_input[0].toInt()

		val w = first_multiple_input[1].toInt()

		val second_multiple_input = readLine()!!.trimEnd().split(" ")

		val bc = second_multiple_input[0].toInt()

		val wc = second_multiple_input[1].toInt()

		val z = second_multiple_input[2].toInt()

		val result = taumBday(b, w, bc, wc, z)

		println(result)
	}
}
