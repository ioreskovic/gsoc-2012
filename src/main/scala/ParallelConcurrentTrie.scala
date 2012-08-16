package com.google.summer.parallel.concurrentTrie

import scala.collection.parallel.ForkJoinTaskSupport
import scala.concurrent.forkjoin.ForkJoinPool
import scala.collection.parallel.mutable.ParTrieMap

object ParallelConcurrentTrieReduce extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection reduce {
			(a, b) => (a._1 + b._1, a._2 + b._2)
		}
	}
}

object ParallelConcurrentTrieForeach extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection foreach {
			t => (t._1 + 1, t._2 + 1)
		}
	}
}

object ParallelConcurrentTrieForall extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection forall {
			t => t._2 < t._2 + 1
		}
	}
}

object ParallelConcurrentTrieFind extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection find {
			t => t._1 == collection.size - 1
		}
	}
}

object ParallelConcurrentTrieFilter extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection filter {
			t => t._1 < collection.size / 2
		}
	}
}

object ParallelConcurrentTrieFoldRight extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.foldRight(Int.MaxValue)((t, m) => { if (t._2 < m) t._2 else m })
	}
}

object ParallelConcurrentTrieFoldLeft extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.foldLeft(Int.MinValue)((m, t) => { if (m > t._2) m else t._2 })
	}
}

object ParallelConcurrentTrieFold extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.fold((0, 0))((x, y) => (x._1 + y._1, x._2 + y._2))
	}
}

object ParallelConcurrentTrieMap extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection map {
			t => (t._1 + 1, t._2 + 1)
		}
	}
}

object ParallelConcurrentTrieFlatMap extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection flatMap {
			t:(Int, Int) => Array(t._2 + 1)
		}
	}
}

object ParallelConcurrentTriePartition extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection partition {
			t:(Int, Int) => t._2 < collection.size / 2
		}
	}
}

object ParallelConcurrentTrieSpan extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParTrieMap[Int, Int] = new ParTrieMap[Int, Int]

	def init() {
		collection = ParTrieMap((0 until length) zip (0 until length): _*)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection span {
			t:(Int, Int) => t._2 < collection.size / 2
		}
	}
}