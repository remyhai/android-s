package com.remy.recycleview2.storage;

import android.app.DownloadManager;

import androidx.constraintlayout.solver.widgets.Snapshot;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {
    public List<String> list = new ArrayList<>();
    private static FirebaseFirestore db;

    public static void init(){

    }

    private static void addOneTimeQuery(DownloadManager.Query query){
        query.get().addOnCompleteListener(new OnCompleteListener<Snapshot>() {

        });
    }
}
