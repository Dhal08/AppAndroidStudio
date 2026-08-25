package com.example.appsumar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // MJME
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);

    }

    //MJME
    // Metodo para la suma de los números
        public void sumar(View view) {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText(resu);
    }

    // Metodo para la resta de los números
        public void restar(View view) {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv1.setText(resu);
        }

// Metodo para la multiplicacion de los numeros
        public void multiplicar(View view) {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int multi=nro1*nro2;
            String resu=String.valueOf(multi);
            tv1.setText(resu);
        }
// Metodo para la multiplicacion de los numeros
        public void dividir(View view) {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int division=nro1/nro2;
            String resu=String.valueOf(division);
            tv1.setText(resu);
        }

// Metodo para limiar el textView, y donde se ingresan los numeros
        public void Limpiar(View view) {
            et1.setText("");
            et2.setText("");
            tv1.setText("");
        }

// Metodo para salir del sistema
        public void Salir(View view) {
            System.exit(0);
    }
}

