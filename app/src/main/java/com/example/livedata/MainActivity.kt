package com.example.livedata

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    private val textView : TextView
        get() = findViewById(R.id.textView)

    private val button : Button
        get() = findViewById(R.id.btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        /*mainViewModel.factsLiveData.observe(this, Observer {
            textView.text = it
        })*/
        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel
        /*button.setOnClickListener{
            mainViewModel.updateLiveData()
        }*/
    }
}