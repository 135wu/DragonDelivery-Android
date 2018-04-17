package com.charles.dragondelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.charles.dragondelivery.Application.App.PXApp;
import com.charles.dragondelivery.Classes.Main.User.PXUser;
import com.charles.dragondelivery.Classes.Main.User.PXUserInterface;
import com.charles.dragondelivery.Classes.Main.Utils.PXLog;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetApis;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetHelper;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetInterface;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetModel;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.vondear.rxtools.RxDeviceTool;

import java.util.HashMap;
import java.util.Map;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);



    }

}
