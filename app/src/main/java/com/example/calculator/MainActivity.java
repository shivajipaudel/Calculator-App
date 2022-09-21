package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


    public class MainActivity extends AppCompatActivity {

        public String expr = "";
        public TextView t1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            t1 = (TextView)findViewById(R.id.display);

        }
        public void updatetv(char c){
            expr = expr + c;
            t1.setText(expr);
        }
        public void fun1(View view) {updatetv('1');}
        public void fun2(View view) {updatetv('2');}
        public void fun3(View view) {updatetv('3');}
        public void fun4(View view) {updatetv('4');}
        public void fun5(View view) {updatetv('5');}
        public void fun6(View view) {updatetv('6');}
        public void fun7(View view) {updatetv('7');}
        public void fun8(View view) {updatetv('8');}
        public void fun9(View view) {updatetv('9');}
        public void fun0(View view) {updatetv('0');}
        public void funplus(View view) {updatetv('+');}
        public void funmin(View view) {updatetv('-');}
        public void funmul(View view) {updatetv('*');}
        public void fundiv(View view) {updatetv('/');}
        public void funmod(View view) {updatetv('%');}
        public void fundot(View view) {updatetv('.');}
        public void funclr(View view){
            expr = "";
            t1.setText(expr);
        }
        public void funequal(View view){
            Expression ex = new ExpressionBuilder(expr).build();
            double res = ex.evaluate();
            String s1 = Double.toString(res);
            t1.setText(s1);
        }

    }
