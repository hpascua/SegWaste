package org.ap6.segwaste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PickupActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView dateString, collection, areaString;
    private CardView book, details;
    private String collectionDay = "Friday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);


        calendarView = findViewById(R.id.calendar_view);

        dateString = findViewById(R.id.date_string);
        collection = findViewById(R.id.collection);
        areaString = findViewById(R.id.area_string);
        book = findViewById(R.id.book);
        details = findViewById(R.id.details);

        String dateText = new SimpleDateFormat("MMMM dd, yyyy").format(new Date(calendarView.getDate()));

        dateString.setText(dateText);

        String dayOfWeek = new SimpleDateFormat("EEEE").format(new Date(calendarView.getDate()));

        if (dayOfWeek.equals(collectionDay)){
            collection.setText("MRF Collection");
            collection.setTextSize(36);
            areaString.setText("Diliman, Quezon City");
            book.setEnabled(true);
            details.setEnabled(true);
        }
        else{
            collection.setText("No collection on this day");
            collection.setTextSize(24);
            areaString.setText("");
            book.setEnabled(false);
            details.setEnabled(false);
        }

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String dateText = new SimpleDateFormat("MMMM dd, yyyy").format(new Date(year-1900, month, dayOfMonth));
                dateString.setText(dateText);

                String dayOfWeek = new SimpleDateFormat("EEEE").format(new Date(year-1900, month, dayOfMonth));

                if (dayOfWeek.equals(collectionDay)){
                    collection.setText("MRF Collection");
                    collection.setTextSize(36);
                    areaString.setText("Diliman, Quezon City");
                    book.setEnabled(true);
                    details.setEnabled(true);
                }
                else{
                    collection.setText("No collection on this day");
                    collection.setTextSize(24);
                    areaString.setText("");
                    book.setEnabled(false);
                    details.setEnabled(false);
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void goBack(View view) {
        finish();
    }
}