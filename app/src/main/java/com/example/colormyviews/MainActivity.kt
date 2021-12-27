package com.example.colormyviews

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.ImageViewOne -> view.setBackgroundResource(R.drawable.image_one)
            R.id.ImageViewTwo -> view.setBackgroundResource(R.drawable.image_two)
            R.id.ImageViewThree -> view.setBackgroundResource(R.drawable.image_three)
            R.id.ImageViewFour -> toggleImages(view)
            R.id.ImageViewFive -> toggleImages(view)
            else -> view.setBackgroundResource(R.drawable.backgrounf_image)
        }
    }

    private fun setListeners() {

        val ImageViewOne = findViewById<ImageView>(R.id.ImageViewOne)
        val ImageViewTwo = findViewById<ImageView>(R.id.ImageViewTwo)
        val ImageViewThree = findViewById<ImageView>(R.id.ImageViewThree)
        val ImageViewFour = findViewById<ImageView>(R.id.ImageViewFour)
        val ImageViewFive = findViewById<ImageView>(R.id.ImageViewFive)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                ImageViewOne, ImageViewTwo, ImageViewThree,
                ImageViewFour, ImageViewFive, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun toggleImages(view: View) {

        when (view.tag) {
            "4" -> {
                view.setBackgroundResource(R.drawable.image_five)
                view.tag = "5"
            }
            "5" -> {
                view.setBackgroundResource(R.drawable.image_four)
                view.tag = "4"
            }
            "6" -> {
                view.setBackgroundResource(R.drawable.image_seven)
                view.tag = "7"
            }
            "7" -> {
                view.setBackgroundResource(R.drawable.image_six)
                view.tag = "6"
            }
        }

        
    }
}