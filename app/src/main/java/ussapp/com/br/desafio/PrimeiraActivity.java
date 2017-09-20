package ussapp.com.br.desafio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.view.*;


public class PrimeiraActivity extends AppCompatActivity {

    EditText et_numero1, et_numero2, et_resultado; // criando variáveis
    Button bt_soma, bt_subtrair, bt_multiplicar, bt_dividir;
    double db_numero1, db_numero2, db_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        et_numero1 = (EditText) findViewById(R.id.numero1);
        et_numero2 = (EditText) findViewById(R.id.numero2);
        bt_soma = (Button) findViewById(R.id.soma);
        bt_subtrair = (Button) findViewById(R.id.subtrair);
        bt_multiplicar = (Button) findViewById(R.id.multiplicar);
        bt_dividir = (Button) findViewById(R.id.dividir);

        bt_soma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                db_numero1 = Double.parseDouble(et_numero1.getText().toString());
                db_numero2 = Double.parseDouble(et_numero2.getText().toString());
                db_resultado = db_numero1 + db_numero2;
                resultado(db_resultado);
                //et_resultado.setText(String.valueOf(db_resultado));

            }
        });

        bt_subtrair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                db_numero1 = Double.parseDouble(et_numero1.getText().toString());
                db_numero2 = Double.parseDouble(et_numero2.getText().toString());
                db_resultado = db_numero1 - db_numero2;
                resultado(db_resultado);
                //et_resultado.setText(String.valueOf(db_resultado));
            }
        });

        bt_multiplicar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                db_numero1 = Double.parseDouble(et_numero1.getText().toString());
                db_numero2 = Double.parseDouble(et_numero2.getText().toString());
                db_resultado = db_numero1 * db_numero2;
                resultado(db_resultado);
                //et_resultado.setText(String.valueOf(db_resultado));
            }
        });

        bt_dividir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                db_numero1 = Double.parseDouble(et_numero1.getText().toString());
                db_numero2 = Double.parseDouble(et_numero2.getText().toString());
                db_resultado = db_numero1 / db_numero2;
                resultado(db_resultado);
                //et_resultado.setText(String.valueOf(db_resultado));
            }
        });
    }

    protected void resultado(double result){
        Intent intent = new Intent(PrimeiraActivity.this, ResultadoActivity.class);
        Bundle b = new Bundle();
        b.putDouble("resultado", result);
        intent.putExtra("bundle", b);
        startActivity(intent);
    }
}
