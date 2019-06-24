package com.omelchenkoaleks.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMassageActivity extends AppCompatActivity {
    private TextView mReceivedMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_massage);

        mReceivedMessageTextView = findViewById(R.id.received_message_text_view);

        Intent intent = getIntent();
        // сохраняем полученные данные из интента в переменную
        String message = intent.getStringExtra("msg");

        mReceivedMessageTextView.setText(message);
    }
}
