package com.example.phonexpc.digidex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DigimonDetails extends AppCompatActivity {

    TextView digimonName, digimonDesc;
    ImageView digimonImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digimon_details);


        digimonName = findViewById(R.id.digimonName);
        digimonDesc = findViewById(R.id.digimonDesc);
        digimonImageView = findViewById(R.id.digimonImageView);


        Bundle bundle = getIntent().getExtras();

        digimonName.setText(bundle.getString("Name"));
        digimonDesc.setText(bundle.getString("Desc"));

        switch(bundle.getString("Name")){
            case "Cyberdramon":
                digimonImageView.setBackgroundResource(R.drawable.cyberdramon);
                break;
            case "Guardromon":
                digimonImageView.setBackgroundResource(R.drawable.guardromon);
                break;
            case "Guilmon":
                digimonImageView.setBackgroundResource(R.drawable.guilmon);
                break;
            case "Impmon":
                digimonImageView.setBackgroundResource(R.drawable.impmon);
                break;
            case "Leomon":
                digimonImageView.setBackgroundResource(R.drawable.leomon);
                break;
            case "Lopmon":
                digimonImageView.setBackgroundResource(R.drawable.lopmon);
                break;
            case "Marinangemon":
                digimonImageView.setBackgroundResource(R.drawable.marinangemon);
                break;
            case "Renamon":
                digimonImageView.setBackgroundResource(R.drawable.renamon);
                break;
            case "Terriermon":
                digimonImageView.setBackgroundResource(R.drawable.terriermon);
                break;
        }

    }
}
