package com.example.lab11;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView; // Import from androidx

import com.bumptech.glide.Glide;
import com.example.lab11.model.MyChat;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MyChat> values;
    private Context context;

    public MyAdapter(List<MyChat> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder { // Extend ViewHolder from androidx
        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter,txtThirdLine;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = v.findViewById(R.id.icon);
            txtHeader = v.findViewById(R.id.firstLine);
            txtFooter = v.findViewById(R.id.secondLine);
            txtThirdLine= v.findViewById(R.id.thirdline);

        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final MyChat chat = values.get(position);
        holder.txtHeader.setText(chat.getFriend_name());
        holder.txtFooter.setText("เบอร์:" + chat.getFriend_tel());
        holder.txtThirdLine.setText("กดที่รูปเพื่อดูรายละเอียด");
        Glide.with(context)
                .load(chat.getFriend_image())
                .into(holder.imgView);

        holder.imgView.setOnClickListener(v -> {
            Intent intent = new Intent(context, detail.class);
            intent.putExtra("name", chat.getFriend_name());
            intent.putExtra("img", chat.getFriend_image());
            intent.putExtra("tel", chat.getFriend_tel());
            intent.putExtra("dob", chat.getFriend_dob());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}