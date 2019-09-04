package com.example.meuprimeiroapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActive {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximaTela(View view){

        Intent intent = new Intent(this, tela2.class);
        startActivity(intent);
    }
}
