package comp640.computerbuilder.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.prefs.Preferences;

import comp640.computerbuilder.R;
import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;

/**
 * Created by alexanderturner on 4/10/16.
 * Represents the login screen of the application.
 */
public class LoginActivity extends AppCompatActivity {

    /**
     * The duration of the shake animation.
     */
    private static final int SHAKE_DURATION = 500;

    /**
     * The tag of the stored email.
     */
    private static final String EMAIL_TAG = "email";

    /**
     * Holds the user's email.
     */
    private EditText _emailEditText;

    /**
     * Holds the user's password.
     */
    private EditText _passwordEditText;

    /**
     * The remember me toggle button.
     */
    private ToggleButton _rememberMeButton;

    /**
     * The login button.
     */
    private Button _loginButton;

    /**
     * The register button.
     */
    private Button _registerButton;

    /**
     * The progress bar.
     */
    private ProgressBar _progressBar;

    /**
     * The shared preferences.
     */
    private SharedPreferences _preferences;


    /**
     * Sets the content view and initializes the UI global variables
     * @param savedInstanceState the bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Set UI variables
        _emailEditText = (EditText)findViewById(R.id.emailEditText);
        _passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        _rememberMeButton = (ToggleButton)findViewById(R.id.rememberMeButton);
        _loginButton = (Button)findViewById(R.id.loginButton);
        _registerButton = (Button)findViewById(R.id.registerButton);
        _progressBar = (ProgressBar)findViewById(R.id.progressBar);


        _preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        setOnClickListeners();

        String email = checkForRememberedEmail();
        if(!email.equals("")){
            _emailEditText.setText(email);
            _rememberMeButton.setChecked(true);
            _passwordEditText.requestFocus();
        }else {
            _rememberMeButton.setChecked(false);
        }
    }

    /**
     * Sets the on click listeners of the buttons.
     */
    private void setOnClickListeners(){
        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin(_emailEditText.getText().toString(),
                        _passwordEditText.getText().toString(),
                        _rememberMeButton.isChecked());
            }
        });

        _registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptRegister(_emailEditText.getText().toString(),
                        _passwordEditText.getText().toString(),
                        _rememberMeButton.isChecked());
            }
        });
    }

    /**
     * Attempts to login into the app.
     * @param email the email.
     * @param password the password.
     */
    private void attemptLogin(final String email, final String password, final boolean remember){
        //Check preconditions
        if(!checkInputsAndDisplayErrors(email,password))
            return;

        _progressBar.setVisibility(View.VISIBLE);
        DataController.getController().getUser().login(email, password, new OnBackendTaskCompleteListener() {
            @Override
            public void onSuccess() {
                rememberEmail(email, remember);
                loginOrRegisterSuccess();
                _progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(String reason) {
                loginOrRegisterFailure(reason);
                _progressBar.setVisibility(View.INVISIBLE);
            }
        });

    }

    /**
     * Attempts to register for the app.
     * @param email the email.
     * @param password the password.
     */
    private void attemptRegister(final String email, final String password, final boolean remember){
        //Check preconditions
        if(!checkInputsAndDisplayErrors(email,password))
            return;

        _progressBar.setVisibility(View.VISIBLE);
        DataController.getController().getUser().register(email, password, new OnBackendTaskCompleteListener() {
            @Override
            public void onSuccess() {
                attemptLogin(email,password,remember);
            }

            @Override
            public void onFailure(String reason) {
                loginOrRegisterFailure(reason);
                _progressBar.setVisibility(View.INVISIBLE);
            }
        });


    }

    /**
     * Called upon success of logging in or registering
     */
    private void loginOrRegisterSuccess(){
        Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_LONG).show();
        switchToBuildsActivity();
    }

    /**
     * Called upon failure of logging in or registering
     * @param error the error from the db
     */
    private void loginOrRegisterFailure(String error){
        showInvalidInput(_emailEditText);
        showInvalidInput(_passwordEditText, error);
    }

    /**
     * Checks the fields to see if they're empty and displays errors if they are
     * @param email the user's email.
     * @param password the user's password.
     * @return true if no errors, otherwise false.
     */
    private boolean checkInputsAndDisplayErrors(String email, String password){
        if(email.equals("") && password.equals("")){
            showInvalidInput(_emailEditText);
            showInvalidInput(_passwordEditText, "Both fields are missing");
            return false;
        }
        if(email.equals("")){
            showInvalidInput(_emailEditText, "Email is missing");
            return false;
        }
        if (password.equals("")) {
            showInvalidInput(_passwordEditText, "Password is missing");
            return false;
        }

        return true;
    }

    /**
     * Overloaded showWrongInput to take only the view.
     * @param inputView the view that is invalid.
     */
    private void showInvalidInput(TextView inputView){
        showInvalidInput(inputView, null);
    }

    /**
     * Shows the user that their input is wrong.
     * @param inputView the view that is invalid.
     * @param message the message to be displayed.
     */
    private void showInvalidInput(TextView inputView ,String message){
        YoYo.with(Techniques.Shake)
                .duration(SHAKE_DURATION)
                .playOn(inputView);

        if(message != null)
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Remembers the email.
     * @param email the email.
     * @param remember whether or not to remember the email.
     */
    private void rememberEmail(String email, boolean remember){
        SharedPreferences.Editor editor = _preferences.edit();
        if(remember)
            editor.putString(EMAIL_TAG,email);
        else
            editor.putString(EMAIL_TAG,"");
        editor.commit();
    }

    /**
     * Checks to see if there was an email remembered.
     * @return the remembered email or "".
     */
    private String checkForRememberedEmail(){
        if(!_preferences.contains(EMAIL_TAG))
            return "";
        return _preferences.getString(EMAIL_TAG,"");
    }

    /**
     * Switch to the saved builds activity.
     */
    private void switchToBuildsActivity(){
        Intent activity = new Intent().setClass(getApplicationContext(), MenuActivity.class);
        startActivity(activity);
    }
}

