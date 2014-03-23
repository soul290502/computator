package com.example.layout_management;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Layout_test extends Activity {

	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPLus,bMinus,bEqual,clear;
	private EditText edittext;
	private TextView textview;
	String[] array = new String[50];
	int b=0,secnumpart=0,newtatle=0;
	double j=0;
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
        	setbuttonShow("0");
            break;
        case R.id.b1:
        	setbuttonShow("1");
        	storeNum("num","1");//have some problem with this
        	
            break;
        case R.id.b2:
        	setbuttonShow("2");
        	storeNum("num","2");
            break;
        case R.id.b3:
        	setbuttonShow("3");
            break;
        case R.id.b4:
        	setbuttonShow("4");
            break;
        case R.id.b5:
        	setbuttonShow("5");
            break;
        case R.id.b6:
        	setbuttonShow("6");
            break;
        case R.id.b7:
        	setbuttonShow("7");
        	textview.setText(String.valueOf(b));
            break;
        case R.id.b8:
        	setbuttonShow("8");
            break;
        case R.id.b9:
        	setbuttonShow("9");
            break;
        case R.id.bEqul:
        	setbuttonShow("=");
            break;
        case R.id.bMinus:
        	setbuttonShow("-");
            break;
        case R.id.bPlus:
        	setbuttonShow("+");
            break;
        case R.id.bmultiple:
        	setbuttonShow("*");
            break;
        case R.id.bdivide:
        	setbuttonShow("/");
        	storeNum("num","/");
            break;
        case R.id.bPoint:
        	setbuttonShow(".");
            break;
    	}

	}

    public static boolean isNumeric(String str)  
    {  
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }
    
    public void storeNum(String a,String i) {
    	array[b]=i;
    	textview.setText(array[b]);
    	b+=1;
    	if (!isNumeric(i)){
    		operatorstor();
    	}		
	}

    private void operatorstor(){
    	j = array.length-1;	
		for (int i = 0; i < array.length-1; i++) {
			int val = Integer.parseInt("1234");
//			double val=Double.valueOf(array[i]).doubleValue(); 
//			newtatle+=val*Math.pow(10,1);		
//			 int l = Integer.valueOf(array[i]).intValue(); 
//			j-=1;
			textview.setText(String.valueOf(val));//this way to switch the type is ok~~!!!
		};
		    }
	private void clearClick() {
		// TODO Auto-generated method stub
		
	}


	private void equalClick() {
		for (int j = 0; j < array.length; j++) {
			if (isNumeric(array[j])){
				
			}
		}
		
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
