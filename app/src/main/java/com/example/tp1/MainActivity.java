package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText nom,email,adress,phone;
    private Button send;
    private Spinner villes;
    //private RadioButton m, f;
    //private String genre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        email = findViewById(R.id.email);
        adress = findViewById(R.id.adress1);
        phone = findViewById(R.id.phone1);
        send = findViewById(R.id.send);
        villes  =  findViewById(R.id.villes);
        //m = findViewById(R.id.m);
        //f = findViewById(R.id.f);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(m.isChecked())
                    //genre = "Monsieur";
               // else if(f.isChecked())
                    //genre = "Madame";
                //Toast.makeText(MainActivity.this, genre+" "+ nom.getText()+" habite à "+villes.getSelectedItem(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("ville", villes.getSelectedItem().toString());
                //intent.putExtra("genre", genre);
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adress", adress.getText().toString());


                startActivity(intent);

                MainActivity.this.finish();
            }


});}

}