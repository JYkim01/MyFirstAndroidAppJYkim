package com.jskim.exjampleapplecaion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity {

    private Button mAthree;
    private Button mAtwo;
    private Button mAone;
    private Button mBthree;
    private Button mBtwo;
    private Button mBone;
    private Button mReset;
    private TextView mTeamAscoreTextView;
    private TextView mTeamBscoreTextView;

    private int mTeamAscore;
    private int mTeamBscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        setContentView(R.layout.activity_basketball);

        mAone = (Button) findViewById(R.id.a_one);
        mAtwo = (Button) findViewById(R.id.a_two);
        mAthree = (Button) findViewById(R.id.a_three);
        mBone = (Button) findViewById(R.id.b_one);
        mBtwo = (Button) findViewById(R.id.b_two);
        mBthree = (Button) findViewById(R.id.b_three);
        mReset = (Button) findViewById(R.id.reset_button);
        mTeamAscoreTextView = (TextView) findViewById(R.id.team_a_score);
        mTeamBscoreTextView = (TextView) findViewById(R.id.team_b_score);

        mAone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAscore = mTeamAscore + 1;
                mTeamAscoreTextView.setText("" + mTeamAscore);
            }
        });
        mAtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAscore = mTeamAscore + 2;
                mTeamAscoreTextView.setText("" + mTeamAscore);
            }
        });
        mAthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAscore = mTeamAscore + 3;
                mTeamAscoreTextView.setText("" + mTeamAscore);
            }
        });
        mBone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBscore = mTeamBscore + 1;
                mTeamBscoreTextView.setText("" + mTeamBscore);
            }
        });
        mBtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBscore = mTeamBscore + 2;
                mTeamBscoreTextView.setText("" + mTeamBscore);
            }
        });
        mBthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBscore = mTeamBscore + 3;
                mTeamBscoreTextView.setText("" + mTeamBscore);
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAscore = 0;
                mTeamBscore = 0;
                mTeamBscoreTextView.setText("" + 0);
                mTeamAscoreTextView.setText("" + 0);
            }
        });

    }
    private void init() {
        mTeamAscore = 0;
        mTeamBscore = 0;
    }
}
