package com.jskim.exjampleapplecaion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final int QUANTITY_MIN = 0;
    public static final int QUANTITY_MAX = 10;
    public static final int COFFEE_PRICE = 3000;
    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;
    private TextView mResultTextView;
    private Button mOrderButton;

    // 수량
    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 초기화
        init();

        // 레이아웃 표시
        setContentView(R.layout.layout_exam_2);

        // 레이아웃에서 특징 id를 인스턴스 변수와 연결
        mMinusButton = (Button) findViewById(R.id.minus_button);
        mPlusButton = (Button) findViewById(R.id.plus_button);
        mQuantityTextView = (TextView) findViewById(R.id.quantity_text);
        mResultTextView = (TextView) findViewById(R.id.result_text);
        mOrderButton = (Button) findViewById(R.id.order_button);

        // 무명클래스
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuantity--;
                if (mQuantity < QUANTITY_MIN) {
                    mQuantity = QUANTITY_MIN;
                }
                mQuantityTextView.setText("" + mQuantity);

                disPlayResult();
            }
        });
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuantity++;
                if (mQuantity > QUANTITY_MAX) {
                    mQuantity = QUANTITY_MAX;
                }
                mQuantityTextView.setText("" + mQuantity);

                disPlayResult();


            }
        });
        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mResultTextView.getText().toString();
                Toast.makeText(MainActivity.this, message , Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void disPlayResult() {
        int price = COFFEE_PRICE;
        String result = "가격 : " + (COFFEE_PRICE * mQuantity) + "원\n 감사합니다.";
        mQuantityTextView.setText(result);
    }

    private void init() {
        mQuantity = 0;
    }
}
