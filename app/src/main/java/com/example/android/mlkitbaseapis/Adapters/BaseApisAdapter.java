package com.example.android.mlkitbaseapis.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.android.mlkitbaseapis.R;

import java.util.ArrayList;

public class BaseApisAdapter extends BaseAdapter {

    private ArrayList<Integer>imageIds;
    private Context context;

    public BaseApisAdapter(ArrayList<Integer> imageIds, Context context) {
        this.imageIds = imageIds;
        this.context = context;
    }

    @Override
    public int getCount() {
        return imageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return imageIds.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView;
        if (view == null){
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.base_api_list,viewGroup,false);
            imageView = view.findViewById(R.id.list_image);
        }else{
            imageView = (ImageView) view.getTag();
        }

        int imageId = imageIds.get(i);
        imageView.setImageResource(imageId);
        return imageView;
    }
}
