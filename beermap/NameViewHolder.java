package amilosevic.ferit.beermap;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private ImageView ivCardImage;
    private TextView tvCardTitle;
    private TextView tvCardHistory;
    private NameClickListener clickListener;


    public NameViewHolder(@NonNull View itemView, NameClickListener listener) {
        super(itemView);
        ivCardImage = itemView.findViewById(R.id.iv_cardImage);
        tvCardTitle = itemView.findViewById(R.id.tv_CardTitle);
        tvCardHistory = itemView.findViewById(R.id.tv_CardHistory);

        this.clickListener = listener;
        itemView.setOnClickListener(this);
    }

    public void setTitle(String title){
        tvCardTitle.setText(title);
    }

    public void setHistory(String history){
        tvCardHistory.setText(history);
    }

    @Override
    public void onClick(View view) {
        clickListener.onNameClick(getAdapterPosition());
    }
}