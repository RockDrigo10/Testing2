package com.example.admin.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_RESULT = "KEY_FOR_RESULT";
    @BindView(R.id.etText)
    EditText etText;
    @BindView(R.id.etText2)
    EditText etText2;
    @BindView(R.id.tvText)
    TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnAddition, R.id.btnSubtraction, R.id.btnMultiplication, R.id.btnDivision})
    public void doCalculations(View view) {
        int num1 = Integer.parseInt(etText.getText().toString());
        int num2 = Integer.parseInt(etText2.getText().toString());
        int result = 0;
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Calculation calculation = new Calculation(addition,subtraction,multiplication,division);
        calculation.setVal1(num1);
        calculation.setVal2(num2);
        switch (view.getId()) {
            case R.id.btnAddition:
                result = calculation.add();
                break;
            case R.id.btnSubtraction:
                result = calculation.subtract();
                break;
            case R.id.btnMultiplication:
                result = calculation.multiply();
                break;
            case R.id.btnDivision:
                result = calculation.divide();
                break;
        }
        tvText.setText(String.valueOf(result));
    }

    public void goToSecond(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra(KEY_RESULT, tvText.getText().toString());
        startActivity(intent);
    }
}
