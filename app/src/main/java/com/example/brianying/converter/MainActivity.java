package com.example.brianying.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText2,editText3,editText4,editText5,editText6;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                editText.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                editText5.setText("");
                editText6.setText("");
                }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String EntDec = editText.getText().toString();
                String EntHex = editText2.getText().toString();
                String EntBin = editText3.getText().toString();

                if (EntDec != "") {
                    int Decimal = Integer.parseInt(editText.getText().toString(), 10);
                    editText6.setText(Integer.toBinaryString(Decimal));
                    editText5.setText(Integer.toHexString(Decimal));
                }

                else if(EntHex != "") {
                    int decimal = Integer.parseInt(editText2.getText().toString(), 16);
                    editText6.setText(Integer.toBinaryString(decimal));
                    editText4.setText(Integer.toString(decimal));
                }

                else if (EntBin != "") {
                    int decimal = Integer.parseInt(editText3.getText().toString(), 2);
                    editText5.setText(Integer.toHexString(decimal));
                    editText4.setText(Integer.toString(decimal));
                }
            }
        });

    }
}
