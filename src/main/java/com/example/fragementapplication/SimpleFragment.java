package com.example.fragementapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SimpleFragment extends Fragment {

    View view;
    Button button;
    EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_simple, container, false);
        button =view.findViewById(R.id.button);
        editText=view.findViewById(R.id.ed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.textView.setText(editText.getText().toString().trim());
                Toast.makeText(getActivity(), "Fragment Done...!!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
