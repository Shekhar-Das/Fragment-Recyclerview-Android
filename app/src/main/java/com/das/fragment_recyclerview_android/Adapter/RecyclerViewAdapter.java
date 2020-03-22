package com.das.fragment_recyclerview_android.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.das.fragment_recyclerview_android.Model.Contact;
import com.das.fragment_recyclerview_android.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;
    Dialog myDilaog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        // Dialog init
        myDilaog = new Dialog(mContext);
        myDilaog.setContentView(R.layout.dialog_contact);
        myDilaog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        viewHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = (TextView) myDilaog.findViewById(R.id.dialog_contact_name);
                TextView dialog_phone = (TextView) myDilaog.findViewById(R.id.dialog_contact_number);
                ImageView dialog_contact = (ImageView) myDilaog.findViewById(R.id.dialog_contact_image);

                //get text to the dilog
                dialog_name.setText(mData.get(viewHolder.getAdapterPosition()).getName());
                dialog_phone.setText(mData.get(viewHolder.getAdapterPosition()).getPhone());
                dialog_contact.setImageResource(mData.get(viewHolder.getAdapterPosition()).getPhoto());
                Toast.makeText(mContext, "Text Click" + String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                myDilaog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_Name.setText(mData.get(position).getName());
        holder.tv_Phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout item_contact;
        private TextView tv_Name;
        private TextView tv_Phone;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact = (LinearLayout) itemView.findViewById(R.id.contact_item_id);
            tv_Name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_Phone = (TextView) itemView.findViewById(R.id.phone_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contact);

        }
    }
}
