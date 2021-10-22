package com.example.courseworkapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dashboard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dashboard extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public dashboard() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dashboard.
     */
    // TODO: Rename and change types and number of parameters
    public static dashboard newInstance(String param1, String param2) {
        dashboard fragment = new dashboard();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ImageButton sendTxButton = v.findViewById(R.id.sendTxBtn);
        ImageButton profileButton = v.findViewById(R.id.profileBtn);
        ImageButton atmFinderButton = v.findViewById(R.id.atmFinderBtn);
        ImageButton settingsButton = v.findViewById(R.id.settingsBtn);
        ImageButton exchangeButton = v.findViewById(R.id.exchangeBtn);
        sendTxButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);
        atmFinderButton.setOnClickListener(this);
        settingsButton.setOnClickListener(this);
        exchangeButton.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.sendTxBtn){
            Navigation.findNavController(v).navigate(R.id.transfer);
        } else if(v.getId() == R.id.profileBtn){
            Navigation.findNavController(v).navigate(R.id.account_profile);
        } else if(v.getId() == R.id.atmFinderBtn){
            Navigation.findNavController(v).navigate(R.id.atm_finder);
        } else if(v.getId() == R.id.settingsBtn){
            Navigation.findNavController(v).navigate(R.id.settings);
        } else if(v.getId() == R.id.exchangeBtn){
            Navigation.findNavController(v).navigate(R.id.exchange);
        }
    }
}