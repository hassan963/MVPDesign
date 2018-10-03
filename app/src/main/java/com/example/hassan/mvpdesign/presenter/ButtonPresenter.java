package com.example.hassan.mvpdesign.presenter;

import com.example.hassan.mvpdesign.model.ButtonInteractor;
import com.example.hassan.mvpdesign.view.ButtonView;

public class ButtonPresenter {

    private ButtonInteractor buttonInteractor;
    private ButtonView buttonView;

    public ButtonPresenter(ButtonInteractor buttonInteractor) {
        this.buttonInteractor = buttonInteractor;
    }

    public void bind(ButtonView buttonView){
        this.buttonView = buttonView;
    }

    public void unbind(){
        this.buttonView = null;
    }

    public void performSignUpUpdate(){
        String value = buttonInteractor.showSignUp();
        if (buttonView != null){
            buttonView.updateView(value);
        }
    }

    public void performSignInUpdate(){
        String value = buttonInteractor.showSignIn();
        if (buttonView != null){
            buttonView.updateView(value);
        }
    }


}
