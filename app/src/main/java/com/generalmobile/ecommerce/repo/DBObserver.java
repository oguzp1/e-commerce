package com.generalmobile.ecommerce.repo;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

import com.generalmobile.ecommerce.screens.ScreenInteractor;
import com.generalmobile.ecommerce.screens.screen14.Screen14Presenter;

/**
 * Created by btstajyer7 on 14.07.2017.
 */

public class DBObserver extends ContentObserver {
    private ChangeObserver dataListener;

    public DBObserver(ChangeObserver dataListener) {
        super(null);
        this.dataListener = dataListener;
    }

    @Override
    public void onChange(boolean selfChange) {
        dataListener.dataChanged();
        super.onChange(selfChange);
    }

    public interface ChangeObserver {
        void dataChanged();
    }
}
