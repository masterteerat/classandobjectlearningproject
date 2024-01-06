package com.example.classmanagementv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterScreen extends AppCompatActivity {

    private EditText nameInp;
    private EditText sidInp;
    private Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        nameInp = findViewById(R.id.nameInp);
        sidInp = findViewById(R.id.sidInp);
        btnReg = findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("ยืนยันลงทะเบียน?");
            }
        });



    }

    public void showDialog(final String inpTxt) {
        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterScreen.this);

        builder.setMessage("ลงทะเบียน: " + inpTxt);

        builder.setPositiveButton("ตกลง", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){

                GlobalVar.userName = nameInp.getText().toString();
                GlobalVar.userSID = sidInp.getText().toString();


                Intent intent = new Intent(RegisterScreen.this,SplashScreen.class);
                finish();
                startActivity(intent);
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.dismiss();
            }
        });
        builder.show();
    }

}