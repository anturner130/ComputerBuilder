package comp640.computerbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by alexanderturner on 4/10/16.
 * Represents the login screen of the application.
 */
public class LoginActivity extends AppCompatActivity {

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

        setOnClickListeners();

        String email = checkForRememberedEmail();
        if(email == null){
            _emailEditText.setText(email);
            _rememberMeButton.setChecked(true);
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
    private void attemptLogin(String email, String password, boolean remember){
        //Check preconditions
        if(email.equals("")){
            Toast.makeText(getApplicationContext(),"Email is missing", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.equals("")){
            Toast.makeText(getApplicationContext(),"Password is missing", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    /**
     * Attempts to register for the app.
     * @param email the email.
     * @param password the password.
     */
    private void attemptRegister(String email, String password, boolean remember){
        //Check preconditions
        if(email.equals("")){
            Toast.makeText(getApplicationContext(),"Email is missing", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.equals("")){
            Toast.makeText(getApplicationContext(),"Password is missing", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    /**
     * Remembers the email.
     * @param email the email.
     */
    private void rememberEmail(String email){

    }

    /**
     * Checks to see if there was an email remembered.
     * @return the remembered email.
     */
    private String checkForRememberedEmail(){
        return null;
    }

    /**
     * Switch to the saved builds activity.
     */
    private void switchToBuildsActivity(){

    }
}

