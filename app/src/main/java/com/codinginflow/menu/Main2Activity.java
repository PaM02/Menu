package com.codinginflow.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final RadioButton radioButton =findViewById(R.id.radioButton);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton.isSelected()){
                    radioButton.setChecked(false);
                    radioButton.setSelected(false);
                }
                else{
                    radioButton.setChecked(true);
                    radioButton.setSelected(true);
                }

            }
        });

    }
}
