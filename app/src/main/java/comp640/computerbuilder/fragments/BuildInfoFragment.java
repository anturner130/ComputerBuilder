package comp640.computerbuilder.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.net.Uri;
import android.view.SurfaceView;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.Toast;
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

    public BuildInfoFragment(){
        _title = "Order placed";
        _parentID = R.id.savedBuild;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_build_info, container, false);

        video_player_view = (VideoView)view.findViewById(R.id.videoView1);
        String path = "android.resource://" + getContext().getPackageName() + "/" + R.raw.video1;
        video_player_view.setVideoURI(Uri.parse(path));

        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(video_player_view);
        video_player_view.setMediaController(mediaController);


        video_player_view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                video_player_view.requestFocus();
                video_player_view.start();
            }
        });

        return view;
    }
}
