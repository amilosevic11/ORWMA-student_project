package amilosevic.ferit.beermap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private List<String> titleList = new ArrayList<>();
    private List<String> historyList = new ArrayList<>();
    private List<String> descriptionList = new ArrayList<>();
    private NameClickListener clickListener;

    public RecyclerAdapter(NameClickListener listener){
        this.clickListener = listener;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cellView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new NameViewHolder(cellView, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int position) {
        nameViewHolder.setTitle(titleList.get(position));
        nameViewHolder.setHistory(historyList.get(position));

    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    public String fetchTitle(int position){
        return this.titleList.get(position);
    }

    public String fetchHistory(int position){
        return this.historyList.get(position);
    }

    public void addData(List<String> titles, List<String> histories, List<String> descriptions){
        this.titleList.clear();
        this.historyList.clear();
        this.descriptionList.clear();

        this.titleList.addAll(titles);
        this.historyList.addAll(histories);
        this.descriptionList.addAll(descriptions);

        notifyDataSetChanged();
    }

}