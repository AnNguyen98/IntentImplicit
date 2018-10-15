package com.theannguyen.intentimplicitsendstring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MH2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mh2);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String data = intent.getStringExtra("dataName");
        int    intdata = intent.getIntExtra("dataInt" , 123);
        ArrayList<String> arrayList = intent.getStringArrayListExtra("arrayValue");
        Student student = (Student) intent.getSerializableExtra("object");
        textView.setText(student.name);
    }
}
