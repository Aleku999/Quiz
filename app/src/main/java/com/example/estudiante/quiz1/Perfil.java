package com.example.estudiante.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {

    private TextView tvHolaName;
    private TextView tvInfoName;
    private Button btnUserclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tvHolaName= findViewById(R.id.tv_hello_name);
        tvInfoName= findViewById(R.id.tv_info_name);
        btnUserclose= findViewById(R.id.btn_close);

        btnUserclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cerrar= new Intent();
                setResult(Pages.RES_NEW_USER,cerrar);

                finish();
            }
        });
    }
}
