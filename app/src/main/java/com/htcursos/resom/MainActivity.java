package com.htcursos.resom;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Cria a Activity no Android
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) { // Valores podem ser nulos (@Nullable)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
