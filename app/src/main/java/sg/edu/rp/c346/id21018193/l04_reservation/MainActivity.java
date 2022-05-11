package sg.edu.rp.c346.id21018193.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    TextView tv1;
    TextView tvName;
    TextView tvNo;
    TextView tvPax;
    EditText etName;
    EditText etPhone;
    EditText etPax;
    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        tv1 = findViewById(R.id.tv1);
        tvName = findViewById(R.id.tv2);
        tvNo = findViewById(R.id.tv3);
        tvPax = findViewById(R.id.tv4);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etPax = findViewById(R.id.etPax);
        submit = findViewById(R.id.submit_button);
        reset = findViewById(R.id.reset_button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }
}