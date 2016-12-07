package com.example.travelfun;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeAdapter extends ArrayAdapter<HomeItem> {

    private int itemId;
    private List<HomeItem> objects;
    private Context context;

    public HomeAdapter(Context context, int resourceId, List<HomeItem> objects) {
        super(context, resourceId, objects);
        this.objects=objects;
        this.context=context;
    }

    private static class ViewHolder
    {
        ImageView imageView;
        TextView title;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public HomeItem getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();
            LayoutInflater mInflater=LayoutInflater.from(context);
            convertView = mInflater.inflate(R.layout.list_item, null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.item_picture);
            viewHolder.title = (TextView) convertView.findViewById(R.id.item_title);
            viewHolder.imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); 
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        HomeItem item = objects.get(position);
        if(null!=item)
        {
            viewHolder.imageView.setImageResource(item.getPicture());
            viewHolder.title.setText(item.getTitle());
        }

        return convertView;
                            
    }

}