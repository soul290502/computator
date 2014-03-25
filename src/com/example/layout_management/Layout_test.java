package com.example.layout_management;

import com.example.layout_management.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Layout_test extends Activity {

	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPLus,bMinus,bEqual,clear;
	private EditText edittext;
	private TextView textview;
	String[] array = new String[50];
	String[] oparr=new String[5];
	int b=0,secnumpart=0,finalnum=0,newtatle=0;
	int oparrcount=0;
	double j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_test);
        
        
        
        findview();
       clear.setOnClickListener(new OnClickListener() {
			

			public void onClick(View v) {
				// TODO Auto-generated method stub
				b=0;secnumpart=0;finalnum=0;newtatle=0;
				 oparrcount=0;
				 cleararray();
				 for (int i = 0; i < array.length; i++) {
					 oparr[oparrcount]="0";
				}
				 edittext.setText("");
			}
		});
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
        	storeNum("num","3");
            break;
        case R.id.b4:
        	setbuttonShow("4");
        	storeNum("num","4");
            break;
        case R.id.b5:
        	setbuttonShow("5");
        	storeNum("num","5");
            break;
        case R.id.b6:
        	setbuttonShow("6");
        	storeNum("num","6");
            break;
        case R.id.b7:
        	setbuttonShow("7");
        	storeNum("num","7");
            break;
        case R.id.b8:
        	setbuttonShow("8");
        	storeNum("num","8");
            break;
        case R.id.b9:
        	setbuttonShow("9");
        	storeNum("num","9");
            break;
        case R.id.bEqul:
//        	setbuttonShow("=");
        	storeNum("num","15");
        	equalClick() ;
            break;
        case R.id.bMinus:
        	setbuttonShow("-");
        	storeNum("num","12");
            break;
        case R.id.bPlus:
        	setbuttonShow("+");
        	storeNum("num","11");
            break;
        case R.id.bmultiple:
        	setbuttonShow("*");
        	storeNum("num","13");
            break;
        case R.id.bdivide:
        	setbuttonShow("/");
        	storeNum("num","14");
        	
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
    		
//        	
//        	
//        	for (int j = 0; j < b; j++) {
//        		Log.d("de",array[j]);
//			}

    	if (i=="11"||i=="12"||i=="13"||i=="14"||i=="15"){
		
        	operatorstor(i);
        	
    	}		
    	else{
    		array[b]=i;
    		textview.setText(array[b]);
    	}
    	b+=1;
	}

    private void operatorstor(String m){
    	j = b-1;	
    	double val=0;
		for (int i = 0; i < b; i++) {
			val = Integer.parseInt(array[i]);//放array 會錯誤，現在不會錯了，因為陣列不能空陣列
			newtatle+=val*Math.pow(10,j);		
			j-=1;
		};
		cleararray();
		textview.setText(String.valueOf(newtatle));//this way to switch the type is ok~~!!!
		oparr[oparrcount]=m;
		Log.d("secnuum",String.valueOf(secnumpart));
		if(oparrcount!=0){
			if (oparr[oparrcount]=="15") {
				if (oparr[oparrcount-1]=="11") {
					secnumpart+=newtatle;
					Log.d("secnuum",String.valueOf(secnumpart));
				}
				else if (oparr[oparrcount-1]=="12") {
					secnumpart-=newtatle;
					Log.d("secnuum",String.valueOf(secnumpart));
				} 
				else if (oparr[oparrcount-1]=="13") {
					secnumpart*=newtatle;
					Log.d("secnuum",String.valueOf(secnumpart));
				} 
				else if (oparr[oparrcount-1]=="14") {
					secnumpart/=newtatle;
					Log.d("secnuum",String.valueOf(secnumpart));
				} 
			} 
			else if (oparr[oparrcount-1]=="11") {
				secnumpart+=newtatle;
				Log.d("secnuum",String.valueOf(secnumpart));
			}
			else if (oparr[oparrcount-1]=="12") {
				secnumpart-=newtatle;
				Log.d("secnuum",String.valueOf(secnumpart));
			} 
			else if (oparr[oparrcount-1]=="13") {
				secnumpart*=newtatle;
				Log.d("secnuum",String.valueOf(secnumpart));
			} 
			else if (oparr[oparrcount-1]=="14") {
				secnumpart/=newtatle;
				Log.d("secnuum",String.valueOf(secnumpart));
			} 
			
		}
		else	{ secnumpart=newtatle;
		Log.d("secnuum",String.valueOf(secnumpart));
		}
		oparrcount+=1;
		newtatle=0;
	}
		
	private void cleararray() {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			array[i]="0";
		}
	}

	private void clearall(View v){
		 b=0;secnumpart=0;finalnum=0;newtatle=0;
		 oparrcount=0;
		 cleararray();
		 for (int i = 0; i < array.length; i++) {
			 oparr[oparrcount]="0";
		}
		 edittext.setText("");
	}

	private void clearClick() {
		// TODO Auto-generated method stub
		 b=0;secnumpart=0;finalnum=0;newtatle=0;
		 oparrcount=0;
		 cleararray();
		 for (int i = 0; i < array.length; i++) {
			 oparr[oparrcount]="0";
		}
	}


	private void equalClick() {
		textview.setText(String.valueOf(secnumpart));
		edittext.setText(String.valueOf(secnumpart));
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
