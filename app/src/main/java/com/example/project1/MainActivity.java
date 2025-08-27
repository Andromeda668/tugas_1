package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);

    }

    public void showToast(View view) {
        Toast.makeText( this,  "Hello World", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        count++;
        textView.setText(count+"");
    }

    public void reset(View view) {
        textView.setText("0");
        count = 0;
    }
}