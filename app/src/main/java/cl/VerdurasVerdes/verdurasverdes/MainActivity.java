package cl.VerdurasVerdes.verdurasverdes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,MainActivity2.class);
        btInicio = (Button) findViewById(R.id.btbutton1);
        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){startActivity(intent); }
        });
    }
}