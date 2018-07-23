package com.example.phonexpc.digidex;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsFragment extends Fragment {

    TextView digimonName, digimonDesc;
    ImageView digimonImageView;

    public DetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        digimonName = getView().findViewById(R.id.digimonName);
        digimonDesc = getView().findViewById(R.id.digimonDesc);
        digimonImageView = getView().findViewById(R.id.digimonImageView);




        try{
            if(getActivity().getIntent().getExtras().getString("Name").length() != 0){
                Bundle bundle = getActivity().getIntent().getExtras();

                digimonName.setText(bundle.getString("Name"));
                digimonDesc.setText(bundle.getString("Desc"));

                selectImage(bundle.getString("Name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }



    }

    public void setName(String name, String desc){
        digimonName.setText(name);
        digimonDesc.setText(desc);
        selectImage(name);
    }

    public void selectImage(String image){

        switch(image){
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



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }
}
