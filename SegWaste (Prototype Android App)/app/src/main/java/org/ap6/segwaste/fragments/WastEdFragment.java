package org.ap6.segwaste.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ap6.segwaste.R;
import org.ap6.segwaste.WebViewActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WastEdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WastEdFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WastEdFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WastEdFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WastEdFragment newInstance(String param1, String param2) {
        WastEdFragment fragment = new WastEdFragment();
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
        View root = inflater.inflate(R.layout.fragment_wasted, container, false);

        CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;

        card1 = root.findViewById(R.id.card1);
        card2 = root.findViewById(R.id.card2);
        card3 = root.findViewById(R.id.card3);
        card4 = root.findViewById(R.id.card4);
        card5 = root.findViewById(R.id.card5);
        card6 = root.findViewById(R.id.card6);
        card7 = root.findViewById(R.id.card7);
        card8 = root.findViewById(R.id.card8);
        card9 = root.findViewById(R.id.card9);
        card10 = root.findViewById(R.id.card10);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://www.epa.gov/recycle/recycling-basics");
                intent.putExtra("article", "Recycling Basics");
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://www.conserve-energy-future.com/importance_of_recycling.php");
                intent.putExtra("article", "Importance of Recycling");
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://theconversation.com/think-all-your-plastic-is-being-recycled-new-research-shows-it-can-end-up-in-the-ocean-155208");
                intent.putExtra("article", "Think all your plastic is being recycled? New research shows it can end up in the ocean");
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://theconversation.com/covid-19-costs-could-push-hospitals-to-rethink-billions-of-dollars-in-wasted-supplies-154328");
                intent.putExtra("article", "COVID-19 costs could push hospitals to rethink billions of dollars in wasted supplies");
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://theconversation.com/a-type-of-biodegradable-plastic-will-soon-be-phased-out-in-australia-thats-a-big-win-for-the-environment-156566");
                intent.putExtra("article", "A type of ‘biodegradable’ plastic will soon be phased out in Australia. That’s a big win for the environment");
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://theconversation.com/how-to-turn-plastic-waste-in-your-recycle-bin-into-profit-147081");
                intent.putExtra("article", "How to turn plastic waste in your recycle bin into profit");
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://drive.google.com/file/d/1cq-VnJ3EQZfZleOYlImUwhiSvmuymrJq/view?usp=sharing");
                intent.putExtra("article", "Recycling: the Good, the Better, the Best");
                startActivity(intent);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://drive.google.com/file/d/1q4pJRX6DhsTvR5Sukjw_uiKBP37z7_wK/view?usp=sharing");
                intent.putExtra("article", "Plastic Waste Footprint");
                startActivity(intent);
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://drive.google.com/file/d/1yfvV_bq5aLbeHcwuSAwm2flxf5EIMZb0/view?usp=sharing");
                intent.putExtra("article", "How can packaging reduce food waste?");
                startActivity(intent);
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("uri", "https://drive.google.com/file/d/1htX1yAyvFTnD1coJOgqiGl-ZRy6cIzJJ/view?usp=sharing");
                intent.putExtra("article", "Recycle Waste Materials Into New Products");
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return root;
    }
}