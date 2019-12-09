package com.example.jisuanqi;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point; //小数点
    Button btn_clear; //清除
    Button btn_del;   //删除
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    Button btn_equal;
    Button btn_left;
    Button btn_right;
    Button btn_cm;
    Button btn_dm;
    Button btn_sin;
    Button btn_cos;
    Button btn_cm3;
    Button btn_dm3;
    Button btn_102;
    Button btn_108;
    Button btn_106;
    Button btn_210;
    Button btn_28;
    Button btn_216;




    private TextView et_input;
    private StringBuilder pending = new StringBuilder();

    private void initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        et_input = (TextView) findViewById(R.id.et_input);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_cm = (Button) findViewById(R.id.btn_cm);
        btn_dm = (Button) findViewById(R.id.btn_dm);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cm3 = (Button) findViewById(R.id.btn_cm3);
        btn_dm3 = (Button) findViewById(R.id.btn_dm3);
        btn_102 = (Button) findViewById(R.id.btn_102);
        btn_108 = (Button) findViewById(R.id.btn_108);
        btn_106 = (Button) findViewById(R.id.btn_106);
        btn_210 = (Button) findViewById(R.id.btn_210);
        btn_28=(Button) findViewById(R.id.btn_28);
        btn_216 = (Button) findViewById(R.id.btn_210);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);
        btn_cm.setOnClickListener(this);
        btn_dm.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_cm3.setOnClickListener(this);
        btn_dm3.setOnClickListener(this);
        btn_102.setOnClickListener(this);
        btn_108.setOnClickListener(this);
        btn_106.setOnClickListener(this);
        btn_210.setOnClickListener(this);
        btn_28.setOnClickListener(this);
        btn_216.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }


    public void onClick(View v) {
        int last = 0;
        if(pending.length()!=0)
        {
            last = pending.codePointAt(pending.length()-1);

        }
        switch (v.getId()) {
            case R.id.btn_0:
                pending = pending.append("0");
                et_input.setText(pending);
                break;
            case R.id.btn_1:
                pending = pending.append("1");
                et_input.setText(pending);
                break;
            case R.id.btn_2:
                pending = pending.append("2");
                et_input.setText(pending);
                break;
            case R.id.btn_3:
                pending = pending.append("3");
                et_input.setText(pending);
                break;
            case R.id.btn_4:
                pending = pending.append("4");
                et_input.setText(pending);
                break;
            case R.id.btn_5:
                pending = pending.append("5");
                et_input.setText(pending);
                break;
            case R.id.btn_6:
                pending = pending.append("6");
                et_input.setText(pending);
                break;
            case R.id.btn_7:
                pending = pending.append("7");
                et_input.setText(pending);
                break;
            case R.id.btn_8:
                pending = pending.append("8");
                et_input.setText(pending);
                break;
            case R.id.btn_9:
                pending = pending.append("9");
                et_input.setText(pending);
                break;
            case R.id.btn_plus:
                //if (last >= '0' && last <= '9' ) {
                pending = pending.append("+");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_minus:
                //if (last >= '0' && last <= '9') {
                pending = pending.append("-");
                //  }
                et_input.setText(pending);
                break;
            case R.id.btn_multiply:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("*");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_divide:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("/");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_point:
                if (judje1()) {
                    pending = pending.append(".");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_right:// )右括号
                if((last>='0' &&last<='9'||last==')')&&judje2()==1) {
                    pending = pending.append(")");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_left:// （左括号
                if((last!='(')||(last<='0' &&last>='9')){
                    pending = pending.append("(");
                    et_input.setText(pending);
                }
                break;

            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_cm:
                String s= et_input.getText().toString();
                double n= Double.parseDouble(s);
                et_input.setText(s+"/100="+n/100);
                break;
            case R.id.btn_dm:

                String s1= et_input.getText().toString();
                double n1= Double.parseDouble(s1);
                et_input.setText(s1+"/10="+n1/10);
                break;
            case R.id.btn_cm3:

                String s2= et_input.getText().toString();
                double n2= Double.parseDouble(s2);
                et_input.setText(s2+"/1000000="+n2/1000000);
                break;

            case R.id.btn_dm3:
                String s3= et_input.getText().toString();
                double n3= Double.parseDouble(s3);
                et_input.setText(s3+"/10="+n3/10);
                break;
            case R.id.btn_sin:
                String s4= et_input.getText().toString();
                double n4= Double.parseDouble(s4);
                et_input.setText("sin("+n4+")="+Math.sin(n4));
                break;
            case R.id.btn_cos:
                String s5= et_input.getText().toString();
                double n5= Double.parseDouble(s5);
                et_input.setText("cos("+n5+")="+Math.cos(n5));
                break;
            case R.id.btn_102:
                String s6= et_input.getText().toString();
                double n6= Double.parseDouble(s6);
                et_input.setText(Integer.toBinaryString((int)n6)+"");
                break;
            case R.id.btn_106:
                String s7= et_input.getText().toString();
                double n7= Double.parseDouble(s7);
                et_input.setText(Integer.toHexString((int)n7)+"");
                break;
            case R.id.btn_108:
                String s8= et_input.getText().toString();
                double n8= Double.parseDouble(s8);
                et_input.setText(Integer.toOctalString((int)n8)+"");
                break;
            case R.id.btn_210:
                String s9= et_input.getText().toString();
                int n9= Integer.parseInt(s9);
                s9=n9+"";
                et_input.setText(Integer.parseInt(s9,2)+"");
                break;

            case R.id.btn_28:
                String s10= et_input.getText().toString();
                int n10= Integer.parseInt(s10);
                s10=n10+"";
                et_input.setText(Integer.parseInt(s10,8)+"");
                break;
            case R.id.btn_216:
                String s11= et_input.getText().toString();
                int n11= Integer.parseInt(s11);
                s11=n11+"";
                et_input.setText(Integer.parseInt(s11,16)+"");
                break;



            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                et_input.setText(pending);
                break;
            case R.id.btn_equal: // =等于
                if ((pending.length() > 1)) {
                    InfixInToDuffix inf = new InfixInToDuffix();
                    String jieguo;
                    try {
                        String a = inf.toSuffix(pending);
                        jieguo = inf.dealEquation(a);

                    } catch (Exception ex) {
                        jieguo = "出错";
                    }
                    et_input.setText(pending + "=" + jieguo);
                    pending = pending.delete(0, pending.length());
                    if (Character.isDigit(jieguo.charAt(0))) {
                        pending = pending.append(jieguo);
                    }
                }
                break;
            default:
                break;
        }
    }

    private boolean judje1() {
        String a = "+-*/.";
        int[] b = new int[a.length()];
        int max;
        for (int i = 0; i < a.length(); i++) {
            String c = "" + a.charAt(i);
            b[i] = pending.lastIndexOf(c);
        }
        Arrays.sort(b);
        if (b[a.length() - 1] == -1) {
            max = 0;
        } else {
            max = b[a.length() - 1];
        }
        if (pending.indexOf(".", max) == -1) {
            return true;
        } else {
            return false;
        }
    }
    private int judje2(){
        int a=0,b=0;
        for(int i = 0 ; i < pending.length() ;i++){
            if(pending.charAt(i)=='(' ) {
                a++;
            }
            if(pending.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
            return 1;
        return 2;
    }




}