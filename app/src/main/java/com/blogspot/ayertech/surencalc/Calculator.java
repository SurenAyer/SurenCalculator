package com.blogspot.ayertech.surencalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    private Button btnadd,btnSub,btnMul,btndivide;
    private TextView tvresult;
    private EditText etFirst,etSecond;

                                                                    //Alt+Enter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        init();
    }
    private void init()
    {
        btnadd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSubtract);
        btnMul=(Button)findViewById(R.id.btnMultiply);
        btndivide=(Button)findViewById(R.id.btnDivide);
        etFirst=(EditText)findViewById(R.id.etFirstNumber);
        etSecond=(EditText)findViewById(R.id.etSecondNumber);
        tvresult=(TextView)findViewById(R.id.tvResult);

        btnadd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btndivide.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String num1=etFirst.getText().toString();
        String num2=etSecond.getText().toString();
        switch(view.getId())
        {
            case R.id.btnAdd:
                 int addition=Integer.parseInt(num1)+Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction=Integer.parseInt(num1)-Integer.parseInt(num2);
                tvresult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                int multiply=Integer.parseInt(num1)*Integer.parseInt(num2);
                tvresult.setText(String.valueOf(multiply));
                break;
            case R.id.btnDivide:
                try {
                    float division =(float)1.0*Integer.parseInt(num1)/Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e)
                {
                    tvresult.setText(String.valueOf("DIVIDE BY 0 ERROR!!"));
                }
                    break;

        }



    }
}