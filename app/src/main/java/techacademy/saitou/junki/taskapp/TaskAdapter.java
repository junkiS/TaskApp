package techacademy.saitou.junki.taskapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;
import android.view.LayoutInflater;

/**
 * Created by junki on 2018/06/02.
 */

import java.util.List;

public class TaskAdapter extends BaseAdapter{
    private LayoutInflater mLayoutInflater;
    private List<String> mTaskList;

    public TaskAdapter(Context context){
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setTaskList(List<String> taskList){
        mTaskList = taskList;
    }
    @Override
    public int getCount() { //アイテムの数を返す
        return mTaskList.size();
    }

    @Override
    public Object getItem(int position) {//アイテムを返す
        return mTaskList.get(position);
    }

    @Override
    public long getItemId(int position) {//アイテムのIDを返す
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//Viewを返す。
        if(convertView == null){
            convertView = mLayoutInflater.inflate(android.R.layout.simple_list_item_2,null);
        }
        TextView textView1 = (TextView) convertView.findViewById(android.R.id.text1);
        TextView textView2 = (TextView) convertView.findViewById(android.R.id.text2);

        textView1.setText(mTaskList.get(position));

        return convertView;
    }
}
