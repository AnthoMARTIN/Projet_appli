package com.example.projet_fil_rouge_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class panier extends AppCompatActivity{

    private TextView nom_produit, prix, description;
    private Button ajouter_panier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_produit);

        nom_produit = findViewById(R.id.nom_produit);
        prix = findViewById(R.id.prix);
        description = findViewById(R.id.description);
        ajouter_panier = findViewById(R.id.ajouter_panier);

        ajouter_panier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ajouter du code quand Jason nous passera son api
            }
        });
    }


}
