package sg.edu.rp.c346.id21018193.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}