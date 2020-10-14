package com.example.writerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.tv1);
        String para="                    Android \n" +
                "\n" +
                "Android is a software package and linux based operating system for mobile devices such as tablet computers and smartphones.\n" +
                "\n" +
                "It is developed by Google and later the OHA (Open Handset Alliance). Java language is mainly used to write the android code even though other languages can be used.\n" +
                "\n" +
                "\n" +
                "The goal of android project is to create a successful real-world product that improves the mobile experience for end users." +
                "\n" +
                "There are many code names of android such as Lollipop, Kitkat, Jelly Bean, Ice cream Sandwich, Froyo, Ecliar, Donut etc which is covered in next page.\n" +
                "\n" +
                "What is Open Handset Alliance (OHA) : \n" +
                "It's a consortium of 84 companies such as google, samsung, AKM, synaptics, KDDI, Garmin, Teleca, Ebay, Intel etc.\n" +
                "\n" +
                "It was established on 5th November, 2007, led by Google. It is committed to advance open standards, provide services and deploy handsets using the Android Plateform.\n" +
                "\n" +

                " \n" +
                "Features of Android : \n" +
                "After learning what is android, let's see the features of android. The important features of android are given below:\n" +
                "\n" +
                "1) It is open-source.\n" +
                "\n" +
                "2) Anyone can customize the Android Platform.\n" +
                "\n" +
                "3) There are a lot of mobile applications that can be chosen by the consumer.\n" +
                "\n" +
                "4) It provides many interesting features like weather details, opening screen, live RSS (Really Simple Syndication) feeds etc.\n" +
                "\n" +
                "It provides support for messaging services(SMS and MMS), web browser, storage (SQLite), connectivity (GSM, CDMA, Blue Tooth, Wi-Fi etc.), media, handset layout etc.\n" +
                "\n" +
                "Categories of Android applications : \n" +
                "There are many android applications in the market. The top categories are:\n" +
                "\n" +
                "Entertainment\n" +
                "Tools\n" +
                "Communication\n" +
                "Productivity\n" +
                "Personalization\n" +
                "Music and Audio\n" +
                "Social\n" +
                "Media and Video\n" +
                "Travel and Local etc.";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}