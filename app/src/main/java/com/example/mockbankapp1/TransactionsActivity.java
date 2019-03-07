package com.example.mockbankapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class TransactionsActivity extends AppCompatActivity {

    private RecyclerView mResView;
    private MyAdapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;
    private  ArrayList<String> mTextSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        mResView = findViewById(R.id.transa_res_view);

        final RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);

        mResView.setLayoutManager(layoutManager);

        Bundle myText = getIntent().getExtras();

        mTextSet = new ArrayList<>();

        mTextSet.add(myText.getString("transHistory")); // Adds premade history

        mAdapter = new MyAdapter(mTextSet.toArray(new String[mTextSet.size()]));
        mResView.setAdapter(mAdapter);

        final Button btn = findViewById(R.id.transa_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText txt = findViewById(R.id.transa_edit_txtinput);

                mTextSet.add(txt.getText().toString());
                mAdapter.ReplaceData(mTextSet.toArray(new String[mTextSet.size()]));

                // Either one or the other
                // mResView.setAdapter(mAdapter);
                mResView.swapAdapter(mAdapter, true); // Better
            }
        });
    }
}
