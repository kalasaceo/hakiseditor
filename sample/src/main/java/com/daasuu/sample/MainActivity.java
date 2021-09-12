package com.daasuu.sample;

import android.app.ActivityOptions;
import android.content.Intent;
import com.daasuu.camerarecorder.BaseCameraActivity;
import com.daasuu.camerarecorder.CollageActivity;
import com.daasuu.camerarecorder.CommentActivity;
import com.daasuu.camerarecorder.ExtraOptionsActivity;
import com.daasuu.camerarecorder.MainFrameActivity;
import com.daasuu.camerarecorder.MessageActivity;
import com.daasuu.camerarecorder.OpenOptions;
import com.daasuu.camerarecorder.PPicCrop;
import com.daasuu.camerarecorder.ProfileCropper;
import com.daasuu.camerarecorder.SearchGiffActivity;
import com.daasuu.camerarecorder.ShowUpdateActivity;
import com.daasuu.camerarecorder.StoryVideoActivity;
import com.daasuu.camerarecorder.UpdateProfileActivity;
import com.daasuu.camerarecorder.ZoomActivity;
import com.daasuu.camerarecorder.ZoomVideoActivity;
import com.daasuu.camerarecorder.friendListMenu;
import com.daasuu.camerarecorder.ui.activity.VideoRecyclerActivity;
import com.daasuu.camerarecorder.ui.activity.profileActivity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 88888;
    private static final int ADD_MAIN_REQUEST_CODE = 4444;
    private static String AES = "AES";
    String textfile="";
    String stri="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Intent intent = new Intent(this, CommentActivity.class);
        intent.putExtra("Chats", "how are you-*-0%%%%i am fine how are you bro so this will be much bigger than you expected it to woth all the worth i will put into it to beat afacebook and twitter-*-1%%%%justdoing fine thnak sofr asking-*-1%%%%thanks for asking man-*-0");
        intent.putExtra("Name", "Rowan Apte");*/
        /*Intent intent = new Intent(this, OpenOptions.class);
        intent.putExtra("idata", "0--1--1--1--0--1--0::mark--dorsey--rishabh--byju");
        intent.putExtra("idata", "1--0--0--0--1::sahil sharma*me--sahil grover*me");
        startActivityForResult(intent, oPrfiADD_MAIN_REQUEST_CODE);*/
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cr();
            }
        }, 400);
        }
    private void writeInFile(String text) {
        OutputStream outputStream;
        String textfile="/storage/emulated/0/Android/data/com.datas.writes/" + Calendar.getInstance().getTimeInMillis()+".cache";
        try {
            outputStream = getContentResolver().openOutputStream(Uri.fromFile(new File(textfile)));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write(text);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        void cr()
        {
            //Intent intent = new Intent(this, PPicCrop.class);
            //intent.putExtra("path", "/storage/emulated/0/Movies/picone.png");
            //intent.putExtra("Password", "@#aaaa#@");
            //intent.putExtra("CoUserName", "@#aaaa#@");
            //startActivityForResult(intent, ADD_MAIN_REQUEST_CODE);
            Intent intent = new Intent(this, ZoomActivity.class);
            intent.putExtra("link", "https://toasterco.com/Posts/24E47965-3E.png");
            intent.putExtra("likes", "77");
            intent.putExtra("views", "77");
            intent.putExtra("height", "720");
            intent.putExtra("order", "0");
            //intent.putExtra("FirstTime", "true");
            //intent.putExtra("Opt", "24-1-1997--29-30--40--70--80");
            //intent.putExtra("Collarge", "60a6858e62d57c0dc1db4542::rowan apte::::");
            //intent.putExtra("Collarge", "60a6858e62d57c0dc1db4542::rowan apte::::B25AFEB4071.mp40.5--this is the biggest news \uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01--60a6858e62d57c0dc1db4542Sun Jan 17 20212:39:17 PM UTC--193--16<-:>1EC37E238F8.mp40.5--God bless farmers of India --60a6858e62d57c0dc1db4542Sun Jan 17 202110:58:48 AM UTC--193--15<-:>58D44A19-F9.png1.7--Jai Chintpurni mata ji \uD83D\uDEA9\uD83D\uDEA9\uD83D\uDD49️--60a6858e62d57c0dc1db4542Tue Jun 29 20213:59:36 AM UTC--0--11<-:>24E47965-3E.png1.7--Jai Chintpurni mata ji \uD83D\uDD49️\uD83D\uDEA9\uD83D\uDD49️\uD83D\uDD49️\uD83D\uDEA9--60a6858e62d57c0dc1db4542Tue Jun 29 20213:58:26 AM UTC--0--10<-:>repC42C7C9F.mp41.0--Yaar jigri kasuuti zindagi--60a6858e62d57c0dc1db4542Sat Jan 16 20218:56:27 AM UTC--439--9");
            //intent.putExtra("Password", "checkpass");
            //intent.putExtra("CoUserName", "divyom sharma");
            //intent.putExtra("story", "@@.mp4*3=:=3=:=3=:=60afb12df4114453505d2ca3Thu Jun 10 20213:45:10 AM UTC=:=0=:=60afb12df4114453505d2ca3");
            startActivityForResult( intent, ADD_MAIN_REQUEST_CODE , ActivityOptions.makeCustomAnimation(this,R.anim.activity_slider_in_right,R.anim.activity_slide_in_left).toBundle());
        }
        /*
60a6858e62d57c0dc1db4542::
infos::
1EC37E238F8.mp40.5--God bless farmers of India --60a6858e62d57c0dc1db4542Sun Jan 17 202110:58:48 AM UTC--193--60a6858e62d57c0dc1db4542--15::
D3F5628.png0.5--Yaar jigri kasuuti zindagi--60a6858e62d57c0dc1db4542Sat Jan 16 20218:56:27 AM UTC--439--60a6858e62d57c0dc1db4542--9
*/@Override
    public void onBackPressed() {
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ADD_MAIN_REQUEST_CODE && resultCode == RESULT_OK) {
            if (data.hasExtra("ChoosedText")) {
            }
        }
    }
}