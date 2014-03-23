package com.example.layout_management;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Layout_test extends Activity {

	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPLus,bMinus,bEqual,clear;
	private EditText edittext;
	private TextView textview;
	String[] array = new String[10];
	int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_test);
        
        
        
        findview();
//        buttonClick();
        
        
    }


    private void setbuttonShow(String i){
    	edittext.setText(edittext.getText() + i);
    }
    
    public void numberbuttonClick(View v) {
		// TODO Auto-generated method stub

    	switch (v.getId()) {
        case R.id.b0:
        	
            break;
        case R.id.b1:
        	setbuttonShow("1");
        	storeNum("num","1");//have some problem with this
        	
            break;
        case R.id.b2:
        	setbuttonShow("2");
            break;
        case R.id.b3:
            // do something else
            break;
        case R.id.b4:
            // do something else
            break;
        case R.id.b5:
            // do something else
            break;
        case R.id.b6:
            // do something else
            break;
        case R.id.b7:
            // do something else
            break;
        case R.id.b8:
            // do something else
            break;
        case R.id.b9:
            // do something else
            break;
        case R.id.bEqul:
            // do something else
            break;
        case R.id.bMinus:
            // do something else
            break;
        case R.id.bPlus:
            // do something else
            break;
        case R.id.bPoint:
            // do something else
            break;
    	}

	}
    
    public String[] title = new String[] {
	        
    };
    public void storeNum(String a,String i) {
		// TODO Auto-generated method stub

//        int[] intArray = new int[3];//it can be declar array like this

        array[b]=i;
    	textview.setText(array[b]);
    	b+=1;

    	
	}


	private void clearClick() {
		// TODO Auto-generated method stub
		
	}


	private void equalClick() {
		// TODO Auto-generated method stub
		
	}


	private void findview() {
		// TODO Auto-generated method stub
    	//array=[b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPLus,bMinus,bEqual];
    	b0=(Button) findViewById(R.id.b0);
    	b1=(Button) findViewById(R.id.b1);
    	b2=(Button) findViewById(R.id.b2);
    	b3=(Button) findViewById(R.id.b3);
    	b4=(Button) findViewById(R.id.b4);
    	b5=(Button) findViewById(R.id.b5);
    	b6=(Button) findViewById(R.id.b6);
    	b7=(Button) findViewById(R.id.b7);
    	b8=(Button) findViewById(R.id.b8);
    	b9=(Button) findViewById(R.id.b9);
    	bMinus=(Button) findViewById(R.id.bMinus);
    	bPLus=(Button) findViewById(R.id.bPlus);
    	bEqual=(Button) findViewById(R.id.bEqul);
    	clear=(Button) findViewById(R.id.clear);
    	edittext=(EditText) findViewById(R.id.editText1);
    	textview=(TextView) findViewById(R.id.textView2);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.layout_test, menu);
        return true;
    }
    
}
