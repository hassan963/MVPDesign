package com.example.hassan.mvpdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hassan.mvpdesign.model.ButtonInteractor;
import com.example.hassan.mvpdesign.model.ButtonInteractorImpl;
import com.example.hassan.mvpdesign.presenter.ButtonPresenter;
import com.example.hassan.mvpdesign.view.ButtonView;

public class MainActivity extends AppCompatActivity implements ButtonView {

    private static final String TAG = MainActivity.class.getSimpleName();
    ButtonPresenter buttonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // Note: Don't do this on production code, use Dependency Injection instead
        // to provide the BooksInteractor and the BooksPresenter to the View
        // Learn how to use Dagger 2 here:
        // https://medium.com/@Miqubel/understanding-dagger-2-367ff1bd184f#.s2jza32df
        ButtonInteractor interactor = new ButtonInteractorImpl();
        buttonPresenter = new ButtonPresenter(interactor);
        buttonPresenter.bind(this);
    }

    @Override
    public void updateView(String message) {
        Log.e(TAG, "updateView: "+ message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        buttonPresenter.unbind();
        super.onDestroy();
    }
}
