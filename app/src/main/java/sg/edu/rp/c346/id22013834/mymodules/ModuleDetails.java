package sg.edu.rp.c346.id22013834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {
    TextView tvShow;
    TextView tvShow2;
    TextView tvShow3;
    TextView tvShow4;
    TextView tvShow5;
    TextView tvShow6;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvShow =findViewById(R.id.textViewModCode);
        tvShow2 =findViewById(R.id.textViewModName);
        tvShow3 =findViewById(R.id.textViewAcadY);
        tvShow4 =findViewById(R.id.textViewSem);
        tvShow5 =findViewById(R.id.textViewModCred);
        tvShow6 =findViewById(R.id.textViewVenue);
        backbtn =findViewById(R.id.backbtn);
        Intent intentReceived = getIntent();

        String ModCode = intentReceived.getStringExtra("Module Code");
        tvShow.setText("Module Code: " +ModCode);

        String ModName = intentReceived.getStringExtra("Module Name");
        tvShow2.setText("Module Name: " + ModName);

        String ModYear = intentReceived.getStringExtra("Academic Year");
        tvShow3.setText("Module Year: " + ModYear);

        String Sem = intentReceived.getStringExtra("Semester");
        tvShow4.setText("Semester " + Sem);

        String ModCred = intentReceived.getStringExtra("Module Credit");
        tvShow5.setText("Module Credit: " + ModCred);

        String Venue = intentReceived.getStringExtra("Venue");
        tvShow6.setText("Venue: " + Venue);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(ModuleDetails.this, MainActivity.class));
            }
        });
    }
}