package com.example.app1jake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dropdownlist1= arrayOf("Red", "Blue", "Green")
    val dropdownlist2= arrayOf("Blue", "Yellow", "Red")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)


        val adapter= ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2= ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        var b1=findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner1.adapter=adapter
        spinner1.onItemSelectedListener=object :  AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                if(spinner1.selectedItemPosition==0)
                {
                    textView.setText(" " + spinner1.selectedItem)
                }

                if(spinner1.selectedItemPosition==1)
                {
                    textView.setText(" " + spinner1.selectedItem)
                }
            }
        }

        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object :  AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {

                if(spinner2.selectedItemPosition==0)
                {
                    textView2.setText(" " + spinner2.selectedItem)
                }

                if(spinner2.selectedItemPosition==1)
                {
                    textView2.setText(" " + spinner2.selectedItem)
                }
            }
        }

        b1.setOnClickListener{
            if (spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Purple ")
            }

            if (spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Green ")
            }

            if (spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Brown ")
            }

            if (spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Orange ")
            }

            if (spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Red ")
            }

            if (spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Blue ")
            }

            if (spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==2)
            {
                textView3.setText("The color is: Magenta ")
            }

            if (spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==0)
            {
                textView3.setText("The color is: Cyan ")
            }

            if (spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==1)
            {
                textView3.setText("The color is: Yellow-Green ")
            }

        }
    }
}