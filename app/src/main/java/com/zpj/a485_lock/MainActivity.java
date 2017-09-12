package com.zpj.a485_lock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<String> list = new ArrayList<String>();
    private List<String> list1 = new ArrayList<String>();

    private TextView myTextView;
    private Spinner mySpinner;

    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapter1;


    private TextView myTextView1;
    private Spinner mySpinner1;

    private EditText editText;
    private Button   button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一步：添加一个下拉列表项的list，这里添加的项就是下拉列表的菜单项
        list.add("clock1");
        list.add("clock2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        list.add("16");
        list.add("17");
        list.add("18");
        list.add("19");
        list.add("20");
        list.add("21");
        list.add("22");
        list.add("23");
        list.add("24");
        list.add("25");
        list.add("26");
        list.add("27");
        list.add("28");
        list.add("29");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("37");
        list.add("38");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("43");
        list.add("44");
        list.add("45");
        list.add("46");
/*
        list1.add("clock1");
        list1.add("clock2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("10");
        list1.add("11");
        list1.add("12");
        list1.add("13");
        list1.add("14");
        list1.add("15");
        list1.add("16");
        list1.add("17");
        list1.add("18");
        list1.add("19");
        list1.add("20");
        list1.add("21");
        list1.add("22");
        list1.add("23");
        list1.add("24");*/

        list1.add("/dev/ttyGS3");
        list1.add("/dev/ttyGS2");
        list1.add("/dev/ttyGS1");
        list1.add("/dev/ttyGS0");
        list1.add("/dev/ttymxc6");
        list1.add("/dev/ttymxc5");
        list1.add("/dev/ttymxc4");
        list1.add("/dev/ttymxc3");
        list1.add("/dev/ttymxc2");
        list1.add("/dev/ttymxc1");
        list1.add("/dev/ttymxc0");

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);



        myTextView = (TextView)findViewById(R.id.textView);
        mySpinner = (Spinner)findViewById(R.id.Spinner_city);

        myTextView1 = (TextView)findViewById(R.id.textView5);
        mySpinner1 = (Spinner)findViewById(R.id.Spinner_city1);

        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);

        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //第四步：将适配器添加到下拉列表上
        mySpinner.setAdapter(adapter);
        mySpinner1.setAdapter(adapter1);

        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                myTextView.setText("您选择的板号是："+ adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                myTextView.setText("NONE");
                arg0.setVisibility(View.VISIBLE);
            }
        });

        mySpinner1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                myTextView1.setText("您选择的串口是："+ adapter1.getItem(arg2));
                /* 将mySpinner 显示*/
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                myTextView1.setText("NONE");
                arg0.setVisibility(View.VISIBLE);
            }
        });
//        myTextView = (TextView)findViewById(R.id.textView);
//        mySpinner = (Spinner)findViewById(R.id.Spinner_city);


    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();;
                break;
            default:
                break;
        }
    }
}
