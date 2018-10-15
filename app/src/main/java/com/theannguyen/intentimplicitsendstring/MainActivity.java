package com.theannguyen.intentimplicitsendstring;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonSendData;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSendData = (Button) findViewById(R.id.btnSendData);
        arrayList = new ArrayList<>();
        arrayList.add("IOS");
        arrayList.add("Android");

        final Student student = new Student("An",20,"BK");

        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MH2.class);
                intent.putExtra("dataName","Hello world!");
                intent.putExtra("dataInt",10000);
                intent.putStringArrayListExtra("arrayValue",arrayList);
                intent.putExtra("object",student);
                startActivity(intent);
            }
        });

    }
}
