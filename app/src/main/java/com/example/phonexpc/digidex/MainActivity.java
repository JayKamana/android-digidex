package com.example.phonexpc.digidex;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.Toast;

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
        Toast.makeText(this, tag, Toast.LENGTH_SHORT).show();
    }
}
