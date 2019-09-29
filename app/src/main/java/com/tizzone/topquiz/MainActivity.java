package com.tizzone.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tizzone.topquiz.model.User;

public class MainActivity extends AppCompatActivity {
private TextView mGreetingText;
private TextView mNameInput;
private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreetingText=(TextView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput=(TextView) findViewById(R.id.activity_main_editText);
        mPlayButton=(Button) findViewById(R.id.activity_main_button);
        mPlayButton.setEnabled(false);
        final User mUser= new User();
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            mPlayButton.setEnabled(s.toString().length()!=0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity= new Intent(MainActivity.this,GameActivity.class);
                startActivity(gameActivity);
                mUser.setFirstName(mNameInput.getText().toString());
            }
        });
    }
}
