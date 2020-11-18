package com.example.user.HealeApps.fragment.disease;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.HealeApps.R;

import java.util.List;

public class diseaseadapter extends ArrayAdapter<disease> {
    List<disease> homeList;

    Context context;

    int resource;

    public diseaseadapter(Context context, int resource, List<disease> homeList){
        super(context, resource, homeList);
        this.context = context;
        this.resource = resource;
        this.homeList = homeList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);


        View view = layoutInflater.inflate(resource, null, false);


        ImageView imageView = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.textTitle);
        TextView desc = view.findViewById(R.id.textDescription);


        disease home = homeList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(home.getImage()));
        title.setText(home.getTitle());
        desc.setText(home.getDesc());

        return view;
    }
}