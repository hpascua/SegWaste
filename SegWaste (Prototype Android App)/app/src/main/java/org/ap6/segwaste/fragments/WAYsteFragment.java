package org.ap6.segwaste.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ap6.segwaste.MRFActivity;
import org.ap6.segwaste.PartnerEstActivity;
import org.ap6.segwaste.PickupActivity;
import org.ap6.segwaste.R;
import org.ap6.segwaste.WebViewActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WAYsteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WAYsteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WAYsteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WAYsteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WAYsteFragment newInstance(String param1, String param2) {
        WAYsteFragment fragment = new WAYsteFragment();
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

        View root = inflater.inflate(R.layout.fragment_wayste, container, false);

        CardView card_est, card_pickup, card_mrf;

        card_est = root.findViewById(R.id.card_est);
        card_pickup = root.findViewById(R.id.card_pickup);
        card_mrf = root.findViewById(R.id.card_mrf);

        card_est.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PartnerEstActivity.class);
                startActivity(intent);
            }
        });

        card_pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PickupActivity.class);
                startActivity(intent);
            }
        });

        card_mrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MRFActivity.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return root;
    }
}