package org.ap6.segwaste.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.ap6.segwaste.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WasteTrackerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WasteTrackerFragment extends Fragment {

    private ToggleButton toggle;
    private TextView num1, num2, date;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WasteTrackerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WasteTrackerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WasteTrackerFragment newInstance(String param1, String param2) {
        WasteTrackerFragment fragment = new WasteTrackerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_waste_tracker, container, false);
        toggle = root.findViewById(R.id.toggleButton);

        num1 = root.findViewById(R.id.num1);
        num2 = root.findViewById(R.id.num2);
        date = root.findViewById(R.id.date);

        if (!toggle.isChecked()){

            num1.setText("5 kg");
            num2.setText("14 kg");
            date.setText("March 2021");
        }
        else{
            num1.setText("25 kg");
            num2.setText("30 kg");
            date.setText("2021");
        }

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked){
                    num1.setText("5 kg");
                    num2.setText("14 kg");
                    date.setText("March 2021");
                }
                else{
                    num1.setText("25 kg");
                    num2.setText("30 kg");
                    date.setText("2021");
                }
            }
        });

        // Inflate the layout for this fragment
        return root;
    }
}