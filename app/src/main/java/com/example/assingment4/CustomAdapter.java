package com.example.assingment4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private List<ProgrammingLanguage> programmingLanguages;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<ProgrammingLanguage> programmingLanguages) {
        this.context = context;
        this.programmingLanguages = programmingLanguages;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return programmingLanguages.size();
    }

    @Override
    public Object getItem(int position) {
        return programmingLanguages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        ImageView imageView1 = convertView.findViewById(R.id.imageView1);
        ImageView imageView2 = convertView.findViewById(R.id.imageView2);
        ImageView imageView3 = convertView.findViewById(R.id.imageView3);
        ImageView imageView4 = convertView.findViewById(R.id.imageView4);
        TextView textView = convertView.findViewById(R.id.textView);


        ProgrammingLanguage language = programmingLanguages.get(position);


        imageView1.setImageResource(language.getImage1());
        imageView2.setImageResource(language.getImage2());
        imageView3.setImageResource(language.getImage3());
        imageView4.setImageResource(language.getImage4());


        textView.setText(language.getName());

        return convertView;
    }
}
