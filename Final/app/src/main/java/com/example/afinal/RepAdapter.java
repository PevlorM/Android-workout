package com.example.afinal;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class RepAdapter extends ArrayAdapter<RepItem> {
    public RepAdapter(Context context, ArrayList<RepItem> repList) {
        super(context, 0, repList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }
    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.repition_spinner_row, parent, false
            );
        }
        ImageView imageViewRep = convertView.findViewById(R.id.image_view_rep);
        TextView textViewNameRep = convertView.findViewById(R.id.text_view_name_rep);
        RepItem currentItem = getItem(position);
        if (currentItem != null) {
            imageViewRep.setImageResource(currentItem.getRepImage());
            textViewNameRep.setText(currentItem.getrepName());
        }
        return convertView;
    }
}