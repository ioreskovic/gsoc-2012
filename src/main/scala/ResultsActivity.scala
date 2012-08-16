package com.google.summer

import _root_.android.os.Bundle;
import _root_.android.app.Activity;
import _root_.android.view.Menu;
import _root_.android.widget.TextView;

import scala.testing.Benchmark;

import com.google.summer.sequential.array._
import com.google.summer.sequential.vector._
import com.google.summer.sequential.range._
import com.google.summer.sequential.hashTable._
import com.google.summer.sequential.hashTrie._
import com.google.summer.sequential.concurrentTrie._

import com.google.summer.parallel.array._
import com.google.summer.parallel.vector._
import com.google.summer.parallel.range._
import com.google.summer.parallel.hashTable._
import com.google.summer.parallel.hashTrie._
import com.google.summer.parallel.concurrentTrie._

class ResultsActivity extends Activity {
	
	private def getSequentialArrayMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {
				SequentialArrayReduce.length_=(length)
				SequentialArrayReduce.multiplier_=(multiplier)
				SequentialArrayReduce.init
				SequentialArrayReduce
			}
			
			case "Foreach" => {
				SequentialArrayForeach.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayForeach.init
				SequentialArrayForeach
			}
			
			case "Forall" => {
				SequentialArrayForall.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayForall.init
				SequentialArrayForall
			}
			
			case "Find" => {
				SequentialArrayFind.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFind.init
				SequentialArrayFind
			}
			
			case "Filter" => {
				SequentialArrayFilter.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFilter.init
				SequentialArrayFilter
			}
			
			case "FoldRight" => {
				SequentialArrayFoldRight.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFoldRight.init
				SequentialArrayFoldRight
			}
			
			case "FoldLeft" => {
				SequentialArrayFoldLeft.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFoldLeft.init
				SequentialArrayFoldLeft
			}
			
			case "Fold" => {
				SequentialArrayFold.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFold.init
				SequentialArrayFold
			}
			
			case "Map" => {
				SequentialArrayMap.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayMap.init
				SequentialArrayMap
			}
			
			case "FlatMap" => {
				SequentialArrayFlatMap.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayFlatMap.init
				SequentialArrayFlatMap
			}
			
			case "Partition" => {
				SequentialArrayPartition.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArrayPartition.init
				SequentialArrayPartition
			}
			
			case "Span" => {
				SequentialArraySpan.length_=(length)
				SequentialArraySpan.multiplier_=(multiplier)
				SequentialArraySpan.init
				SequentialArraySpan
			}
		}
	}
	
	private def getParallelArrayMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {
				ParallelArrayReduce.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayReduce.par_=(par)
				ParallelArrayReduce.init
				ParallelArrayReduce
			}
			
			case "Foreach" => {
				ParallelArrayForeach.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayForeach.par_=(par)
				ParallelArrayForeach.init
				ParallelArrayForeach
			}
			
			case "Forall" => {
				ParallelArrayForall.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayForall.par_=(par)
				ParallelArrayForall.init
				ParallelArrayForall
			}
			
			case "Find" => {
				ParallelArrayFind.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFind.par_=(par)
				ParallelArrayFind.init
				ParallelArrayFind
			}
			
			case "Filter" => {
				ParallelArrayFilter.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFilter.par_=(par)
				ParallelArrayFilter.init
				ParallelArrayFilter
			}
			
			case "FoldRight" => {
				ParallelArrayFoldRight.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFoldRight.par_=(par)
				ParallelArrayFoldRight.init
				ParallelArrayFoldRight
			}
			
			case "FoldLeft" => {
				ParallelArrayFoldLeft.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFoldLeft.par_=(par)
				ParallelArrayFoldLeft.init
				ParallelArrayFoldLeft
			}
			
			case "Fold" => {
				ParallelArrayFold.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFold.par_=(par)
				ParallelArrayFold.init
				ParallelArrayFold
			}
			
			case "Map" => {
				ParallelArrayMap.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayMap.par_=(par)
				ParallelArrayMap.init
				ParallelArrayMap
			}
			
			case "FlatMap" => {
				ParallelArrayFlatMap.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayFlatMap.par_=(par)
				ParallelArrayFlatMap.init
				ParallelArrayFlatMap
			}
			
			case "Partition" => {
				ParallelArrayPartition.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArrayPartition.par_=(par)
				ParallelArrayPartition.init
				ParallelArrayPartition
			}
			
			case "Span" => {
				ParallelArraySpan.length_=(length)
				ParallelArraySpan.multiplier_=(multiplier)
				ParallelArraySpan.par_=(par)
				ParallelArraySpan.init
				ParallelArraySpan
			}
		}
	}
	
	private def getSequentialVectorMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				SequentialVectorReduce.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorReduce.init
				SequentialVectorReduce
			}
			
			case "Foreach" => {		
				SequentialVectorForeach.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorForeach.init
				SequentialVectorForeach
			}
			
			case "Forall" => {		
				SequentialVectorForall.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorForall.init
				SequentialVectorForall
			}
			
			case "Find" => {		
				SequentialVectorFind.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFind.init
				SequentialVectorFind
			}
			
			case "Filter" => {		
				SequentialVectorFilter.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFilter.init
				SequentialVectorFilter
			}
			
			case "FoldRight" => {		
				SequentialVectorFoldRight.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFoldRight.init
				SequentialVectorFoldRight
			}
			
			case "FoldLeft" => {		
				SequentialVectorFoldLeft.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFoldLeft.init
				SequentialVectorFoldLeft
			}
			
			case "Fold" => {		
				SequentialVectorFold.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFold.init
				SequentialVectorFold
			}
			
			case "Map" => {		
				SequentialVectorMap.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorMap.init
				SequentialVectorMap
			}
			
			case "FlatMap" => {		
				SequentialVectorFlatMap.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorFlatMap.init
				SequentialVectorFlatMap
			}
			
			case "Partition" => {		
				SequentialVectorPartition.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorPartition.init
				SequentialVectorPartition
			}
			
			case "Span" => {		
				SequentialVectorSpan.length_=(length)
				SequentialVectorSpan.multiplier_=(multiplier)
				SequentialVectorSpan.init
				SequentialVectorSpan
			}
		}
	}
	
	private def getParallelVectorMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				ParallelVectorReduce.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorReduce.par_=(par)
				ParallelVectorReduce.init
				ParallelVectorReduce
			}
			
			case "Foreach" => {		
				ParallelVectorForeach.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorForeach.par_=(par)
				ParallelVectorForeach.init
				ParallelVectorForeach
			}
			
			case "Forall" => {		
				ParallelVectorForall.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorForall.par_=(par)
				ParallelVectorForall.init
				ParallelVectorForall
			}
			
			case "Find" => {		
				ParallelVectorFind.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFind.par_=(par)
				ParallelVectorFind.init
				ParallelVectorFind
			}
			
			case "Filter" => {		
				ParallelVectorFilter.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFilter.par_=(par)
				ParallelVectorFilter.init
				ParallelVectorFilter
			}
			
			case "FoldRight" => {		
				ParallelVectorFoldRight.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFoldRight.par_=(par)
				ParallelVectorFoldRight.init
				ParallelVectorFoldRight
			}
			
			case "FoldLeft" => {		
				ParallelVectorFoldLeft.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFoldLeft.par_=(par)
				ParallelVectorFoldLeft.init
				ParallelVectorFoldLeft
			}
			
			case "Fold" => {		
				ParallelVectorFold.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFold.par_=(par)
				ParallelVectorFold.init
				ParallelVectorFold
			}
			
			case "Map" => {		
				ParallelVectorMap.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorMap.par_=(par)
				ParallelVectorMap.init
				ParallelVectorMap
			}
			
			case "FlatMap" => {		
				ParallelVectorFlatMap.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorFlatMap.par_=(par)
				ParallelVectorFlatMap.init
				ParallelVectorFlatMap
			}
			
			case "Partition" => {		
				ParallelVectorPartition.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorPartition.par_=(par)
				ParallelVectorPartition.init
				ParallelVectorPartition
			}
			
			case "Span" => {		
				ParallelVectorSpan.length_=(length)
				ParallelVectorSpan.multiplier_=(multiplier)
				ParallelVectorSpan.par_=(par)
				ParallelVectorSpan.init
				ParallelVectorSpan
			}
		}
	}
	
	private def getSequentialRangeMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				SequentialRangeReduce.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeReduce.init
				SequentialRangeReduce
			}
			
			case "Foreach" => {		
				SequentialRangeForeach.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeForeach.init
				SequentialRangeForeach
			}
			
			case "Forall" => {		
				SequentialRangeForall.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeForall.init
				SequentialRangeForall
			}
			
			case "Find" => {		
				SequentialRangeFind.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFind.init
				SequentialRangeFind
			}
			
			case "Filter" => {		
				SequentialRangeFilter.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFilter.init
				SequentialRangeFilter
			}
			
			case "FoldRight" => {		
				SequentialRangeFoldRight.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFoldRight.init
				SequentialRangeFoldRight
			}
			
			case "FoldLeft" => {		
				SequentialRangeFoldLeft.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFoldLeft.init
				SequentialRangeFoldLeft
			}
			
			case "Fold" => {		
				SequentialRangeFold.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFold.init
				SequentialRangeFold
			}
			
			case "Map" => {		
				SequentialRangeMap.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeMap.init
				SequentialRangeMap
			}
			
			case "FlatMap" => {		
				SequentialRangeFlatMap.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeFlatMap.init
				SequentialRangeFlatMap
			}
			
			case "Partition" => {		
				SequentialRangePartition.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangePartition.init
				SequentialRangePartition
			}
			
			case "Span" => {		
				SequentialRangeSpan.length_=(length)
				SequentialRangeSpan.multiplier_=(multiplier)
				SequentialRangeSpan.init
				SequentialRangeSpan
			}
		}
	}
	
	private def getParallelRangeMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				ParallelRangeReduce.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeReduce.par_=(par)
				ParallelRangeReduce.init
				ParallelRangeReduce
			}
			
			case "Foreach" => {		
				ParallelRangeForeach.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeForeach.par_=(par)
				ParallelRangeForeach.init
				ParallelRangeForeach
			}
			
			case "Forall" => {		
				ParallelRangeForall.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeForall.par_=(par)
				ParallelRangeForall.init
				ParallelRangeForall
			}
			
			case "Find" => {		
				ParallelRangeFind.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFind.par_=(par)
				ParallelRangeFind.init
				ParallelRangeFind
			}
			
			case "Filter" => {		
				ParallelRangeFilter.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFilter.par_=(par)
				ParallelRangeFilter.init
				ParallelRangeFilter
			}
			
			case "FoldRight" => {		
				ParallelRangeFoldRight.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFoldRight.par_=(par)
				ParallelRangeFoldRight.init
				ParallelRangeFoldRight
			}
			
			case "FoldLeft" => {		
				ParallelRangeFoldLeft.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFoldLeft.par_=(par)
				ParallelRangeFoldLeft.init
				ParallelRangeFoldLeft
			}
			
			case "Fold" => {		
				ParallelRangeFold.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFold.par_=(par)
				ParallelRangeFold.init
				ParallelRangeFold
			}
			
			case "Map" => {		
				ParallelRangeMap.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeMap.par_=(par)
				ParallelRangeMap.init
				ParallelRangeMap
			}
			
			case "FlatMap" => {		
				ParallelRangeFlatMap.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeFlatMap.par_=(par)
				ParallelRangeFlatMap.init
				ParallelRangeFlatMap
			}
			
			case "Partition" => {		
				ParallelRangePartition.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangePartition.par_=(par)
				ParallelRangePartition.init
				ParallelRangePartition
			}
			
			case "Span" => {		
				ParallelRangeSpan.length_=(length)
				ParallelRangeSpan.multiplier_=(multiplier)
				ParallelRangeSpan.par_=(par)
				ParallelRangeSpan.init
				ParallelRangeSpan
			}
		}
	}
	
	private def getSequentialHashTableMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				SequentialHashTableReduce.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableReduce.init
				SequentialHashTableReduce
			}
			
			case "Foreach" => {		
				SequentialHashTableForeach.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableForeach.init
				SequentialHashTableForeach
			}
			
			case "Forall" => {		
				SequentialHashTableForall.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableForall.init
				SequentialHashTableForall
			}
			
			case "Find" => {		
				SequentialHashTableFind.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFind.init
				SequentialHashTableFind
			}
			
			case "Filter" => {		
				SequentialHashTableFilter.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFilter.init
				SequentialHashTableFilter
			}
			
			case "FoldRight" => {		
				SequentialHashTableFoldRight.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFoldRight.init
				SequentialHashTableFoldRight
			}
			
			case "FoldLeft" => {		
				SequentialHashTableFoldLeft.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFoldLeft.init
				SequentialHashTableFoldLeft
			}
			
			case "Fold" => {		
				SequentialHashTableFold.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFold.init
				SequentialHashTableFold
			}
			
			case "Map" => {		
				SequentialHashTableMap.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableMap.init
				SequentialHashTableMap
			}
			
			case "FlatMap" => {		
				SequentialHashTableFlatMap.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableFlatMap.init
				SequentialHashTableFlatMap
			}
			
			case "Partition" => {		
				SequentialHashTablePartition.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTablePartition.init
				SequentialHashTablePartition
			}
			
			case "Span" => {		
				SequentialHashTableSpan.length_=(length)
				SequentialHashTableSpan.multiplier_=(multiplier)
				SequentialHashTableSpan.init
				SequentialHashTableSpan
			}
		}
	}
	
	private def getParallelHashTableMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				ParallelHashTableReduce.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableReduce.par_=(par)
				ParallelHashTableReduce.init
				ParallelHashTableReduce
			}
			
			case "Foreach" => {		
				ParallelHashTableForeach.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableForeach.par_=(par)
				ParallelHashTableForeach.init
				ParallelHashTableForeach
			}
			
			case "Forall" => {		
				ParallelHashTableForall.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableForall.par_=(par)
				ParallelHashTableForall.init
				ParallelHashTableForall
			}
			
			case "Find" => {		
				ParallelHashTableFind.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFind.par_=(par)
				ParallelHashTableFind.init
				ParallelHashTableFind
			}
			
			case "Filter" => {		
				ParallelHashTableFilter.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFilter.par_=(par)
				ParallelHashTableFilter.init
				ParallelHashTableFilter
			}
			
			case "FoldRight" => {		
				ParallelHashTableFoldRight.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFoldRight.par_=(par)
				ParallelHashTableFoldRight.init
				ParallelHashTableFoldRight
			}
			
			case "FoldLeft" => {		
				ParallelHashTableFoldLeft.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFoldLeft.par_=(par)
				ParallelHashTableFoldLeft.init
				ParallelHashTableFoldLeft
			}
			
			case "Fold" => {		
				ParallelHashTableFold.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFold.par_=(par)
				ParallelHashTableFold.init
				ParallelHashTableFold
			}
			
			case "Map" => {		
				ParallelHashTableMap.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableMap.par_=(par)
				ParallelHashTableMap.init
				ParallelHashTableMap
			}
			
			case "FlatMap" => {		
				ParallelHashTableFlatMap.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableFlatMap.par_=(par)
				ParallelHashTableFlatMap.init
				ParallelHashTableFlatMap
			}
			
			case "Partition" => {		
				ParallelHashTablePartition.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTablePartition.par_=(par)
				ParallelHashTablePartition.init
				ParallelHashTablePartition
			}
			
			case "Span" => {		
				ParallelHashTableSpan.length_=(length)
				ParallelHashTableSpan.multiplier_=(multiplier)
				ParallelHashTableSpan.par_=(par)
				ParallelHashTableSpan.init
				ParallelHashTableSpan
			}
		}
	}
	
	private def getSequentialHashTrieMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				SequentialHashTrieReduce.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieReduce.init
				SequentialHashTrieReduce
			}
			
			case "Foreach" => {		
				SequentialHashTrieForeach.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieForeach.init
				SequentialHashTrieForeach
			}
			
			case "Forall" => {		
				SequentialHashTrieForall.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieForall.init
				SequentialHashTrieForall
			}
			
			case "Find" => {		
				SequentialHashTrieFind.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFind.init
				SequentialHashTrieFind
			}
			
			case "Filter" => {		
				SequentialHashTrieFilter.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFilter.init
				SequentialHashTrieFilter
			}
			
			case "FoldRight" => {		
				SequentialHashTrieFoldRight.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFoldRight.init
				SequentialHashTrieFoldRight
			}
			
			case "FoldLeft" => {		
				SequentialHashTrieFoldLeft.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFoldLeft.init
				SequentialHashTrieFoldLeft
			}
			
			case "Fold" => {		
				SequentialHashTrieFold.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFold.init
				SequentialHashTrieFold
			}
			
			case "Map" => {		
				SequentialHashTrieMap.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieMap.init
				SequentialHashTrieMap
			}
			
			case "FlatMap" => {		
				SequentialHashTrieFlatMap.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieFlatMap.init
				SequentialHashTrieFlatMap
			}
			
			case "Partition" => {		
				SequentialHashTriePartition.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTriePartition.init
				SequentialHashTriePartition
			}
			
			case "Span" => {		
				SequentialHashTrieSpan.length_=(length)
				SequentialHashTrieSpan.multiplier_=(multiplier)
				SequentialHashTrieSpan.init
				SequentialHashTrieSpan
			}
		}
	}
	
	private def getParallelHashTrieMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				ParallelHashTrieReduce.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieReduce.par_=(par)
				ParallelHashTrieReduce.init
				ParallelHashTrieReduce
			}
			
			case "Foreach" => {		
				ParallelHashTrieForeach.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieForeach.par_=(par)
				ParallelHashTrieForeach.init
				ParallelHashTrieForeach
			}
			
			case "Forall" => {		
				ParallelHashTrieForall.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieForall.par_=(par)
				ParallelHashTrieForall.init
				ParallelHashTrieForall
			}
			
			case "Find" => {		
				ParallelHashTrieFind.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFind.par_=(par)
				ParallelHashTrieFind.init
				ParallelHashTrieFind
			}
			
			case "Filter" => {		
				ParallelHashTrieFilter.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFilter.par_=(par)
				ParallelHashTrieFilter.init
				ParallelHashTrieFilter
			}
			
			case "FoldRight" => {		
				ParallelHashTrieFoldRight.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFoldRight.par_=(par)
				ParallelHashTrieFoldRight.init
				ParallelHashTrieFoldRight
			}
			
			case "FoldLeft" => {		
				ParallelHashTrieFoldLeft.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFoldLeft.par_=(par)
				ParallelHashTrieFoldLeft.init
				ParallelHashTrieFoldLeft
			}
			
			case "Fold" => {		
				ParallelHashTrieFold.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFold.par_=(par)
				ParallelHashTrieFold.init
				ParallelHashTrieFold
			}
			
			case "Map" => {		
				ParallelHashTrieMap.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieMap.par_=(par)
				ParallelHashTrieMap.init
				ParallelHashTrieMap
			}
			
			case "FlatMap" => {		
				ParallelHashTrieFlatMap.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieFlatMap.par_=(par)
				ParallelHashTrieFlatMap.init
				ParallelHashTrieFlatMap
			}
			
			case "Partition" => {		
				ParallelHashTriePartition.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTriePartition.par_=(par)
				ParallelHashTriePartition.init
				ParallelHashTriePartition
			}
			
			case "Span" => {		
				ParallelHashTrieSpan.length_=(length)
				ParallelHashTrieSpan.multiplier_=(multiplier)
				ParallelHashTrieSpan.par_=(par)
				ParallelHashTrieSpan.init
				ParallelHashTrieSpan
			}
		}
	}
	
	private def getSequentialConcurrentTrieMap(length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				SequentialConcurrentTrieReduce.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieReduce.init
				SequentialConcurrentTrieReduce
			}
			
			case "Foreach" => {		
				SequentialConcurrentTrieForeach.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieForeach.init
				SequentialConcurrentTrieForeach
			}
			
			case "Forall" => {		
				SequentialConcurrentTrieForall.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieForall.init
				SequentialConcurrentTrieForall
			}
			
			case "Find" => {		
				SequentialConcurrentTrieFind.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFind.init
				SequentialConcurrentTrieFind
			}
			
			case "Filter" => {		
				SequentialConcurrentTrieFilter.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFilter.init
				SequentialConcurrentTrieFilter
			}
			
			case "FoldRight" => {		
				SequentialConcurrentTrieFoldRight.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFoldRight.init
				SequentialConcurrentTrieFoldRight
			}
			
			case "FoldLeft" => {		
				SequentialConcurrentTrieFoldLeft.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFoldLeft.init
				SequentialConcurrentTrieFoldLeft
			}
			
			case "Fold" => {		
				SequentialConcurrentTrieFold.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFold.init
				SequentialConcurrentTrieFold
			}
			
			case "Map" => {		
				SequentialConcurrentTrieMap.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieMap.init
				SequentialConcurrentTrieMap
			}
			
			case "FlatMap" => {		
				SequentialConcurrentTrieFlatMap.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieFlatMap.init
				SequentialConcurrentTrieFlatMap
			}
			
			case "Partition" => {		
				SequentialConcurrentTriePartition.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTriePartition.init
				SequentialConcurrentTriePartition
			}
			
			case "Span" => {		
				SequentialConcurrentTrieSpan.length_=(length)
				SequentialConcurrentTrieSpan.multiplier_=(multiplier)
				SequentialConcurrentTrieSpan.init
				SequentialConcurrentTrieSpan
			}
		}
	}
	
	private def getParallelConcurrentTrieMap(par:Int, length:Int, methodType: String, multiplier: Int): Benchmark = {
		methodType match {
			case "Reduce" => {		
				ParallelConcurrentTrieReduce.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieReduce.par_=(par)
				ParallelConcurrentTrieReduce.init
				ParallelConcurrentTrieReduce
			}
			
			case "Foreach" => {		
				ParallelConcurrentTrieForeach.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieForeach.par_=(par)
				ParallelConcurrentTrieForeach.init
				ParallelConcurrentTrieForeach
			}
			
			case "Forall" => {		
				ParallelConcurrentTrieForall.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieForall.par_=(par)
				ParallelConcurrentTrieForall.init
				ParallelConcurrentTrieForall
			}
			
			case "Find" => {		
				ParallelConcurrentTrieFind.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFind.par_=(par)
				ParallelConcurrentTrieFind.init
				ParallelConcurrentTrieFind
			}
			
			case "Filter" => {		
				ParallelConcurrentTrieFilter.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFilter.par_=(par)
				ParallelConcurrentTrieFilter.init
				ParallelConcurrentTrieFilter
			}
			
			case "FoldRight" => {		
				ParallelConcurrentTrieFoldRight.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFoldRight.par_=(par)
				ParallelConcurrentTrieFoldRight.init
				ParallelConcurrentTrieFoldRight
			}
			
			case "FoldLeft" => {		
				ParallelConcurrentTrieFoldLeft.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFoldLeft.par_=(par)
				ParallelConcurrentTrieFoldLeft.init
				ParallelConcurrentTrieFoldLeft
			}
			
			case "Fold" => {		
				ParallelConcurrentTrieFold.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFold.par_=(par)
				ParallelConcurrentTrieFold.init
				ParallelConcurrentTrieFold
			}
			
			case "Map" => {		
				ParallelConcurrentTrieMap.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieMap.par_=(par)
				ParallelConcurrentTrieMap.init
				ParallelConcurrentTrieMap
			}
			
			case "FlatMap" => {		
				ParallelConcurrentTrieFlatMap.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieFlatMap.par_=(par)
				ParallelConcurrentTrieFlatMap.init
				ParallelConcurrentTrieFlatMap
			}
			
			case "Partition" => {		
				ParallelConcurrentTriePartition.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTriePartition.par_=(par)
				ParallelConcurrentTriePartition.init
				ParallelConcurrentTriePartition
			}
			
			case "Span" => {		
				ParallelConcurrentTrieSpan.length_=(length)
				ParallelConcurrentTrieSpan.multiplier_=(multiplier)
				ParallelConcurrentTrieSpan.par_=(par)
				ParallelConcurrentTrieSpan.init
				ParallelConcurrentTrieSpan
			}
		}
	}
	
	private def getCollectionMethod(collectionType: String, methodType: String, par: Int, length: Int, multiplier: Int): Benchmark = {
		collectionType match {
			case "Sequential Array" => {
				getSequentialArrayMap(length, methodType, multiplier)
			}
			
			case "Parallel Array" => {
				getParallelArrayMap(par, length, methodType, multiplier)
			}
			
			case "Sequential Vector" => {
				getSequentialVectorMap(length, methodType, multiplier)
			}
			
			case "Parallel Vector" => {
				getParallelVectorMap(par, length, methodType, multiplier)
			}
			
			case "Sequential Range" => {
				getSequentialRangeMap(length, methodType, multiplier)
			}
			
			case "Parallel Range" => {
				getParallelRangeMap(par, length, methodType, multiplier)
			}
			
			case "Sequential Hash Table" => {
				getSequentialHashTableMap(length, methodType, multiplier)
			}
			
			case "Parallel Hash Table" => {
				getParallelHashTableMap(par, length, methodType, multiplier)
			}
			
			case "Sequential Hash Trie" => {
				getSequentialHashTrieMap(length, methodType, multiplier)
			}
			
			case "Parallel Hash Trie" => {
				getParallelHashTrieMap(par, length, methodType, multiplier)
			}
			
			case "Sequential Concurrent Trie" => {
				getSequentialConcurrentTrieMap(length, methodType, multiplier)
			}
			
			case "Parallel Concurrent Trie" => {
				getParallelConcurrentTrieMap(par, length, methodType, multiplier)
			}
		}
	}
	
	override def onCreate(bundle: Bundle) {
		super.onCreate(bundle)
		setContentView(R.layout.activity_results)

		val collType: TextView = findViewById(R.id.textViewResultsTypeValue).asInstanceOf[TextView]
		val lvl: TextView = findViewById(R.id.textViewResultsLevelValue).asInstanceOf[TextView]
		val size: TextView = findViewById(R.id.textViewResultsSizeValue).asInstanceOf[TextView]
		val iter: TextView = findViewById(R.id.textViewResultsItersValue).asInstanceOf[TextView]
		val multi: TextView = findViewById(R.id.textViewResultsMultiValue).asInstanceOf[TextView]
		val best: TextView = findViewById(R.id.textViewResultsFastestValue).asInstanceOf[TextView]
		val all = findViewById(R.id.textViewResultsAllValue).asInstanceOf[TextView]
		
		val collectionType: String = getIntent.getExtras.getString(ResultsActivity.colType)
		val methodType: String = getIntent.getExtras.getString(ResultsActivity.metType)
		val parallelizationLevel = getIntent.getExtras.getString(ResultsActivity.parLevel)
		val collectionSize = getIntent.getExtras.getString(ResultsActivity.colSize)
		val iterations = getIntent.getExtras.getString(ResultsActivity.iters)
		val multiplier = getIntent.getExtras.getString(ResultsActivity.multi)
		
		best.setText("Benchmark in progress, please wait...")
		all.setText("Benchmark in progress, please wait...")
		
		val argCollSize = collectionSize.toInt
		val argParlSize = parallelizationLevel.toInt
		val argIterSize = iterations.toInt
		val argMultiSize = multiplier.toInt
		
		val method: Benchmark = getCollectionMethod(collectionType, methodType, argParlSize, argCollSize, argMultiSize)
		
		var results: List[Long] = method.runBenchmark(argIterSize)
		
		collType.setText(collectionType + " - " + methodType)
		lvl.setText(parallelizationLevel)
		size.setText(collectionSize)
		iter.setText(iterations)
		multi.setText(multiplier)
		best.setText(results.min + " ms")
		all.setText(results.mkString("", " ms\n", " ms"))
	}
}

object ResultsActivity {
	final val colType: String = "collectionType"
	final val metType: String = "methodType"
	final val parLevel: String = "parallelizationLevel"
	final val colSize: String = "collectionSize"
	final val iters: String = "iterations"
	final val multi: String = "multiplier"
}
