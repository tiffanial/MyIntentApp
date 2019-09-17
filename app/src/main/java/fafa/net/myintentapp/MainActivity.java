package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button btnMoveActivity, btnDial, btnMyActivityWithData, btnURL;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnMoveActivity = findViewById(R.id.btn_move_activity);
            btnMoveActivity.setOnClickListener(this);

            btnMyActivityWithData = findViewById(R.id.btn_move_data);
            btnMyActivityWithData.setOnClickListener(this);

            btnDial = findViewById(R.id.btn_dial);
            btnDial.setOnClickListener(this);

            btnURL = findViewById(R.id.btn_url);
            btnURL.setOnClickListener(this);

            btnURL = findViewById(R.id.btn_masuk);
            btnURL.setOnClickListener(this);


        }

        @Override
                public void onClick(View view){
                    switch (view.getId()){
                        case R.id.btn_move_activity:
                            Intent moveActivity = new
                                    Intent( MainActivity.this, NewActivity.class);
                            startActivity(moveActivity);
                            break;

                        case R.id.btn_move_data:
                            Intent dataIntent = new
                                    Intent(MainActivity.this, MyActivityWithData.class);
                            dataIntent.putExtra
                                (MyActivityWithData.EXTRA_NAME, "Tiffani AL");
                            dataIntent.putExtra
                                (MyActivityWithData.EXTRA_AGE, "25");
                                startActivity(dataIntent);
                                break;

                                case R.id.btn_dial:
                                    String phoneNumber = "085325039998";
                                            Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                                    startActivity(dialPhone);
                                    break;

                        case R.id.btn_url:
                            String URL = "http://polines.ac.id";
                            Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                            startActivity(web);
                            break;

                        case R.id.btn_masuk:
                            Intent masuk2 = new
                                    Intent( MainActivity.this, Activity2Activity.class);
                            startActivity(masuk2);
                            break;

                    }
        }
}

