package com.example.teammanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        Button returnButton = findViewById(R.id.returnButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Register.this.finish();
            }
        });
}
