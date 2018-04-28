package zloykurd.developer.androidmvvmlogin.viewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import zloykurd.developer.androidmvvmlogin.Model.User;
import zloykurd.developer.androidmvvmlogin.interfaces.LoginResultCallBacks;

public class LoginViewModel extends ViewModel{

    private User mUser;
    private LoginResultCallBacks mLoginResultCallBacks;

    public LoginViewModel(LoginResultCallBacks mLoginResultCallBacks) {
        this.mLoginResultCallBacks = mLoginResultCallBacks;
        this.mUser = new User();
}

    //write method to get Enail from EditText and set to user
    public TextWatcher getEmailTextWatcher  (){

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            mUser.setEmail(s.toString());
            }
        };
    }

    //write method to get Password from EditText and set to user
    public TextWatcher getPasswordTextWatcher  (){

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mUser.setPassword(s.toString());
            }
        };
    }

    //write method to Progress Login
    public void onLoginClicked(View view){
        if (mUser.isValidData()){
            mLoginResultCallBacks.onSuccess("Login Success");

        }else {
            mLoginResultCallBacks.onError("Error Login");
        }


    }
}
