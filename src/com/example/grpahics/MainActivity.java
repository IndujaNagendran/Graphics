package com.example.grpahics;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	
	
	EditText ed,ed1,ed2,ed3;
	Button r,c,s,t;
	String sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ed=(EditText) findViewById(R.id.ed);
        ed1=(EditText) findViewById(R.id.ed2);
        ed2=(EditText) findViewById(R.id.l);
        ed3=(EditText) findViewById(R.id.b);
        r=(Button) findViewById(R.id.b1);
        c=(Button) findViewById(R.id.b2);
        s=(Button) findViewById(R.id.b3);
        t=(Button) findViewById(R.id.b4);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="RECTANGLE";
            	String data1=ed.getText().toString();
            	String data2=ed1.getText().toString();
            	String data3=ed2.getText().toString();
            	String data4=ed3.getText().toString();
            	
            
            	Intent i=new Intent(MainActivity.this,sec_Activity.class);
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="CIRCLE";
            	String data1=ed.getText().toString();
            	String data2=ed1.getText().toString();
            	String data3=ed2.getText().toString();
            	String data4=ed3.getText().toString();
            	Intent i=new Intent(MainActivity.this,sec_Activity.class);
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="SQUARE";
            	String data1=ed.getText().toString();
            	String data2=ed1.getText().toString();
            	String data3=ed2.getText().toString();
            	String data4=ed3.getText().toString();
            	Intent i=new Intent(MainActivity.this,sec_Activity.class);
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="TRIANGLE";
            	String data1=ed.getText().toString();
            	String data2=ed1.getText().toString();
            	String data3=ed2.getText().toString();
            	String data4=ed3.getText().toString();
            	Intent i=new Intent(MainActivity.this,sec_Activity.class);
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }
        });
    }

   
    
}
