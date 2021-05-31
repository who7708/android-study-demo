package com.domain.study.animation.tween;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.domain.study.animation.R;
import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityTweenTranslateBinding;

import org.jetbrains.annotations.Nullable;

public class TweenTanslateActivity extends BaseBindingActivity<ActivityTweenTranslateBinding> {
    // @BindView(R.id.iv)
    // ImageView iv;
    //
    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_tween_translate;
    // }

    // @OnClick(R.id.iv)
    // public void onViewClicked() {
    //     Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
    //     iv.startAnimation(animation);
    //
    // }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewBinding().iv.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
            getViewBinding().iv.startAnimation(animation);
        });
    }

    // @NotNull
    // @Override
    // public ActivityTweenTranslateBinding initViewBinding() {
    //     return ActivityTweenTranslateBinding.inflate(getLayoutInflater());
    // }
}
