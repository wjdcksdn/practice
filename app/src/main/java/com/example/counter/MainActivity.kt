package com.example.counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    var a = "0"
    var re = "0"
    var ch:Char = '0'
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if(re=="0") {
                a = "1"
                re = "1"
            }
            else {
                re += "1"
                a = "1"
            }
            binding.textView.text = re
        }
        binding.btn2.setOnClickListener {
            if(re=="0") {
                a = "2"
                re = "2"
            }
            else {
                re += "2"
                a = "2"
            }
            binding.textView.text = re
        }
        binding.btn3.setOnClickListener {
            if(re=="0") {
                re = "3"
            }
            else {
                re += "3"
            }
            a = "3"
            binding.textView.text = re
        }
        binding.btn4.setOnClickListener {
            if(re=="0") {
                re = "4"
            }
            else {
                re += "4"
            }
            a = "4"
            binding.textView.text = re
        }
        binding.btn5.setOnClickListener {
            if(re=="0") {
                re = "5"
            }
            else {
                re += "5"
            }
            a = "5"
            binding.textView.text = re
        }
        binding.btn6.setOnClickListener {
            if(re=="0") {
                re = "6"
            }
            else {
                re += "6"
            }
            a = "7"
            binding.textView.text = re
        }
        binding.btn7.setOnClickListener {
            if(re=="0") {
                re = "7"
            }
            else {
                re += "7"
            }
            a = "7"
            binding.textView.text = re
        }
        binding.btn8.setOnClickListener {
            if(re=="0") {
                re = "8"
            }
            else {
                re += "8"
            }
            a = "8"
            binding.textView.text = re
        }
        binding.btn9.setOnClickListener {
            if(re=="0") {
                re = "9"
            }
            else {
                re += "9"
            }
            a = "9"
            binding.textView.text = re
        }
        binding.btn0.setOnClickListener {
            if(re=="0") {
                re = "0"
            }
            else {
                re += "0"
            }
            a = "0"
            binding.textView.text = re
        }
        binding.btnX.setOnClickListener {
            ch = '*'
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re += "*"
            }
            binding.textView.text = re
        }
        binding.btnPer.setOnClickListener {
            ch = '%'
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re += "%"
            }
            binding.textView.text = re
        }
        binding.btnDivide.setOnClickListener {
            ch = '/'
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re += "/"
            }
            binding.textView.text = re
        }
        binding.btnPlus.setOnClickListener {
            ch = '+'
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re += "+"
            }
            binding.textView.text = re
        }
        binding.btnMin.setOnClickListener {
            ch = '-'
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re += "-"
            }
            binding.textView.text = re
        }
        binding.btnDot.setOnClickListener {
            if(re=="0")
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            else
                re += "."
        }
        binding.btnEqual.setOnClickListener {
            var result : Double = 0.0
            when(ch){
                '+' -> {
                    var b = re.split('+')
                    var c = b[0].toDouble()
                    var d = b[1].toDouble()
                    result = c + d
                    binding.result.text = ((c + d).toString())}
                '-' -> {
                    var b = re.split('-')
                    var c = b[0].toDouble()
                    var d = b[1].toDouble()
                    result = c - d
                    binding.result.text = ((c - d).toString())}
                '*' -> {
                    var b = re.split('*')
                    var c = b[0].toDouble()
                    var d = b[1].toDouble()
                    result = c * d
                    binding.result.text = ((c * d).toString())}
                '/' -> {
                    var b = re.split('/')
                    var c = Integer.parseInt(b[0])
                    var d = Integer.parseInt(b[1])
                    if(d==0)
                        Toast.makeText(this, "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show()
                    else
                        result = (c.toDouble() / d.toDouble())
                        binding.result.text = ((c.toDouble() / d.toDouble()).toString())}

            }
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("calc", result)
            startActivity(intent)



        }
        binding.btnBack.setOnClickListener{
            var b : String = "0"
            if(re=="0"){
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else{
                b = re.slice(IntRange(0, re.length-2))
                //Log.d("TAG", "onCreate: ${re.slice(IntRange(0, re.length-1))}")
                re = b
            }
            binding.textView.text = b
        }
        binding.btnC.setOnClickListener {
            if(re=="0") {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                re = "0"
                a = "0"
                ch = '0'
            }
            binding.textView.text = re
            binding.result.text = " "
        }
    }
}