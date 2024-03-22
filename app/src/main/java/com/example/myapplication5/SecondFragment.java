package com.example.myapplication5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import static android.content.Context.NOTIFICATION_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;

import android.Manifest;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

public class SecondFragment extends Fragment {

    Button button;
    TextView second_fragment_text_view;
    public SecondFragment() {
        super(R.layout.fragment_second);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        second_fragment_text_view = (TextView) getActivity().findViewById(R.id.fragment_second_text_view2);

        Bundle bundle = this.getArguments();
        ArrayList<String> message = bundle.getStringArrayList("prodNameAmount");
        String product_name = FirstFragment.parseInputsProducts(message, products.PRODUCT_NAME);
        String product_amount = FirstFragment.parseInputsProducts(message, products.PRODUCT_AMOUNT);
        String result = product_amount + " " + product_name;
        second_fragment_text_view.setText(result);


    }


}