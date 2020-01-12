package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtV1 = findViewById<EditText>(R.id.edtV1)
        var edtV2 = findViewById<EditText>(R.id.edtV2)
        var btnCalculate = findViewById<Button>(R.id.btnCalculate)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        var checkBox1 = findViewById<CheckBox>(R.id.checkBox1)

        btnCalculate.setOnClickListener{

            var v1:Double = edtV1.text.toString().toDouble()
            var v2:Double = edtV2.text.toString().toDouble()

            var result = v1 - ((v1/100)) * v2

            if(checkBox1.isChecked) {
                result += (result/100)*7
            }
            tvResult.setText(result.toString())
        }


    }
}
