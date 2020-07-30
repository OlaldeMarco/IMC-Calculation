package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton=findViewById<Button>(R.id.btCalcular)
        boton.setOnClickListener(View.OnClickListener {
            calculado()
            /*al igual que en otros casos, creamos una funcion donde podremos realizar
            las operaciones correspondientes*/
        })
    }
    fun calculado(){
         var pes=etnPeso.text.toString().toDouble()
         var alt=etnAltura.text.toString().toDouble()
         var imc =  (pes / (alt*alt))
/* Creamos una variable esclusiva para realizar la operacion*/
        if (imc<18.5)
            tvResultado.text="su IMC: " +imc+'\n'+"Estado: "+'\n'+"Bajo peso"
        if (imc>18.5 && imc<24.9)
            tvResultado.text="su IMC: " +imc+'\n'+"Estado: "+'\n'+"Normal"
        if (imc>25 && imc<29.9)
            tvResultado.text="su IMC: " +imc+'\n'+"Estado: "+'\n'+"Sobrepeso"
        if (imc>30)
            tvResultado.text="su IMC: " +imc+'\n'+"Estado: "+'\n'+"Obeso"

        /* con el uso de if establesco cada parametro para determinar el estado
        de cada caso dependiendo el resultado de la operacion
         */
    }
}