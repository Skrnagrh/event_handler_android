package com.example.uassukron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn, btn2;
    TextView txtout;
    int b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        txtout = (TextView) findViewById(R.id.textView);

    }

    public void showToast(View view) {
        switch (view.getId()){
            case R.id.button:
//                txtout.setText("2");
                b1 = Integer.parseInt(txtout.getText().toString());
                int hsl1 = b1 +2;
                txtout.setText(Integer.toString(hsl1));
                break;
            case R.id.button2:
//                txtout.setText("2");
                b2 = Integer.parseInt(txtout.getText().toString());
                int hsl2 = b2 -1;
                txtout.setText(Integer.toString(hsl2));
                break;
            default:
                break;
        }

    }
}