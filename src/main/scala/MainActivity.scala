package com.google.summer

import _root_.android.os.Bundle
import _root_.android.app.Activity
import _root_.android.content.Intent
import _root_.android.view.Menu
import _root_.android.view.View
import _root_.android.view.View.OnClickListener
import _root_.android.widget.ArrayAdapter
import _root_.android.widget.Button
import _root_.android.widget.EditText
import _root_.android.widget.Spinner

import com.google.summer.ResultsActivity._

class MainActivity extends Activity with TypedActivity {
	override def onCreate(bundle: Bundle) {
		super.onCreate(bundle)
		setContentView(R.layout.activity_main)
		
		val spinner: Spinner = findViewById(R.id.spinner1).asInstanceOf[Spinner]
		val spinnerMethod = findViewById(R.id.spinnerMethod).asInstanceOf[Spinner]
		val parLevelText: EditText = findViewById(R.id.editText1).asInstanceOf[EditText]
		val sizeLevelText: EditText = findViewById(R.id.editText2).asInstanceOf[EditText]
		val itersText: EditText = findViewById(R.id.editText3).asInstanceOf[EditText]
		val multiText: EditText = findViewById(R.id.editTextMulti).asInstanceOf[EditText]
		
		val spinnerValues: Array[String] = Array(
			"Parallel Array", 
			"Sequential Array",
			
			"Parallel Vector", 
			"Sequential Vector",
			
			"Parallel Range", 
			"Sequential Range",
			
			"Parallel Hash Table", 
			"Sequential Hash Table", 
			
			"Parallel Hash Trie", 
			"Sequential Hash Trie",
			
			"Parallel Concurrent Trie",
			"Sequential Concurrent Trie"
		)
		
		val methodValues: Array[String] = Array(
			"Filter",
			"Find",
			"FlatMap",
			"Fold",
			"FoldLeft",
			"FoldRight",
			"Forall",
			"Foreach",
			"Map",
			"Partition",
			"Reduce",
			"Span"
		)
		
		val spinnerAdapter: ArrayAdapter[String] = new ArrayAdapter[String](this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
		spinner.setAdapter(spinnerAdapter)
		
		val spinnerMethodAdapter: ArrayAdapter[String] = new ArrayAdapter[String](this, android.R.layout.simple_spinner_dropdown_item, methodValues)
		spinnerMethod.setAdapter(spinnerMethodAdapter)
		
		val benchmarkButton: Button = findViewById(R.id.button1).asInstanceOf[Button]
		benchmarkButton.setOnClickListener(new View.OnClickListener() {
			def onClick(v : View) {
				val collectionType = spinner.getSelectedItem.asInstanceOf[String]
				val methodType = spinnerMethod.getSelectedItem.asInstanceOf[String]
				val parallelizationLevel = parLevelText.getText.toString.trim
				val collectionSize = sizeLevelText.getText.toString.trim
				val iterations = itersText.getText.toString.trim
				val multiplier = multiText.getText.toString.trim
				
				val intent = new Intent(MainActivity.this, classOf[ResultsActivity])
			
				intent.putExtra(ResultsActivity.colType, collectionType)
				intent.putExtra(ResultsActivity.metType, methodType)
				intent.putExtra(ResultsActivity.parLevel, parallelizationLevel)
				intent.putExtra(ResultsActivity.colSize, collectionSize)
				intent.putExtra(ResultsActivity.iters, iterations)
				intent.putExtra(ResultsActivity.multi, multiplier)
			
				startActivity(intent)
			}
		})
	}
}
