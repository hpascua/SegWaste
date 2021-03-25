package org.ap6.segwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WasteIDProtoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste_id_proto);
    }

    public void openResults(View view){
        Intent intent = new Intent(this, WasteIDResultsActivity.class);
        startActivity(intent);
    }

    public void goBack(View view){
        finish();
    }
}