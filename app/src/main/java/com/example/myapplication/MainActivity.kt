package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private var firstValue: Double = 0.0
    private var currentOperator: String = ""
    private var isNewOp: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tvResult)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onNumberClick(view: View) {
        val button = view as Button
        val strNumber = button.text.toString()

        if (isNewOp) {
            tvResult.text = ""
        }
        isNewOp = false

        val currentText = tvResult.text.toString()
        if (currentText == "0") {
            tvResult.text = strNumber
        } else {
            tvResult.append(strNumber)
        }
    }
    fun onOperatorClick(view: View) {
        val button = view as Button
        if (tvResult.text.isNotEmpty()) {
            firstValue = tvResult.text.toString().toDouble()
            currentOperator = button.text.toString()
            isNewOp = true // Đánh dấu để lần sau bấm số sẽ xóa màn hình
        }
    }

    // 5. Hàm xử lý nút xóa tất cả (AC)
    fun onClearClick(view: View) {
        tvResult.text = "0"
        firstValue = 0.0
        currentOperator = ""
        isNewOp = true
    }

    // 6. Hàm xử lý nút xóa 1 ký tự (<)
    fun onDeleteClick(view: View) {
        val currentText = tvResult.text.toString()
        if (currentText.length > 1) {
            tvResult.text = currentText.substring(0, currentText.length - 1)
        } else {
            tvResult.text = "0"
            isNewOp = true
        }
    }

    // 7. Hàm xử lý nút Bằng (=)
    fun onEqualClick(view: View) {
        if (currentOperator.isEmpty() || isNewOp) return

        val secondValue = tvResult.text.toString().toDouble()
        var result = 0.0

        when (currentOperator) {
            "+" -> result = firstValue + secondValue
            "-" -> result = firstValue - secondValue
            "*" -> result = firstValue * secondValue
            "/" -> {
                if (secondValue != 0.0) result = firstValue / secondValue
                else {
                    tvResult.text = "Lỗi chia 0"
                    isNewOp = true
                    return
                }
            }
            "%" -> result = (firstValue * secondValue) / 100
        }

        tvResult.text = if (result % 1 == 0.0) {
            result.toLong().toString()
        } else {
            result.toString()
        }

        isNewOp = true // Sau khi hiện kết quả, nếu bấm số tiếp theo sẽ xóa màn hình
    }
}