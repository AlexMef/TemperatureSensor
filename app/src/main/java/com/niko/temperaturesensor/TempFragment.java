package com.niko.temperaturesensor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;

public class TempFragment extends Fragment {

    TextView txtViewTemp;

    public TempFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_temp, container, false);
        txtViewTemp = rootView.findViewById(R.id.txtViewTemp);
        new Thread(new Runnable() {
            @Override
            public void run() {
                final String str = new GetWeb().doInBackground();
                Objects.requireNonNull(getActivity()).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        txtViewTemp.setText(str);
                    }
                });
            }

        }).start();

        return rootView;
    }

}
