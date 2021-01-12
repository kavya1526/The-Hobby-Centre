package com.example.app1_kavya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void About(View view){
        Toast.makeText(this, "Our organization's motto is to promote extra curricular activities among students", Toast.LENGTH_SHORT).show();
    }

    public void Details(View view)
    {
        Toast.makeText(this, "For more details...", Toast.LENGTH_SHORT).show();
    }

    public void Contact(View view)
    {
        Toast.makeText(this, "Opening contact details...", Toast.LENGTH_SHORT).show();
    }
    public void dance(View view)
    {
        Toast.makeText(this, "Fetching dance information...", Toast.LENGTH_SHORT).show();
    }
    public void music(View view)
    {
        Toast.makeText(this, "Fetching music information...", Toast.LENGTH_SHORT).show();
    }
    public void art(View view)
    {
        Toast.makeText(this, "Fetching art information...", Toast.LENGTH_SHORT).show();
    }
    public void read(View view)
    {
        Toast.makeText(this, "Fetching reading information...", Toast.LENGTH_SHORT).show();
    }public void horse(View view)
    {
        Toast.makeText(this, "Fetching horse riding information...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}