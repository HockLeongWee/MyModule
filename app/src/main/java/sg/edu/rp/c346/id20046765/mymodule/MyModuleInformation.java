package sg.edu.rp.c346.id20046765.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyModuleInformation extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_module_information);



        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSemester = findViewById(R.id.tvSemester);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);

            Intent intentReceived = getIntent();
            String Code = intentReceived.getStringExtra("Code");
            String Name = intentReceived.getStringExtra("Name");
            int Year = intentReceived.getIntExtra("Year", 2020);
            int Semester = intentReceived.getIntExtra("Semester", 1);
            int Credit = intentReceived.getIntExtra("Credit", 0);
            String Venue = intentReceived.getStringExtra("Venue");

        tvCode.setText("Module Code: " + Code);
        tvName.setText("Module Name: " + Name);
        tvYear.setText("Academic Year: " + Year);
        tvSemester.setText("Semester: " + Semester);
        tvCredit.setText("Module Credit: " + Credit);
        tvVenue.setText("Venue: " + Venue);

    }
}