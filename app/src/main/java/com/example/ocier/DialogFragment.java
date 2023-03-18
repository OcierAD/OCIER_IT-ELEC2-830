package com.example.ocier;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DialogFragment extends androidx.fragment.app.DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle SavedInstanceState){
        super.onCreateView(inflater, container, SavedInstanceState);
        return inflater.inflate(R.layout.activity_dialog_fragment, container, false);
    }
}