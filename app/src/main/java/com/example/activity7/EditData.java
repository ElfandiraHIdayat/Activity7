package com.example.activity7;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditData extends AppCompatActivity {

    private EditText editNm,editTlpn;
    private Button btnbatal,btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);

        editNm = findViewById(R.id.editNama);
        editTlpn = findViewById(R.id.editTelpon);
        btnbatal = findViewById(R.id.btnBatal);
        btnsimpan = findViewById(R.id.btnSimpan);
    }
}