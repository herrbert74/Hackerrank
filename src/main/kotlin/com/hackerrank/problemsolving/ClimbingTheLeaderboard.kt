package com.hackerrank.problemsolving

/*
 * Complete the 'climbingLeaderboard' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY ranked
 *  2. INTEGER_ARRAY player
 */

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
	val g = ranked.toSet().toList()
	var rank = g.size - 1
	for(i in player.indices) {
		while(rank > -1 && player[i] >= g[rank]) {
			rank--
		}
		player[i] = if(rank == -1) 1 else rank + 2
	}
	return player
}

fun main(args: Array<String>) {
	val rankedCount = readLine()!!.trim().toInt()

	val ranked = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val playerCount = readLine()!!.trim().toInt()

	val player = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	val result = climbingLeaderboard(ranked, player)

	println(result.joinToString("\n"))
}
