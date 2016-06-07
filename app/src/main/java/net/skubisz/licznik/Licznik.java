package net.skubisz.licznik;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Licznik extends AppCompatActivity {

    int licznik = 0;
    TextView cyfry;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licznik);
        init();
    }

    public void init() {
        cyfry = (TextView) findViewById(R.id.cyfra);
        button = (Button) findViewById(R.id.dodaj);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cyfry.setText(licznik++);
                Toast.makeText(getApplicationContext(), "Dodano +1", Toast.LENGTH_SHORT).show();
            }
        });
        button = (Button) findViewById(R.id.odejmij);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cyfry.setText(licznik--);
                Toast.makeText(getApplicationContext(), "Odjęto -1", Toast.LENGTH_SHORT).show();
            }
        });
        button = (Button) findViewById(R.id.zresetuj);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cyfry.setText(licznik = 0);
                Toast.makeText(getApplicationContext(), "Zresetowano wynik", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
