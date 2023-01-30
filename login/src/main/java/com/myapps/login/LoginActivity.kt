package com.myapps.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.username_et)
        val passwordEditText = findViewById<EditText>(R.id.password_et)
        val loginButton = findViewById<Button>(R.id.login_btn)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Aqui você colocaria a lógica de autenticação
            if (username == "admin" && password == "12345") {
                // Login com sucesso, vá para a próxima tela, etc.
            } else {
                // Mostre uma mensagem de erro para o usuário
                Toast.makeText(this, "Login falhou, tente novamente!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}