package amilosevic.ferit.beermap;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    String beerHistory;
    String beerDescription;
    private int numberOfTabs;

    public PageAdapter(@NonNull FragmentManager fm, int numberoftabs, String BeerHistory, String BeerDescription) {
        super(fm);
        this.numberOfTabs = numberoftabs;
        this.beerHistory = BeerHistory;
        this.beerDescription = BeerDescription;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                tabOne tabone = new tabOne();
                Bundle bundle = new Bundle();
                bundle.putString("History", beerHistory);
                tabone.setArguments(bundle);

                return tabone;
            default:
                tabTwo tabtwo = new tabTwo();
                bundle = new Bundle();
                bundle.putString("Description", beerDescription);
                tabtwo.setArguments(bundle);

                return tabtwo;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}