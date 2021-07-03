package br.com.fiap.pokedex.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.fiap.pokedex.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        val btPokemon: Button = findViewById(R.id.btPokemons)
        btPokemon.setOnClickListener {
            val intentPokemon = Intent(this, MainActivity::class.java)
            startActivity(intentPokemon)
        }

        val btAbout: Button = findViewById(R.id.btAbout)
        btAbout.setOnClickListener {
            val intentAbout = Intent(this, AboutActivity::class.java)
            startActivity(intentAbout)
        }
    }
}