/*
package com.example.grpahics;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
*/





package com.example.grpahics;  

import android.support.v7.app.ActionBarActivity;  
import android.os.Bundle;  
import android.app.Activity;  
import android.view.Menu;  
import android.content.Context;  
import android.graphics.Canvas;  
import android.graphics.Color;  
import android.graphics.Paint;  
import android.view.View;  
import android.widget.Button;
  
public class MainActivity extends ActionBarActivity {  
  
	Button line,Arc,Rectangle,Square,Circle,Oval;
     
   
    /** Called when the activity is first created. */  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);    
        setContentView(R.layout.activity_main);
        line=(Button) findViewById(R.id.li);
        Arc=(Button) findViewById(R.id.ar);
        Rectangle=(Button) findViewById(R.id.re);
        Square=(Button) findViewById(R.id.sq);
        Circle=(Button) findViewById(R.id.ci);
        Oval=(Button) findViewById(R.id.ov);
        
        line.setOnClickListener(new View.OnClickListener() 
        {
        			
			protected void onDraw(Canvas canvas)   
			{ 
				
				Paint line = new Paint();
				line.setStyle(Paint.Style.FILL);
				
			            
					  
			            // custom drawing code here  
			            Paint paint = new Paint();  
			            paint.setStyle(Paint.Style.FILL);  
			  
			            // make the entire canvas white  
			            paint.setColor(Color.WHITE);  
			            canvas.drawPaint(paint);  
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }  
}
/*
        @Override protected void onDraw(Canvas canvas) {  
            
  
            // custom drawing code here  
            Paint paint = new Paint();  
            paint.setStyle(Paint.Style.FILL);  
  
            // make the entire canvas white  
            paint.setColor(Color.WHITE);  
            canvas.drawPaint(paint);  
            
            // draw blue circle with anti aliasing turned off  
            paint.setAntiAlias(false);  
            paint.setColor(Color.BLUE);  
            canvas.drawCircle(20, 20, 15, paint);  
  
            // draw green circle with anti aliasing turned on  
            paint.setAntiAlias(true);  
            paint.setColor(Color.GREEN);  
            canvas.drawCircle(60, 20, 15, paint);  
  
            // draw red rectangle with anti aliasing turned off  
            
            paint.setAntiAlias(false);  
            paint.setColor(Color.RED);  
            canvas.drawRect(100, 5, 200, 30, paint);  
                                         
            //undo the rotate  
            canvas.restore();  
        }  
    }  
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.main, menu);  
        return true;  
    }  
}  
     */