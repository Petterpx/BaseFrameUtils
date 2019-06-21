package com.petterp.latte_ui.recyclear;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * @author Petterp on 2019/4/23
 * Summary:简单Holder
 * 邮箱：1509492795@qq.com
 */
class MulitipleViewHolder extends BaseViewHolder {
    private MulitipleViewHolder(View view) {
        super(view);
    }

    static MulitipleViewHolder create(View view) {
        return new MulitipleViewHolder(view);
    }
}
