package com.omelchenkoaleks.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        mMessageEditText = findViewById(R.id.message_edit_text);
    }

    public void onClickSendMessage(View view) {
        String message = mMessageEditText.getText().toString().trim();
        Intent intent = new Intent(this, ReceivedMassageActivity.class);
        intent.putExtra("msg", message);
        startActivity(intent);
    }
}
