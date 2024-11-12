package com.example.www;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Permet l'affichage en mode plein écran en utilisant EdgeToEdge
        EdgeToEdge.enable(this);

        // Définir la vue principale de l'activité
        setContentView(R.layout.activity_main);

        // Récupérer les éléments UI
        TextView sloganTextView = findViewById(R.id.sloganTextView);
        Button loginButton = findViewById(R.id.loginButton);
        ImageView carImageView = findViewById(R.id.carImageView);

        // Mettre à jour le texte du slogan dynamiquement si nécessaire
        if (sloganTextView != null) {
            sloganTextView.setText("Découvrez les meilleures voitures !");
        }

        // Action au clic sur le bouton de connexion
        loginButton.setOnClickListener(v -> {
            // Lancer l'écran de connexion (LoginActivity)
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // Gérer les WindowInsets pour l'affichage plein écran
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
