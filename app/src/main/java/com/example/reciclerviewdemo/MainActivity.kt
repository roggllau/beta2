package com.example.reciclerviewdemo
//Guifré Agustín i Roger Llaudet.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items : ArrayList<String> = ArrayList()
    private val contactats : ArrayList<Contacte> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare button
        val button = findViewById<android.widget.Button>(R.id.plus)

        val input = findViewById<android.widget.EditText>(R.id.tel)

        addItems()
        viewConfig()
    }

    private fun addItems() {
        contactats.add(Contacte("Guifré", "123456789"))
        contactats.add(Contacte("Roger", "987654321"))
        contactats.add(Contacte("Agustín", "123456789"))
        //display arratlist
        contactats.forEach {
            println(it)
        }
    }

    private fun viewConfig() {
        val rvList = findViewById<RecyclerView>(R.id.reciclerView)

        rvList.adapter = ListAdapter(contactats, this)
        rvList.layoutManager = LinearLayoutManager(this)
    }

    fun addNewItem2(view: View) {
        val input = findViewById<android.widget.EditText>(R.id.tel)
        val input2 = findViewById<android.widget.EditText>(R.id.nom)
        if (input.text.toString() == "" || input2.text.toString() == "") {
           Toast.makeText(this, "Cal entrar un nom i un telèfon", Toast.LENGTH_SHORT).show()
        } else {
            items.add(input2.text.toString())
            contactats.add(Contacte(input2.text.toString(), input.text.toString()))
        }
        viewConfig()
    }
    //when contact is clicked it will open the second activity

}