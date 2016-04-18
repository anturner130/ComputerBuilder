package comp640.computerbuilder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import comp640.computerbuilder.R;

/**
 * Created by alexanderturner on 4/10/16.
 * Represents the main page of the application.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The build button.
     */
    private Button _buildButton;

    /**
     * The buy button.
     */
    private Button _buyButton;

    /**
     * The login button.
     */
    private Button _loginButton;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set buttons
        _buildButton = (Button)findViewById(R.id.buildButton);
        _buyButton = (Button)findViewById(R.id.buyButton);
        _loginButton = (Button)findViewById(R.id.loginButton);

        setOnClickListeners();
    }

    /**
     * Sets the on click listeners of the buttons.
     */
    private void setOnClickListeners(){
        _buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToBuildActivity();
            }
        });

        _buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToBuyActivity();
            }
        });

        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToLoginActivity();
            }
        });
    }

    /**
     * Switch to the build activity.
     */
    private void switchToBuildActivity(){
        //Temporary bypass of the login
        startActivity(MenuActivity.class);
    }

    /**
     * Switch to the buy activity.
     */
    private void switchToBuyActivity(){

    }

    /**
     * Switch to the login activity.
     */
    private void switchToLoginActivity(){
        startActivity(LoginActivity.class);
    }

    /**
     * Starts a new activity.
     */
    private void startActivity(Class activityClass){
        Intent activity = new Intent().setClass(getApplicationContext(), activityClass);
        startActivity(activity);
    }

}
