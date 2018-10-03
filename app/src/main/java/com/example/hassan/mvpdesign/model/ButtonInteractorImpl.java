package com.example.hassan.mvpdesign.model;

public class ButtonInteractorImpl implements ButtonInteractor {
    @Override
    public String showSignUp() {
        return "Sign Up Clicked";
    }

    @Override
    public String showSignIn() {
        return "Sign In Clicked";
    }
}
