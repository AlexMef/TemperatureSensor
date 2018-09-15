package com.niko.temperaturesensor;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MenuFragment extends Fragment implements View.OnClickListener {

    Button btnTemp;
    Button btnHumid;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);
        btnTemp = rootView.findViewById(R.id.btnTemp);
        btnTemp.setOnClickListener(this);
        btnHumid = rootView.findViewById(R.id.btnHumid);
        btnHumid.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTemp:
                Toast.makeText(getActivity(), "Temperature", Toast.LENGTH_SHORT).show();
                Fragment fragment = new TempFragment();
                FragmentTransaction transaction;
                if (getFragmentManager() != null) {
                    transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.main_layout, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                break;
            case R.id.btnHumid:
                Toast.makeText(getActivity(), "Humidity", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
