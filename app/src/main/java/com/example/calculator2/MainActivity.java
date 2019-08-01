package com.example.calculator2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class MainActivity extends AppCompatActivity {
    public MainActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //declaring our widget
        //banner text
        final TextView text_view_result_my_calc = findViewById(R.id.calculator2);
        //result box
        final EditText edit_text_result_my_calc = findViewById(R.id.edit_text_result_my_calc);
        //buttons numbers
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);
        Button num0 = findViewById(R.id.num0);

        // Buttons for calculation
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multip = findViewById(R.id.multip);
        Button div = findViewById(R.id.btn_div);
        Button equal = findViewById(R.id.equal);

        // Button extra
        Button comma = findViewById(R.id.comma);
        Button clear = findViewById(R.id.clear);


        //add
        final EditText et_number_one = findViewById(R.id.et_number_one);
        final EditText et_number_two = findViewById(R.id.et_number_two);

        //sub
        final EditText et_number_Sub1 = findViewById(R.id.et_number_Sub1);
        final EditText et_number_Sub2 = findViewById(R.id.et_number_sub2);

        //multi
        final EditText et_number_multi1 = findViewById(R.id.et_number_multi1);
        final EditText et_number_multi2 = findViewById(R.id.et_number_multi2);

        //Div
        final EditText et_number_div1 = findViewById(R.id.et_number_div1);
        final EditText et_number_div2 = findViewById(R.id.et_number_div2);

    }


}





