package pe.edu.idat.appnumeroxvocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.appnumeroxvocal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        calcularImc()
    }

    private fun calcularImc() {
        val numero = binding.txtNumero.text.toString().toInt()
        var resultado = ""
        try{
            if (numero == 1 ){
                resultado = "A"
            }else if(numero == 2){
                resultado = "E"
            }else if(numero == 3){
                resultado = "I"
            }else if(numero == 4){
                resultado = "O"
            }else if(numero == 5){
                resultado = "U"
            }
            binding.tvresultado.text = "la vocal equivalente es: $resultado"

        }catch (e  : Exception){
            println("Porfavor Ingrese Solo Numeros Entre 1 Y 5")
        }
    }
}