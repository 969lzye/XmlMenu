package com.example.xmlmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.test,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem mi){
        super.onOptionsItemSelected(mi);
        textView=(TextView)findViewById(R.id.testtext);
        switch (mi.getItemId()){
            case R.id.font_10:textView.setTextSize(10*2);break;
            case R.id.font_16:textView.setTextSize(16*2);break;
            case R.id.font_20:textView.setTextSize(20*2);break;
            case R.id.customitem: Toast.makeText(MainActivity.this,"这是一个普通菜单项",Toast.LENGTH_LONG).show();break;
            case R.id.color_red:textView.setTextColor(Color.RED);mi.setCheckable(true);break;
            case R.id.color_black:textView.setTextColor(Color.BLACK);mi.setCheckable(true);break;
            default:break;

        }
        return true;
    }
}
