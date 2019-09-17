package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2Activity extends AppCompatActivity {
    EditText edit;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        edit = findViewById(R.id.edit);
        enter = findViewById(R.id.btn_enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String masuk = edit.getText().toString();
                    startActivity(new Intent(Activity2Activity.this,Activity3Activity.class).putExtra("enterisi", masuk));

            }
        });

    }
}
