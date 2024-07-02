package com.hackerrank.problemsolving

/*
 * Complete the 'queensAttack' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER r_q
 *  4. INTEGER c_q
 *  5. 2D_INTEGER_ARRAY obstacles
 */

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
	//obstacle coordinates by direction, pairs of row/column
	val horizontal_obstacles = mutableListOf<Pair<Int, Int>>()
	val vertical_obstacles = mutableListOf<Pair<Int, Int>>()
	val cross_up_obstacles = mutableListOf<Pair<Int, Int>>()
	val cross_down_obstacles = mutableListOf<Pair<Int, Int>>()
	obstacles.forEach {
		if (it.first() == r_q) horizontal_obstacles.add(it.first() to it.last())
		else if (it.last() == c_q) vertical_obstacles.add(it.first() to it.last())
		else if (it.last() - c_q == it.first() - r_q) cross_up_obstacles.add(it.first() to it.last())
		else if (it.last() - c_q == r_q - it.first()) cross_down_obstacles.add(it.first() to it.last())
	}
	//obstacle min-maxes, vertical is by the row, the others are by the column, 1 BASED
	var h = 0 to n + 1
	var v = 0 to n + 1
	var up = 0 to n + 1
	var down = 0 to n + 1
	horizontal_obstacles.forEach {
		if (it.second < c_q && it.second > h.first) {
			h = it.second to h.second
		} else if (it.second > c_q && it.second < h.second) {
			h = h.first to it.second
		}
	}
	cross_up_obstacles.forEach {
		if (it.second < c_q && it.second > up.first) {
			up = it.second to up.second
		} else if (it.second > c_q && it.second < up.second) {
			up = up.first to it.second
		}
	}
	cross_down_obstacles.forEach {
		if (it.second < c_q && it.second > down.first) {
			down = it.second to down.second
		} else if (it.second > c_q && it.second < down.second) {
			down = down.first to it.second
		}

	}
	vertical_obstacles.forEach {
		if (it.first < r_q && it.first > v.first) {
			v = it.first to v.second
		} else if (it.first > r_q && it.first < v.second) {
			v = v.first to it.first
		}
	}
	//go through all directions to attack, vertical is by the row, the others are by the column, 1 BASED
	var result = 0
	for (rc in 1..n) {
		if (rc > h.first && rc < h.second && rc != c_q) result++
		val rowUp = r_q + rc - c_q //Check to see if it's on the board
		if (rc > up.first && rc < up.second && rowUp > 0 && rowUp < n + 1 && rc != c_q) result++
		val rowDown = r_q + c_q - rc//Check to see if it's on the board
		if (rc > down.first && rc < down.second && rowDown > 0 && rowDown < n + 1 && rc != c_q) result++
		if (rc > v.first && rc < v.second && rc != r_q) result++
	}
	return result
}

fun main(args: Array<String>) {
	val first_multiple_input = readLine()!!.trimEnd().split(" ")

	val n = first_multiple_input[0].toInt()

	val k = first_multiple_input[1].toInt()

	val second_multiple_input = readLine()!!.trimEnd().split(" ")

	val r_q = second_multiple_input[0].toInt()

	val c_q = second_multiple_input[1].toInt()

	val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

	for (i in 0 until k) {
		obstacles[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
	}

	val result = queensAttack(n, k, r_q, c_q, obstacles)

	println(result)
}
