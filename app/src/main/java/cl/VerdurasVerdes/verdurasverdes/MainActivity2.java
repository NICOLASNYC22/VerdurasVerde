package cl.VerdurasVerdes.verdurasverdes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btcalcular;
    Button btlimpiar;
    EditText etcostoverduras;
    EditText ettotalhestareas;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = findViewById(R.id.eTCostoVerduras);
        btcalcular = findViewById(R.id.btbutton2);
        btlimpiar = findViewById(R.id.btbutton3);
        etcostoverduras = findViewById(R.id.eTCostoVerduras);
        ettotalhestareas = findViewById(R.id.eTTotalHectareas);

        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String costoverdurastexto = etcostoverduras.getText().toString();
                String costototalhestareastexto = ettotalhestareas.getText().toString();
                double costototalVerduras = Double.parseDouble(costoverdurastexto);
                double totalHestareas = Double.parseDouble(costototalhestareastexto);
                Double resultado = costototalVerduras = totalHestareas;

                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("mensaje" , resultado);
                startActivity(intent);
                finish();
            }
        });

        btlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etcostoverduras.setText("");
                ettotalhestareas.setText("");
            }
        });
    }
}