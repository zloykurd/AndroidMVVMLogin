package zloykurd.developer.androidmvvmlogin.viewModel;


import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import zloykurd.developer.androidmvvmlogin.interfaces.LoginResultCallBacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory{
    private LoginResultCallBacks mLoginResultCallBacks;


    public LoginViewModelFactory(LoginResultCallBacks loginResultCallBacks) {
        this.mLoginResultCallBacks = loginResultCallBacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(mLoginResultCallBacks);
    }
}
