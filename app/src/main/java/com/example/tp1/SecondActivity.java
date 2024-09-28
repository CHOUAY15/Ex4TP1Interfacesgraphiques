package com.example.tp1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private TextView nom, genre, ville,email,adress,phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nom = findViewById(R.id.nom);
        //genre = findViewById(R.id.genre);
        ville = findViewById(R.id.ville);
        email = findViewById(R.id.email);
        adress = findViewById(R.id.adress);
        phone = findViewById(R.id.phone);

        nom.setText("Nom : "+this.getIntent().getStringExtra("nom"));
        //genre.setText(this.getIntent().getStringExtra("genre"));
        ville.setText("Ville : "+this.getIntent().getStringExtra("ville"));
        email.setText("Email : "+this.getIntent().getStringExtra("email"));
        phone.setText("Phone: "+this.getIntent().getStringExtra("phone"));
        adress.setText("Adresse : "+this.getIntent().getStringExtra("adress"));

}

}