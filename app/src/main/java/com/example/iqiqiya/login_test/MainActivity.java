package com.example.iqiqiya.login_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Name;//定义Plain Test控件第一个输入框的名字
    EditText Pass;//定义Plain Test控件第二个输入框的名字

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Text_Name);//通过findViewById找到用户名输入框控件对应的id并给它起一个名字
        Pass = findViewById(R.id.Text_Pass);//通过findViewById找到密码输入框控件对应的id并给它起一个名字

        Button Login = findViewById(R.id.Btn_Login);//通过findViewById找到按钮控件对应的id并给它起一个名字

        Button  Register = findViewById(R.id.Btn_Register);//通过findViewById找到按钮控件对应的id并给它起一个名字

        Login.setOnClickListener(new View.OnClickListener() {//监听有没有点击按钮控件 如果点击了就会执行onClick函数
            @Override
            public void onClick(View v) {//trim()去掉两侧空白字符
                check(Name.getText().toString().trim(),Pass.getText().toString().trim());//调用check函数
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check2();
            }
        });
    }

    private void check(String name, String pass) {
        if (name.equals("iqiqiya")&&pass.equals("123456")){//设置账号为iqiqiya密码为123456
            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();//弹框
        }
        else
            Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
    }
    private void check2(){
        Toast.makeText(MainActivity.this,"暂时未开放注册",Toast.LENGTH_SHORT).show();//弹框
    }
}
