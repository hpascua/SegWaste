package org.ap6.segwaste;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import org.ap6.segwaste.fragments.*;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottomNav);

        Fragment homeFragment = new HomeFragment();
        Fragment wasteTrackerFragment = new WasteTrackerFragment();
        Fragment wastedFragment = new WastEdFragment();
        Fragment waysteFragment = new WAYsteFragment();

        makeCurrentFragment(homeFragment);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        makeCurrentFragment(homeFragment);
                        return true;
                    case R.id.ic_tracker:
                        makeCurrentFragment(wasteTrackerFragment);
                        return true;
                    case R.id.ic_wasted:
                        makeCurrentFragment(wastedFragment);
                        return true;
                    case R.id.ic_wayste:
                        makeCurrentFragment(waysteFragment);
                        return true;
                }
                return false;
            }
        });

    }

    // Changes the fragment currently being shown
    private void makeCurrentFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_wrapper, fragment).commit();
    }

    /* Opens the prototype version of the WasteID Activity (to see how the image recognition
        works, replace WasteIDProtoActivity.class with WasteIDActivity.class)*/
    public void openWasteID(View view){
        Intent intent = new Intent(this, WasteIDProtoActivity.class);
        startActivity(intent);
    }

    public void openProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}