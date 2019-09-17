package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3Activity extends AppCompatActivity {
    TextView up;
    String okemasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        up = findViewById(R.id.enter2);

        okemasuk = getIntent().getStringExtra("enterisi");
        up.setText(okemasuk);
    }
}
