package com.esi.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.esi.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val name = Name("Nadjib Souab")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.name = name
        binding.setBtn.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View) {

        binding.apply {
            name?.nickname = nickNameEdit.text.toString()
            nickNameDisplay.text = nickNameEdit.text.toString()
            invalidateAll()
            nickNameEdit.visibility = View.GONE
            view.visibility = View.GONE
            nickNameDisplay.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
