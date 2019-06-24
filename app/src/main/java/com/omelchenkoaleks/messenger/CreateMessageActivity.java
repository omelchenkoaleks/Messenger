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

        // указали Андроид, что нам нужна активность, которая умеет отправлять сообщения
        Intent intent = new Intent(Intent.ACTION_SEND);
        // устанавливаем тип передаваемого сообщения
        intent.setType("text/plain");
        // передаем само сообщение
        intent.putExtra(Intent.EXTRA_TEXT, message);

        /*
            если хотим, чтобы у пользователя была всегда возможность выбирать как отправить
            сообщение (чтобы он не заблокировал эту возможность кнопкой "всегда") ...
         */
        Intent chosenIntent = Intent.createChooser(intent,
                getString(R.string.chooser_title));

        startActivity(chosenIntent);
    }
}
