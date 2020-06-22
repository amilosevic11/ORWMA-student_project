package amilosevic.ferit.beermap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class tabTwo extends Fragment {
    private TextView tv_FragmentDescription;
    private String beerDescription;

    public tabTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_two, container, false);

        tv_FragmentDescription = view.findViewById(R.id.tv_tabOne_Description);

        Bundle bundle = getArguments();
        beerDescription = bundle.getString("Description");

        tv_FragmentDescription.setText(beerDescription);

        return view;
    }
}