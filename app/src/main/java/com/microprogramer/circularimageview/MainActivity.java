package com.microprogramer.circularimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.microprogramer.library.CircularImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private CircularImageView me_avatar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        me_avatar = findViewById(R.id.me_avatar);


        String link = "https://i.guim.co.uk/img/media/c8b1d78883dfbe7cd3f112495941ebc0b25d2265/256_0_3840_2304/master/3840.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=579884b0bd058f1350519d3cc586d587";

        Picasso.get().load(link).into(me_avatar);

    }
}