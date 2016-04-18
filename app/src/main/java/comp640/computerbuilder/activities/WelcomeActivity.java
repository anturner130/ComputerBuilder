package comp640.computerbuilder.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.firebase.client.Firebase;

import java.util.Timer;
import java.util.TimerTask;

import comp640.computerbuilder.R;
import comp640.computerbuilder.activities.MainActivity;

/**
 * Created by alexanderturner on 4/10/16.
 * Shows the welcome animation upon startup.
 */
public class WelcomeActivity extends AppCompatActivity {

    /**
     * Time that the welcome animation will be shown
     */
    private static final int WELCOME_TIME = 2500;

    /**
     * The timer used for control.
     */
    private Timer _welcomeTimer;

    /**
     * The welcome image.
     */
    private ImageView _welcomeImage;

    /**
     * Sets the content view to the welcome animation
     * @param savedInstanceState the bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        _welcomeImage = (ImageView)findViewById(R.id.welcomeImageView);
        _welcomeTimer = new Timer();

        initializeDB();
        animate();
    }

    /**
     * Initializes the database
     */
    private void initializeDB(){
        Firebase.setAndroidContext(getApplicationContext());
    }

    /**
     * Animates the picture.
     */
    private void animate(){
        YoYo.with(Techniques.FadeInRight)
                .duration(WELCOME_TIME)
                .playOn(_welcomeImage);
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

