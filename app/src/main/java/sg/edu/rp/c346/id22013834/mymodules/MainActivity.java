package sg.edu.rp.c346.id22013834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Module Code", "C218");
                intent.putExtra("Module Name", "UI/UX Design");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Module Code", "C203");
                intent.putExtra("Module Name", "HTML/PHP Programming");
                intent.putExtra("Academic Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });
    }
}
