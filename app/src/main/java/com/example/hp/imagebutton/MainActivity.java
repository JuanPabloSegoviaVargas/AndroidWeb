package com.example.hp.imagebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.hp.imagebutton.R.id.button2;
import static com.example.hp.imagebutton.R.id.editText2;
import static com.example.hp.imagebutton.R.id.start;

public class MainActivity extends AppCompatActivity {
    private EditText et,t1;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editText2);
        et=(EditText)findViewById(R.id.editText);
        num=(int)(Math.random()*1000);
        String cadena= String.valueOf(num);
        Toast notificiacion= Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificiacion.show();


    }
    public void ver(View v){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("direccion",t1.getText().toString());
        startActivity(i);
    }
    public void Controlar(View v){

        String Valor=et.getText().toString();
        int valor = Integer.parseInt(Valor);
        if(valor == num){
            Toast notificacion = Toast.makeText(this,"Adivinaste el numero mostrado",Toast.LENGTH_SHORT);
            notificacion.show();

        }else {
            Toast notificacion = Toast.makeText(this,"Error",Toast.LENGTH_SHORT);
            notificacion.show();

        }
    }
}
