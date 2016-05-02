package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.net.Uri;
import android.view.SurfaceView;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;
import comp640.computerbuilder.R;
import android.widget.Button;
/**
 * Created by Brian on 4/25/2016.
 */
public class BuildInfoFragment extends CBFragment {


    VideoView video_player_view;
    DisplayMetrics dm;
    SurfaceView sur_View;
    MediaController media_Controller;

    /** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }



}
