package com.example.mvvmusingroom

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmusingroom.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

   // lateinit var database: NotesDatabase
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {

        }*/



        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val notesDaa= NotesDatabase.getDatabse(applicationContext).notesDao()

        val notesRepository = NotesRepository(notesDaa)
        val mainViewModel = ViewModelProvider(this,MainViewModelFactory(notesRepository)).get(MainViewModel::class.java)

   /* mainViewModel.getNotes().observe(this,{
        binding.textView2.text = it.toString()
    })

        binding.button.setOnClickListener {
            if (binding.textView2.text.isEmpty())
            {
                binding.textView2.error="Empty"
            }else
            {
                mainViewModel.inserNotes(Notes(0,binding.textView2.text.toString()))
                Toast.makeText(this,"Inseted Sucessfully",Toast.LENGTH_SHORT).show()

                binding.textView2.text=null

            }
        }*/

        mainViewModel.getNotes().observe(this, {
            binding.text3.text = it.toString()
        })
        binding.button.setOnClickListener {
            if (binding.textET.text!!.isEmpty()){
                binding.textET.error = "Empty"
            }else{
                mainViewModel.inserNotes(Notes(0,binding.textET.text.toString()))

                Toast.makeText(this, "DONE", Toast.LENGTH_SHORT).show()
                binding.textET.text = null
            }
        }



    }
}

