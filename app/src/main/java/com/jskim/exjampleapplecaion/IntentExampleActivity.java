package com.jskim.exjampleapplecaion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IntentExampleActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mId;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_exjample);

        mId = (EditText) findViewById(R.id.id_text);
        mPassword = (EditText) findViewById(R.id.password_text);

        findViewById(R.id.login_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, IntentExam2Activity.class);
        intent.putExtra("id", mId.getText().toString());
        intent.putExtra("password", mPassword.getText().toString());
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String cmresult = data.getStringExtra("Customer management");
        Toast.makeText(this, cmresult, Toast.LENGTH_SHORT).show();
        String smresult = data.getStringExtra("Sales management");
        Toast.makeText(this, smresult, Toast.LENGTH_SHORT).show();
        String mdresult = data.getStringExtra("Merchandise management");
        Toast.makeText(this, mdresult, Toast.LENGTH_SHORT).show();
    }
}
