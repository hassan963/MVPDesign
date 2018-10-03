package com.example.hassan.mvpdesign.presenter;

import com.example.hassan.mvpdesign.model.ButtonInteractor;
import com.example.hassan.mvpdesign.model.ButtonInteractorImpl;
import com.example.hassan.mvpdesign.view.ButtonView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ButtonPresenterTest {

    @Mock
    private ButtonView buttonView;

    private ButtonPresenter buttonPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        ButtonInteractor interactor = new ButtonInteractorImpl();
        buttonPresenter = new ButtonPresenter(interactor);
        buttonPresenter.bind(buttonView);
    }

    @Test
    public void performSignUpUpdate() {
        buttonPresenter.performSignUpUpdate();
    }

    @Test
    public void performSignInUpdate() {
        buttonPresenter.performSignInUpdate();
    }
}