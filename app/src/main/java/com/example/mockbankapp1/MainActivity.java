package com.example.mockbankapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make varables for ellements of interest
        final Button ButtTransfer = findViewById(R.id.btn_transfer);
        final Button ButtTransaction = findViewById(R.id.btn_transactions);
        final TextView BallField = findViewById(R.id.lbl_balance);

        //set our starting balance to a random number between 90 and 110
        final int startingBalance = new Random().nextInt(21) + 90; // [0, 20] + 90 => [90, 110]
        BallField.setText(Integer.toString(startingBalance));

        ButtTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Make Activity active

                Intent i = new Intent(MainActivity.this, TransactionsActivity.class);
                startActivity(i);
            }
        });

        ButtTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Activity active
                Intent i = new Intent(MainActivity.this, TransferActivity.class);
                startActivity(i);
            }
        });
    }
}
