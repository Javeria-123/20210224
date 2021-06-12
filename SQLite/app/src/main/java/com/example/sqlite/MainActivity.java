package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd,buttonView;
    EditText editName,editAge;
    Switch switchIsActive;
    ListView listViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd=findViewById(R.id.buttonAdd);
        buttonView=findViewById(R.id.buttonView);
        editName=findViewById(R.id.editName);
        editAge=findViewById(R.id.editAge);
        switchIsActive=findViewById(R.id.SwitchIsActive);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            CustomerModel customerModel;
            @Override
            public void onClick(View v) {

                customerModel=new CustomerModel(editName.getText().toString(),Integer.parseInt(editAge.getText().toString())
                        ,switchIsActive.isChecked(),1);

               Toast.makeText(MainActivity.this,customerModel.toString(),Toast.LENGTH_SHORT).show();

            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Add View clicked",Toast.LENGTH_SHORT).show();

            }
        });
    }
}