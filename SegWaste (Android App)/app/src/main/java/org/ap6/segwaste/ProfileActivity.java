package org.ap6.segwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    ImageView editIcon;
    EditText name, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);

        name.setEnabled(false);
        address.setEnabled(false);

        editIcon = findViewById(R.id.edit_icon);
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableEdit();
            }
        });
    }

    public void enableEdit(){
        name.setEnabled(true);
        address.setEnabled(true);

        editIcon.setImageDrawable(getDrawable(R.drawable.ic_check));
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableEdit();
            }
        });
    }

    public void disableEdit(){
        name.setEnabled(false);
        address.setEnabled(false);

        editIcon.setImageDrawable(getDrawable(R.drawable.ic_edit));
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableEdit();
            }
        });
    }

    public void goBack(View view) {
        finish();
    }

    public void goToVouchers(View view){
        Intent intent = new Intent(this, VoucherActivity.class);
        startActivity(intent);
    }

    public void goToQR(View view) {
        Intent intent = new Intent(this, QRActivity.class);
        startActivity(intent);
    }
}