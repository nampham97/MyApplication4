package com.example.eunra.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TwosoAdapter extends ArrayAdapter<Twoso>{
    private Context context;
    private int resource;
    private ArrayList<Twoso> objects;

    public TwosoAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Twoso> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    public class viewHolder{
        TextView soa, sob;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        viewHolder vhol =  new viewHolder();
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.cus_layout, parent, false);
            vhol.soa = convertView.findViewById(R.id.tren);
            vhol.sob = convertView.findViewById(R.id.duoi);
            convertView.setTag(vhol);
        }else{
            vhol = (viewHolder) convertView.getTag();
        }

        vhol.soa.setText(objects.get(position).getSoa()+"");
        vhol.sob.setText(objects.get(position).getSob()+"");

        return convertView;
    }
}
