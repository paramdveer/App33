package com.codewithgoogle.app33;

import android.app.ListActivity;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    String courseNames[]={"Android Developer Couse","iOS Development Course","Java Development Course",
    "Objective-C Development Course","Web Development Course"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new ArrayAdapter<String>(this, R.layout.content_main, courseNames);
        setListAdapter(adapter);
        ListView lstview=getListView();
        lstview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,"the Selected text is"+itemValue,Toast.LENGTH_SHORT).show();
    }
}
