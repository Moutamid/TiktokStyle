package com.moutamid.tiktokstyle;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.moutamid.tiktokstyle.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.gotoLoginBtn.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        });

        b.passwordEyeBtn.setOnClickListener(v -> {
            if (b.passwordEdittext.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                b.passwordEyeBtn.setImageResource(R.drawable.baseline_remove_red_eye_24);
                //Show Password
                b.passwordEdittext.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                b.passwordEyeBtn.setImageResource(R.drawable.invisible_eye);
                //Hide Password
                b.passwordEdittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        b.confirmPasswordEyeBtn.setOnClickListener(v -> {
            if (b.confirmPasswordEdittext.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                b.confirmPasswordEyeBtn.setImageResource(R.drawable.baseline_remove_red_eye_24);
                //Show Password
                b.confirmPasswordEdittext.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                b.confirmPasswordEyeBtn.setImageResource(R.drawable.invisible_eye);
                //Hide Password
                b.confirmPasswordEdittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

    }

}
