package com.example.celine.unisociety;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Sign_Up_Activity extends AppCompatActivity {
    //Radio button

    //spinner
    private Spinner societyList;
    //EditTexts
    private EditText et_userName;
    private EditText et_password;
    private EditText et_passwordConfirm;
    private EditText et_securityCode;
    private EditText et_securityQues;

    //SignUp Button
    private Button btn_SignUp;

    private RadioGroup userType;
    private RadioButton userSelected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_society);

        //binding
        societyList = (Spinner)findViewById(R.id.society_name);

        et_userName = (EditText)findViewById(R.id.ET_user_name);
        et_password = (EditText)findViewById(R.id.ET_password);
        et_passwordConfirm = (EditText)findViewById(R.id.Confirm_Password);
        et_securityCode = (EditText)findViewById(R.id.security_code);
        et_securityQues = (EditText)findViewById(R.id.Sequrity_question);

        btn_SignUp = (Button)findViewById(R.id.btn_sign_up);

        userType = (RadioGroup)findViewById(R.id.RG_UserType);
        userType.setOnCheckedChangeListener();
        userSelected
        //change layout based on usertype
        //hide societyList, securityCode field if it's student

        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sign up
                //get the input
                //check if the society match the securityCode
                //check if the account exists
                //check if password confirmed
                //sign up

                //show success notification
                Toast.makeText(Sign_Up_Activity.this, "Sign Up Succeed", Toast.LENGTH_LONG);
                //go back to login page
                finish();
            }
        });

    }
}
