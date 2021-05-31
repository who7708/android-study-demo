package com.domain.study.animation;

import android.graphics.drawable.AnimationDrawable;

import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityFrameBinding;

/**
 * 参考博客: https://www.jianshu.com/p/225fe1feba60
 */

public class FrameActivity extends BaseBindingActivity<ActivityFrameBinding> {

    // @BindView(R.id.iv)
    // ImageView iv;

    AnimationDrawable animationDrawable = null;
    boolean isStart = false;

    // public static void start(Context context) {
    //     Intent starter = new Intent(context, FrameActivity.class);
    //     context.startActivity(starter);
    // }

    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_frame;
    // }

    @Override
    protected void initView() {
        // 1. 设置动画
        animationDrawable = (AnimationDrawable) getViewBinding().iv.getBackground();
        getViewBinding().iv.setOnClickListener(view -> {
            if (isStart) {
                stop();
            } else {
                start();
            }
        });
    }

    // @OnClick(R.id.iv)
    // public void onViewClicked() {
    //     if (isStart) {
    //         stop();
    //     } else {
    //         start();
    //     }
    // }

    private void start() {
        // 2. 获取动画对象
        animationDrawable.start();
        isStart = true;
    }

    private void stop() {
        // 2. 获取动画对象
        animationDrawable.stop();
        isStart = false;
    }
}
