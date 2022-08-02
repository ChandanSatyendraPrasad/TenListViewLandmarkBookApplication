package chandan.satyendra.prasad.tenlistviewlandmarkbookapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val textlandname:TextView = findViewById(R.id.nameText)
        val textcountryname:TextView = findViewById(R.id.countryText)
        val  imageoflocation:ImageView=findViewById(R.id.imageView)
        val intent = intent
        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        println("Val :: ${name}")
        println("Val :: ${country}")
        textlandname.text=name
        textcountryname.text=country

        val choosen=GlobalsforLandmark.Chosen
        val selectedImage=choosen.returnImage()
        imageoflocation.setImageBitmap(selectedImage)

    }
}