package amilosevic.ferit.beermap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity{

    private String BeerName;
    private String BeerHistory;
    private String BeerDescription;

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private TabItem tabOne, tabTwo;
    public PageAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BeerName = getIntent().getStringExtra("Title");
        BeerHistory = getIntent().getStringExtra("History");
        BeerDescription = getIntent().getStringExtra("Description");
        setTitle(BeerName);

        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tabLayout);
        tabOne = findViewById(R.id.tab_History);
        tabTwo = findViewById(R.id.tab_Description);
        viewpager = findViewById(R.id.viewPager);

        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), BeerHistory, BeerDescription);
        viewpager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                else if(tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    public String getBeerHistory(){
        return this.BeerHistory;
    }

}