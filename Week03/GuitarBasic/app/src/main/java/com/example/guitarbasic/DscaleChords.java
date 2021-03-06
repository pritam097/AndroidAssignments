package com.example.guitarbasic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class DscaleChords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dscale_chords);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.a_chords:
                Toast.makeText(this, "A Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent1= new Intent(DscaleChords.this, AscaleChords.class);
                startActivity(intent1);
                return true;
            case R.id.b_chords:
                Toast.makeText(this, "B Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent2= new Intent(DscaleChords.this, BscaleChords.class);
                startActivity(intent2);
                return true;
            case R.id.c_chords:
                Toast.makeText(this, "C Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent3= new Intent(DscaleChords.this, CscaleChords.class);
                startActivity(intent3);
                return true;

            case R.id.d_chords:
                Toast.makeText(this, "D Chords Already Selected!", Toast.LENGTH_SHORT).show();
//                Intent intent4 = new Intent(DscaleChords.this, DscaleChords.class);
//                startActivity(intent4);
                return true;
            case R.id.e_chords:
                Toast.makeText(this, "E Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(DscaleChords.this, EscaleChords.class);
                startActivity(intent5);
                return true;
            case R.id.f_chords:
                Toast.makeText(this, "F Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(DscaleChords.this, FscaleChords.class);
                startActivity(intent6);
                return true;
            case R.id.g_chords:
                Toast.makeText(this, "G Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent7 = new Intent(DscaleChords.this, GscaleChords.class);
                startActivity(intent7);
                return true;
            case R.id.home:
                Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                Intent intent8 = new Intent(DscaleChords.this, MainActivity.class);
                startActivity(intent8);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}