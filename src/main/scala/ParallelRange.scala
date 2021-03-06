package com.google.summer.parallel.range

import scala.collection.parallel.immutable.ParRange
import scala.collection.parallel.ForkJoinTaskSupport
import scala.concurrent.forkjoin.ForkJoinPool

object ParallelRangeReduce extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection reduce {
			(a, b) => a + b
		}
	}
}

object ParallelRangeForeach extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection foreach {
			x => x + 1
		}
	}
}

object ParallelRangeForall extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection forall {
			x => x < x + 1
		}
	}
}

object ParallelRangeFind extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection find {
			x => x == collection.length - 1
		}
	}
}

object ParallelRangeFilter extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection filter {
			x => x < collection.length / 2
		}
	}
}

object ParallelRangeFoldRight extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.foldRight(Int.MaxValue)( (x, y) => { if (x < y) x else y })
	}
}

object ParallelRangeFoldLeft extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.foldLeft(Int.MinValue)( (x, y) => { if (x > y) x else y })
	}
}

object ParallelRangeFold extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection.fold(0)(_+_)
	}
}

object ParallelRangeMap extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection map {
			x => x + 1
		}
	}
}

object ParallelRangeFlatMap extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection flatMap {
			x:Int => Array(x + 1)
		}
	}
}

object ParallelRangePartition extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection partition {
			x:Int => x < collection.length / 2
		}
	}
}

object ParallelRangeSpan extends scala.testing.Benchmark {
	var length = 250000
	var par = 4
	var collection: ParRange = Range(0,0).par

	def init() {
		collection = ParRange(0, length, 1, false)
		collection.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(par))
	}
	
	def run = {
		collection span {
			x:Int => x < collection.length / 2
		}
	}
}