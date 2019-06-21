package com.petterp.latte_ec.main.index;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.petterp.latte_core.delegates.bottom.BottomItemDelegate;
import com.petterp.latte_ec.R;

/**
 * @author Petterp on 2019/6/21
 * Summary:
 * 邮箱：1509492795@qq.com
 */
public class IndexDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_index;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
}
