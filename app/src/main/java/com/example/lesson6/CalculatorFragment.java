package com.example.lesson6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment extends Fragment {
    TextView resultField,numberField,operation;
    Button button1, button2, button0, button3, button4, button5, button6, button7, button8, button9, ravno, tochka, divide, multiply, plus, minus;
    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator, container, false);

    }

    private void onAttach() {
        Log.d("olol","onAttach");
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        onAttach();
        super.onViewCreated(view, savedInstanceState);
        final MainActivity listener = (MainActivity) getActivity();
        resultField = view.findViewById(R.id.resultField);
        numberField = view.findViewById(R.id.numberField);
        operation = view.findViewById(R.id.operationField);
        ((MainActivity) getActivity()).resultField = resultField;
        ((MainActivity) getActivity()).numberField = numberField;
        ((MainActivity) getActivity()).operationField = operation;
        button0=view.findViewById(R.id.zero);
        button1=view.findViewById(R.id.button1);
        button2=view.findViewById(R.id.button2);
        button3=view.findViewById(R.id.button3);
        button4=view.findViewById(R.id.button4);
        button5=view.findViewById(R.id.button5);
        button6=view.findViewById(R.id.button6);
        button7=view.findViewById(R.id.button7);
        button8=view.findViewById(R.id.button8);
        button9=view.findViewById(R.id.button9);
        tochka=view.findViewById(R.id.tocka);
        minus = view.findViewById(R.id.minus);
        multiply = view.findViewById(R.id.multiply);
        divide = view.findViewById(R.id.divide);
        plus = view.findViewById(R.id.plus);
        ravno = view.findViewById(R.id.ravno);
        ravno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
      listener.onOperationClick(v);

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              listener.onOperationClick(v);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               listener.onOperationClick(v);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });   button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });   button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });   button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });   button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });   button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);
            }
        });
        tochka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNumberClick(v);

            }
        });

    }}