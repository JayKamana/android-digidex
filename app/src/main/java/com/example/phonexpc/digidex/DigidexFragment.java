package com.example.phonexpc.digidex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class DigidexFragment extends Fragment implements View.OnClickListener{

    ImageButton guilmon, renamon, cyberdramon, guardromon, impmon, leomon, lopmon, marinangemon, terriermon;

    public DigidexFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_digidex, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        guilmon = getView().findViewById(R.id.guilmon);
        renamon = getView().findViewById(R.id.renamon);
        cyberdramon = getView().findViewById(R.id.cyberdramon);
        guardromon = getView().findViewById(R.id.guardromon);
        impmon = getView().findViewById(R.id.impmon);
        leomon = getView().findViewById(R.id.leomon);
        lopmon = getView().findViewById(R.id.lopmon);
        marinangemon = getView().findViewById(R.id.marinangemon);
        terriermon = getView().findViewById(R.id.terriermon);

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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




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

            Intent intent = new Intent(getActivity(), DigimonDetails.class);
            intent.putExtra("Name", digimonName);
            intent.putExtra("Desc", aBuffer);

            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                startActivity(intent);
            } else {
              DetailsFragment frag = (DetailsFragment)getActivity().getSupportFragmentManager().findFragmentById(R.id.frag_details);;
                frag.setName(digimonName, aBuffer);
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
