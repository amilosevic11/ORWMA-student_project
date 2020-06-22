package amilosevic.ferit.beermap;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Field;

/**
 * A simple {@link Fragment} subclass.
 */
public class tabOne extends Fragment {
    TextView tv_FragmentHistory;
    String beerHistory;

    public tabOne() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_one, container, false);

        tv_FragmentHistory = view.findViewById(R.id.tv_tabOne_History);
        tv_FragmentHistory.setMovementMethod(new ScrollingMovementMethod());

        Bundle bundle = getArguments();
        beerHistory = bundle.getString("History");

        tv_FragmentHistory.setText(beerHistory);

        return view;
    }

}