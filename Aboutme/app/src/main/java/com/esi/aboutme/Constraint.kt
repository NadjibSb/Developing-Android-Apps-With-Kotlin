package com.esi.aboutme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.constraint_layout.*

class Constraint : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)
        setListners()
    }

    private fun setListners() {
        val views: List<View> = listOf(textView, textView2, textView3, textView4, textView5, textView6, textView7)

        for (v in views) {
            v.setOnClickListener { makeColor(it) }
        }

        reset_btn.setOnClickListener { reset(views) }
    }

    private fun reset(views: List<View>) {
        for (v in views) {
            v.setBackgroundResource(android.R.color.holo_green_light)
        }
    }

    private fun makeColor(view: View) {
        when (view.id) {
            R.id.textView -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.textView2 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textView3 -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.textView4 -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.textView5 -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.textView6 -> view.setBackgroundResource(android.R.color.holo_red_light)
            R.id.textView7 -> view.setBackgroundResource(android.R.color.holo_purple)
            else -> view.setBackgroundResource(android.R.color.background_light)
        }
    }
}
