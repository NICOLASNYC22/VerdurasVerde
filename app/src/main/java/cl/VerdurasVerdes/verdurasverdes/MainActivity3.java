package cl.VerdurasVerdes.verdurasverdes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button btVolver;

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        texto = findViewById(R.id.tvResultado);
        btVolver = findViewById(R.id.btbutton4);
        double resultado = getIntent().getDoubleExtra("mensaje",0);

        texto.setText("El Resultado es:" + String.valueOf(resultado));
        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}