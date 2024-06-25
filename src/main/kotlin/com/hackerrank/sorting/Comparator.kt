package com.hackerrank.sorting

import javax.naming.Name

fun main(args: Array<String>) {
	val q = readLine()!!.trim().toInt()

	val players = mutableListOf<Player>()
	for (qItr in 1..q) {
		val s = readLine()!!

		val(name, score) = s.split(" ")
		players.add(Player(name, score.toInt()))
	}
	players.sortWith(Checker())

	players.forEach{
		println("${it.name} ${it.score}")
	}

}

class Checker : Comparator<Player> {
	override fun compare(o1: Player, o2: Player): Int {
		return if(o1.score == o2.score) o1.name.compareTo(o2.name)
		else o2.score.compareTo(o1.score)
	}

}

data class Player(
	val name: String = "",
	val score: Int = 0
)