package com.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputAngka1 = (EditText) findViewById(R.id.inputAngka1);
        EditText inputAngka2 = (EditText) findViewById(R.id.inputAngka2);

        Button btnTambah = (Button) findViewById(R.id.btnTambah);
        Button btnKurang2 = (Button) findViewById(R.id.btnKurang2);
        Button btnKali2 = (Button) findViewById(R.id.btnKali2);
        Button btnBagi = (Button) findViewById(R.id.btnBagi);


        EditText inpHasil = (EditText) findViewById(R.id.inpHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil ;

                String string_inputAngka1 = inputAngka1.getText().toString();
                String string_inputAngka2 = inputAngka2.getText().toString();

                if(string_inputAngka1.isEmpty()){
                    inputAngka1.setText("0");

                }

                if(string_inputAngka2.isEmpty()){
                    inputAngka2.setText("0");
                }

                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 + nilai_inputAngka2;
                inpHasil.setText(nilai_hasil.toString());


            }
        });

        btnKurang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil ;
                String string_inputAngka1 = inputAngka1.getText().toString();
                String string_inputAngka2 = inputAngka2.getText().toString();

                if(string_inputAngka1.isEmpty()){
                    inputAngka1.setText("0");

                }

                if(string_inputAngka2.isEmpty()){
                    inputAngka2.setText("0");
                }

                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 - nilai_inputAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        btnKali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil ;
                String string_inputAngka1 = inputAngka1.getText().toString();
                String string_inputAngka2 = inputAngka2.getText().toString();

                if(string_inputAngka1.isEmpty()){
                    inputAngka1.setText("0");

                }

                if(string_inputAngka2.isEmpty()){
                    inputAngka2.setText("0");
                }

                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 * nilai_inputAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil ;
                String string_inputAngka1 = inputAngka1.getText().toString();
                String string_inputAngka2 = inputAngka2.getText().toString();

                if(string_inputAngka1.isEmpty()){
                    inputAngka1.setText("0");

                }

                if(string_inputAngka2.isEmpty()){
                    inputAngka2.setText("0");
                }

                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 / nilai_inputAngka2;
                inpHasil.setText(nilai_hasil.toString());
            }
        });

        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputAngka1.setText("");
                inputAngka2.setText("");
                inpHasil.setText("");

            }
        });

        Button btnExit = (Button)  findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}