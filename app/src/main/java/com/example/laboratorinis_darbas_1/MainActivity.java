package com.example.laboratorinis_darbas_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    String[] greetings = {
            "Labas", // lietuvių
            "Hello", // anglų
            "Hola", // ispanų
            "Bonjour", // prancūzų
            "Hallo", // vokiečių
            "Ciao", // italų
            "Olá", // portugalų
            "こんにちは", // japonų
            "안녕하세요", // korėjiečių
            "你好", // kinų
            "Merhaba", // turkų
            "Salam", // arabų
            "Shalom", // hebrajų
            "Hej", // švedų
            "γειά σου" //graikų
    };
    int greetingIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    // Mygtukas: keičia tekstą
    public void OnBtnClick(View view) {
        greetingIndex = (greetingIndex + 1) % greetings.length;
        this.tvMain.setText(greetings[greetingIndex]);
    }
}

