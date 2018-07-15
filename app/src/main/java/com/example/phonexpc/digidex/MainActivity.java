package com.example.phonexpc.digidex;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.util.Log;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.Toast;

        import java.io.BufferedReader;
        import java.io.InputStream;
        import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton guilmon, renamon, cyberdramon, guardromon, impmon, leomon, lopmon, marinangemon, terriermon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guilmon = findViewById(R.id.guilmon);
        renamon = findViewById(R.id.renamon);
        cyberdramon = findViewById(R.id.cyberdramon);
        guardromon = findViewById(R.id.guardromon);
        impmon = findViewById(R.id.impmon);
        leomon = findViewById(R.id.leomon);
        lopmon = findViewById(R.id.lopmon);
        marinangemon = findViewById(R.id.marinangemon);
        terriermon = findViewById(R.id.terriermon);

        guilmon.setOnClickListener(this);
        renamon.setOnClickListener(this);
        cyberdramon.setOnClickListener(this);
        guardromon.setOnClickListener(this);
        impmon.setOnClickListener(this);
        leomon.setOnClickListener(this);
        lopmon.setOnClickListener(this);
        marinangemon.setOnClickListener(this);
        terriermon.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        ImageButton button = (ImageButton) view;
        String tag = button.getTag().toString();

        try{
            InputStream inputStream;

            switch(tag){
                case "Cyberdramon":
                    inputStream = getResources().openRawResource(R.raw.cyberdramon);
                    readfile(tag, inputStream);
                    break;
                case "Guardromon":
                    inputStream = getResources().openRawResource(R.raw.guardromon);
                    readfile(tag, inputStream);
                    break;
                case "Guilmon":
                    inputStream = getResources().openRawResource(R.raw.guilmon);
                    readfile(tag, inputStream);
                    break;
                case "Impmon":
                    inputStream = getResources().openRawResource(R.raw.impmon);
                    readfile(tag, inputStream);
                    break;
                case "Leomon":
                    inputStream = getResources().openRawResource(R.raw.leomon);
                    readfile(tag, inputStream);
                    break;
                case "Lopmon":
                    inputStream = getResources().openRawResource(R.raw.lopmon);
                    readfile(tag, inputStream);
                    break;
                case "Marinangemon":
                    inputStream = getResources().openRawResource(R.raw.marinangemon);
                    readfile(tag, inputStream);
                    break;
                case "Renamon":
                    inputStream = getResources().openRawResource(R.raw.renamon);
                    readfile(tag, inputStream);
                    break;
                case "Terriermon":
                    inputStream = getResources().openRawResource(R.raw.terriermon);
                    readfile(tag, inputStream);
                    break;
            }


        } catch(Exception e){
            e.printStackTrace();
        }


    }

    private void readfile(String digimonName, InputStream inputStream) {


        try {
            String aBuffer = "";

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String aDataRow = "";

            while ((aDataRow = reader.readLine()) != null) {
                aBuffer += aDataRow;
            }
            reader.close();

            Intent intent = new Intent(MainActivity.this, DigimonDetails.class);
            intent.putExtra("Name", digimonName);
            intent.putExtra("Desc", aBuffer);
            startActivity(intent);

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
