package com.jskim.exjampleapplecaion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntentExam2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_exam2);

        findViewById(R.id.cm_text).setOnClickListener(this);
        findViewById(R.id.sm_text).setOnClickListener(this);
        findViewById(R.id.md_text).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cm_text :
                Intent cm = new Intent();
                cm.putExtra("Customer management","고객관리를 선택하셨습니다.");
                setResult(RESULT_OK,cm);
                finish();
                break;

            case R.id.sm_text :
                Intent sm = new Intent();
                sm.putExtra("Sales management","매출관리를 선택하셨습니다.");
                setResult(RESULT_OK,sm);
                finish();
                break;

            case R.id.md_text :
                Intent md = new Intent();
                md.putExtra("Merchandise management","상품관리를 선택하셨습니다.");
                setResult(RESULT_OK,md);
                finish();
                break;
        }
    }
}
