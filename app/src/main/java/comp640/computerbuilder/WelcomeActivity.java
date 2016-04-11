package comp640.computerbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by alexanderturner on 4/10/16.
 * Shows the welcome animation upon startup.
 */
public class WelcomeActivity extends AppCompatActivity {

    /**
     * Time that the welcome animation will be shown
     */
    private static final int WELCOME_TIME = 2000;

    /**
     * The timer used for control.
     */
    private Timer _welcomeTimer;

    /**
     * Sets the content view to the welcome animation
     * @param savedInstanceState the bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        _welcomeTimer = new Timer();

        startTimer();
    }

    /**
     * Starts the timer for the welcome animation.
     */
    private void startTimer(){
        _welcomeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                switchToMainActivity();
            }
        }, WELCOME_TIME);
    }

    /**
     * Starts the main activity and stops this one.
     */
    private void switchToMainActivity(){
        Intent activity = new Intent().setClass(getApplicationContext(), MainActivity.class);
        startActivity(activity);
        finish();
    }

}

