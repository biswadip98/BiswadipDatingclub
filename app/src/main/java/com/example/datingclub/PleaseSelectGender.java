package com.example.datingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class PleaseSelectGender extends AppCompatActivity {
    String [] item = {"(Male", "Female"};
    String [] item2 = {"Male","Female ","Transgender"};

    AutoCompleteTextView autoCompleteTextView,autoCompleteTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_please_select_gender);

        ArrayAdapter<String> adapterItem;
        ArrayAdapter<String> adapterItem2;

        autoCompleteTextView=findViewById(R.id.selectgender);
        autoCompleteTextView2=findViewById(R.id.selectsexualidentity);

        adapterItem=new ArrayAdapter<String>(this,R.layout.dropdownitem,item);
        adapterItem2=new ArrayAdapter<String>(this,R.layout.dropdownitem,item2);

        autoCompleteTextView.setAdapter(adapterItem);
        autoCompleteTextView2.setAdapter(adapterItem2);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(PleaseSelectGender.this, "Item: "+ item, Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(PleaseSelectGender.this, "Item2: "+ item, Toast.LENGTH_SHORT).show();
            }
        });


    }
}