package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView mListItemNumberView;

    NumberViewHolder(View itemView) {
        super(itemView);
        mListItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
    }

    void bind(int listIndex) {
        mListItemNumberView.setText(String.valueOf(listIndex));
    }
}
