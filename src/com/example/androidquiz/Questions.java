package com.example.androidquiz;

import android.widget.RadioButton;
import android.widget.TextView;



import android.app.Activity;


public class Questions extends Activity{
	RadioButton op1;
	RadioButton op2;
	RadioButton op3;
	RadioButton op4;
	TextView question;
	
	public void round1(){
		 question.setText("Quanto é 10 + 5?");
	     op1.setText("15");
	     op2.setText("16");
	     op3.setText("25");
	     op4.setText("17");
	}

	public void round2(){
		 question.setText("Qual o número vem depois do 11?");
	     op1.setText("10");
	     op2.setText("21");
	     op3.setText("35");
	     op4.setText("12");
	}

	public void round3(){
		 question.setText("Qual o número par?");
		 op1.setText("200");
	     op2.setText("33");
	     op3.setText("55");
	     op4.setText("61");
	}
	
	public void round4(){
		 question.setText("Qual o número impar?");
	     op1.setText("6");
	     op2.setText("4");
	     op3.setText("7");
	     op4.setText("2");
	}
	
	public void round5(){
		 question.setText("Qual sistema operacional deste aparelho?");
	     op1.setText("Windows Phone");
	     op2.setText("Android");
	     op3.setText("iOS");
	     op4.setText("FirefoxOS");
	}
}
