package com.dguardado19.labo4.utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.dguardado19.labo4.R;

public class Share extends AppCompatActivity {
    private TextView usuario, contra, v1,v2,v3,v4,v5,v6,v7,v8,v9;
    private String enviando;
    private Button compartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasando);
        usuario = findViewById(R.id.usuarioview);
        contra = findViewById(R.id.correoview);
        v1 =findViewById(R.id.producto1view);
        v2 =findViewById(R.id.producto2view);
        v3 =findViewById(R.id.producto3view);
        v4 =findViewById(R.id.producto4view);
        v5 =findViewById(R.id.producto5view);
        v6 =findViewById(R.id.producto6view);
        v7 =findViewById(R.id.producto7view);
        v8 =findViewById(R.id.producto8view);
        v9 =findViewById(R.id.producto9view);
        compartir =findViewById(R.id.compa);

        Intent mIntent = getIntent();

        if (mIntent!=null) {
            usuario.setText(mIntent.getStringExtra(AppConstant.USER_KEY));
            contra.setText(mIntent.getStringExtra(AppConstant.PASS_KEY));
            v1.setText(mIntent.getStringExtra(AppConstant.CA_KEY));
            v2.setText(mIntent.getStringExtra(AppConstant.C2_KEY));
            v3.setText(mIntent.getStringExtra(AppConstant.C3_KEY));
            v4.setText(mIntent.getStringExtra(AppConstant.C4_KEY));
            v5.setText(mIntent.getStringExtra(AppConstant.C5_KEY));
            v6.setText(mIntent.getStringExtra(AppConstant.C6_KEY));
            v7.setText(mIntent.getStringExtra(AppConstant.C7_KEY));
            v8.setText(mIntent.getStringExtra(AppConstant.C8_KEY));
            v9.setText(mIntent.getStringExtra(AppConstant.C9_KEY));




        }
        compartir.setOnClickListener(v->{

            Intent xIntent = new Intent();
            xIntent.setAction(Intent.ACTION_SEND);
            xIntent.setType("text/plain");
            xIntent.putExtra(Intent.EXTRA_TEXT, usuario.getText().toString()+ "\n"+ contra.getText().toString()+ "\n");
            startActivity(xIntent);
        });
    }
}
