package com.example.muchoapp.View.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.muchoapp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class RegistrarseActivity: AppCompatActivity() {
    lateinit var btnregister: Button
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        firebaseAuth =  Firebase.auth
        val name= findViewById<EditText>(R.id.sinupname)
        val lastname= findViewById<EditText>(R.id.singuplastname)
        val email = findViewById<EditText>(R.id.sinupemail)
        val phone = findViewById<EditText>(R.id.singupphone)
        val obs = findViewById<EditText>(R.id.singupobs)
        val password = findViewById<EditText>(R.id.singuppassword)

        btnregister= findViewById(R.id.registro)
        btnregister.setOnClickListener{
            createUser(email.text.toString(),password.text.toString())
        }
    }

    fun createUser(email:String,password:String){
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                Task-> if(Task.isSuccessful){
                    startActivity(Intent(this,login::class.java))
            }else{
                Toast.makeText(baseContext,"try again",Toast.LENGTH_LONG).show()
            }
            }
    }

}