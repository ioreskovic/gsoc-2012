package com.google.summer.sequential.concurrentTrie

import scala.collection.concurrent.TrieMap

object SequentialConcurrentTrieReduce extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection reduce {
			(a, b) => (a._1 + b._1, a._2 + b._2)
		}
	}
}

object SequentialConcurrentTrieForeach extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection foreach {
			t => (t._1 + 1, t._2 + 1)
		}
	}
}

object SequentialConcurrentTrieForall extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection forall {
			t => t._2 < t._2 + 1
		}
	}
}

object SequentialConcurrentTrieFind extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection find {
			t => t._1 == collection.size - 1
		}
	}
}

object SequentialConcurrentTrieFilter extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection filter {
			t => t._1 < collection.size / 2
		}
	}
}

object SequentialConcurrentTrieFoldRight extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection.foldRight(Int.MaxValue)((t, m) => { if (t._2 < m) t._2 else m })
	}
}

object SequentialConcurrentTrieFoldLeft extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection.foldLeft(Int.MinValue)((m, t) => { if (m > t._2) m else t._2 })
	}
}

object SequentialConcurrentTrieFold extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection.fold((0, 0))((x, y) => (x._1 + y._1, x._2 + y._2))
	}
}

object SequentialConcurrentTrieMap extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection map {
			t => (t._1 + 1, t._2 + 1)
		}
	}
}

object SequentialConcurrentTrieFlatMap extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection flatMap {
			t:(Int, Int) => Array(t._2 + 1)
		}
	}
}

object SequentialConcurrentTriePartition extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection partition {
			t:(Int, Int) => t._2 < collection.size / 2
		}
	}
}

object SequentialConcurrentTrieSpan extends scala.testing.Benchmark {
	var length = 250000
	var collection: TrieMap[Int, Int] = new TrieMap[Int, Int]

	def init() {
		collection = TrieMap((0 until length) zip (0 until length): _*)
	}
	
	def run = {
		collection span {
			t:(Int, Int) => t._2 < collection.size / 2
		}
	}
}