package com.example.recycleview2youbirds;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
   private itemClickListner itemClickListner;
    private LinearLayout linearLayout;

    public viewHolder(@NonNull  View itemView, itemClickListner itemClickListner)  {
        super(itemView);
        initView(itemView);
        this.itemClickListner= itemClickListner;

    }

    private void initView(View itemView) {
        linearLayout=itemView.findViewById(R.id.linier);
        imageView=itemView.findViewById(R.id.recycleview2);
        textView=itemView.findViewById(R.id.textview);
    }
public void setData(view view){
        imageView.setImageResource(view.getImageView());
        textView.setText(view.getText());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClicked(view);
            }
        });
}

}
