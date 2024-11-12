package com.example.www;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Passer en mode plein écran en utilisant les flags de la fenêtre
        getWindow().setFlags(
                android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, // Masquer la barre de statut
                android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN  // Masquer la barre de statut
        );

        // Définir la vue principale de l'activité
        setContentView(R.layout.activity_main);

        // Récupérer les éléments UI depuis le XML
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView sloganTextView = findViewById(R.id.sloganTextView);
        Button loginButton = findViewById(R.id.loginButton);

        // Mettre à jour le texte du titre et du slogan dynamiquement si nécessaire
        if (titleTextView != null) {
            titleTextView.setText("KARTELO");
        }

        if (sloganTextView != null) {
            sloganTextView.setText("Découvrez les meilleures voitures");
        }

        // Action au clic sur le bouton de connexion
        loginButton.setOnClickListener(v -> {
            // Lancer l'écran de connexion (LoginActivity)
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
