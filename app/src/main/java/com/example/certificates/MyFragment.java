package com.example.certificates;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        return inflater.inflate(R.layout.frame_message,container);
    }

    public void onActivityCreated(Bundle savedInstance) {
        super.onActivityCreated(savedInstance);
        TextView tv = (TextView)getView().findViewById(R.id.messTextView1);
        tv.setText("这是信息页面");
    }
}

