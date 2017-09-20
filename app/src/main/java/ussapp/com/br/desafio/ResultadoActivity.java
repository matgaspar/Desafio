package ussapp.com.br.desafio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView textEdit = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        double resultado = bundle.getDouble("resultado");
        textEdit.setText("Resultado: " + resultado);

        Button bVoltar = (Button) findViewById(R.id.button);
        bVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ResultadoActivity.this, PrimeiraActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                                Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
