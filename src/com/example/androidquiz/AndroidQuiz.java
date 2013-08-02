package com.example.androidquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;

public class AndroidQuiz extends Activity {
	int acertos = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_android_quiz);

		init(1);
	}

	public void init(int numero){
		Questions question = new Questions();
        question.op1 = (RadioButton) findViewById(R.id.op1);
        question.op2 = (RadioButton) findViewById(R.id.op2);
        question.op3 = (RadioButton) findViewById(R.id.op3);
        question.op4 = (RadioButton) findViewById(R.id.op4);
        question.question = (TextView) findViewById(R.id.pergunta);

        if(numero == 1){
        	question.round1();
        	question.op1.setOnClickListener(listenerRound1);
            question.op2.setOnClickListener(listenerRound1);
            question.op3.setOnClickListener(listenerRound1);
            question.op4.setOnClickListener(listenerRound1);
        } else if(numero == 2){
	        question.round2();
	        question.op1.setOnClickListener(listenerRound2);
	        question.op2.setOnClickListener(listenerRound2);
	        question.op3.setOnClickListener(listenerRound2);
	        question.op4.setOnClickListener(listenerRound2);
	    } else if(numero == 3){
	    	question.round3();
	    	question.op1.setOnClickListener(listenerRound3);
	        question.op2.setOnClickListener(listenerRound3);
	        question.op3.setOnClickListener(listenerRound3);
	        question.op4.setOnClickListener(listenerRound3);
	    } else if(numero == 4){
	    	question.round4();
	    	question.op1.setOnClickListener(listenerRound4);
	        question.op2.setOnClickListener(listenerRound4);
	        question.op3.setOnClickListener(listenerRound4);
	        question.op4.setOnClickListener(listenerRound4);
	    } else if(numero == 5){
	    	question.round5();
	    	question.op1.setOnClickListener(listenerRound5);
	        question.op2.setOnClickListener(listenerRound5);
	        question.op3.setOnClickListener(listenerRound5);
	        question.op4.setOnClickListener(listenerRound5);
	    }
	}
	
	private OnClickListener listenerRound1 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "7"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			init(2);
		}
	};
	private OnClickListener listenerRound2 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "5"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			init(3);
		}
	};
	private OnClickListener listenerRound3 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "1"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			init(4);
		}
	};
	private OnClickListener listenerRound4 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "4"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			init(5);
		}
	};
	private OnClickListener listenerRound5 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "Android"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}

			Intent intent = new Intent(AndroidQuiz.this, LestScreen.class);
			Bundle param = new Bundle();
			param.putInt("acertos", acertos);
			intent.putExtras(param);
			startActivity(intent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.android_quiz, menu);
		return true;
	}

}