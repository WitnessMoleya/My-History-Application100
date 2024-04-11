package com.example.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myhistoryapplication100.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaration
        var heading = findViewById<TextView>(R.id.heading)
        var textAge = findViewById<EditText>(R.id.textAge)
        var search = findViewById<Button>(R.id.search1)
        var clear = findViewById<Button>(R.id.clear1)
        var Results = findViewById<EditText>(R.id.Results1)

        // Information
        search?.setOnClickListener {
            val research = textAge.text.toString()
            if (research.isBlank()) {
                Toast.makeText(this, "Enter Age.", Toast.LENGTH_SHORT).show()
            } else if (research.toInt() < 40 || research.toInt() > 92) {
                Toast.makeText(this, "Enter the age between 40 and 92", Toast.LENGTH_SHORT).show()
                textAge.text.clear() // Clear the EditText field for the age input
            } else {
                when (research.toInt()) {
                    76 -> Results.setText("(Albert_Einstein)He was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientist of all time who died on the 18 of april 1955,at the age of 76")
                    83 -> Results.setText("(Thomas_Jefferson)He was an American statesman,diplomat,lawyer,architect,philosopher,and Founding Father who served as the third president of the United States from 1801 to 1809,died at the age of 83")
                    56 -> Results.setText("(Abraham_Lincoln)He was an American lawyer,politician,& statesman who served as the 16th president of the United states from 1861 until his assassination in 1865.at the age of 56")
                    58 -> Results.setText("(Charles_Dickens)He was an English novelist & social critic who created some of the world's best-known fictional characters,and is regarded by many as the greatest novelist of the Victorian era,died at the age of 58")
                    88 -> Results.setText("(Howard_Zinn)He was an American historian,playwright,philosopher,socialist intellectual and World War || veteran,also chair of history and social sciences department at Spelman College,died at the age of 88 ")
                    91 -> Results.setText("(Winston_Churchill)He was a British statesman,soldier,and writer who served as prime Minister of the United Kingdom twice from 1940 to 1945 during 2nd World War,died at the age of 91")
                    75 -> Results.setText("(Mark_Twain)He's known by the pen name Mark Twain and was an American writer,humorist & essayist and he was called father of American literature,died at the age of 75")
                    54 -> Results.setText("(Vladimir_Lenin)He was a Russian revolutionary,politician,and political theorist served as the first & founding head of goverment of Soviet Russian,died at the age of 54")
                    46 -> Results.setText("(John_F_Kennedy)He's often referred to as JFK,was an American politician who served as the 35th president of the United States,died at the age of 46")
                    47 -> Results.setText("(Alexander_Hamilton)was an American military officer,statesman,and founding father who served as the first secretary of the treasury,died at the age of 47")
                    else -> {
                        Toast.makeText(this,"No data available for this age", Toast.LENGTH_SHORT).show()
                        textAge.text.clear() // Clear the EditText field for the age input
                    }
                }
            }
        }

        // Clear button click listener
        clear?.setOnClickListener {
            textAge.text.clear() // Clear the EditText for textAge
            Results.text.clear() // Clear the Results EditText
        }
    }
}
