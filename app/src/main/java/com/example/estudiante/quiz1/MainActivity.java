package com.example.estudiante.quiz1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
// Las personas que realizaron este quiz fueron Alejandro Salazar y Daniela García
public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private EditText edtUserWrite;
    private EditText edtPassword;
    private TextView tv_error;
    private TextView tvWelcome;
    private TextView tvDescription;
    private Image imLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.btn_acess);
        edtUserWrite = findViewById(R.id.edt_user);
        edtPassword = findViewById(R.id.edt_pass);
        tvDescription = findViewById((R.id.textView));

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrar = new Intent (getApplicationContext(),Perfil.class );
                String usuario= edtUserWrite.getText().toString();
                int password = Integer.parseInt(edtPassword.getText().toString());

        registrar.putExtra("usuario", usuario);
        registrar.putExtra("password",password);

                if(usuario.equals("Administrador")){
                    Toast.makeText(MainActivity.this, "El usuario o la contraseña SI es correcta", Toast.LENGTH_LONG).show();
                    if(password == 123456) {
                        startActivityForResult(registrar, Pages.REQ_NEW_USER);
                        Toast.makeText(MainActivity.this, "El usuario o la contraseña SI es correcta", Toast.LENGTH_LONG).show();
                    }
                }else{
                    //tvDescription.setText("El usuario o la contraseña NO es correcta");

                    Toast.makeText(MainActivity.this, "El usuario o la contraseña NO es correcta", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
