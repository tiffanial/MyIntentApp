package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivityWithData extends AppCompatActivity{
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";


    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_data);

        TvDataReceived = findViewById(R.id.tv_data_received);

        String umur = getIntent().getStringExtra(EXTRA_AGE);
        String nama = getIntent().getStringExtra(EXTRA_NAME);

        String text = "Nama : "+nama+"\nUmur : " +umur;
        TvDataReceived.setText(text);



    }
}
