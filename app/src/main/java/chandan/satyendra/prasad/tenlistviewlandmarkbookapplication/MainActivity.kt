package chandan.satyendra.prasad.tenlistviewlandmarkbookapplication

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView: ListView = findViewById(R.id.listView)


        val landmarkNamesList = ArrayList<String>()
        landmarkNamesList.add("Pisa")
        landmarkNamesList.add("Colosseum")
        landmarkNamesList.add("Eiffel")
        landmarkNamesList.add("London Bridge")
        val landmarkCountryList = ArrayList<String>()
        landmarkCountryList.add("Italy")
        landmarkCountryList.add("Italy")
        landmarkCountryList.add("France")
        landmarkCountryList.add("UK")
        val pisa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pisa)
        val colosseum =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.colosseum)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.eiffel)
        val londonbridge =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.londonbridge)


        val landmarkImageList = ArrayList<Bitmap>()
        landmarkImageList.add(pisa)
        landmarkImageList.add(colosseum)
        landmarkImageList.add(eiffel)
        landmarkImageList.add(londonbridge)


        val arrayadapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNamesList)
        listView.adapter = arrayadapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val intent = Intent(applicationContext, DetailsActivity::class.java)
                intent.putExtra("name", landmarkNamesList[position])
                intent.putExtra("country", landmarkCountryList[position])
                val bitmap = landmarkImageList[position]
                val chosen = GlobalsforLandmark.Chosen
                chosen.chosenImage = bitmap
                startActivity(intent)
            }


    }
}