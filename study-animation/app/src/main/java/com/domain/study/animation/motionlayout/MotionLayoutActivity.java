package com.domain.study.animation.motionlayout;

import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityMotionLayoutBinding;

import org.jetbrains.annotations.NotNull;

public class MotionLayoutActivity extends BaseBindingActivity<ActivityMotionLayoutBinding> {
    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_motion_layout;
    // }

    @NotNull
    @Override
    public ActivityMotionLayoutBinding initViewBinding() {
        return ActivityMotionLayoutBinding.inflate(getLayoutInflater());
    }
}
