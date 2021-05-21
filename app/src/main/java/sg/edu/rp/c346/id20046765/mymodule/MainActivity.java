package sg.edu.rp.c346.id20046765.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346;
    TextView C349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.C346);
        C349 = findViewById(R.id.C349);

        C346.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MyModuleInformation.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        C349.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MyModuleInformation.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W67L");


                startActivity(intent);
            }
        });



    }
}