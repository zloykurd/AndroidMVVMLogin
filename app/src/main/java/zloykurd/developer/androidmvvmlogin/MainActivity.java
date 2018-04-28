package zloykurd.developer.androidmvvmlogin;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import zloykurd.developer.androidmvvmlogin.databinding.ActivityMainBinding;
import zloykurd.developer.androidmvvmlogin.interfaces.LoginResultCallBacks;
import zloykurd.developer.androidmvvmlogin.viewModel.LoginViewModel;
import zloykurd.developer.androidmvvmlogin.viewModel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginResultCallBacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil
                .setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders
                .of(this,
                        new LoginViewModelFactory(this))
                .get(LoginViewModel.class));


    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this,"Login Success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(String error) {
        Toasty.error(this,"Login Error", Toast.LENGTH_LONG).show();

    }
}
