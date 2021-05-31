package com.domain.study.animation.tween;

import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityTweenBinding;

public class TweenActivity extends BaseBindingActivity<ActivityTweenBinding> {
    // @BindView(R.id.btn_translate)
    // Button btnTranslate;
    // @BindView(R.id.btn_scale)
    // Button btnScale;
    // @BindView(R.id.btn_rotate)
    // Button btnRotate;
    // @BindView(R.id.btn_alpha)
    // Button btnAlpha;

    // public void start(Class<?> clazz) {
    //     Intent starter = new Intent(TweenActivity.this, clazz);
    //     startActivity(starter);
    // }

    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_tween;
    // }

    @Override
    protected void initView() {
        getViewBinding().btnTranslate.setOnClickListener(view -> start(this, TweenTanslateActivity.class));
        getViewBinding().btnScale.setOnClickListener(view -> start(this, TweenScaleActivity.class));
        getViewBinding().btnRotate.setOnClickListener(view -> start(this, TweenRotateActivity.class));
        getViewBinding().btnAlpha.setOnClickListener(view -> start(this, TweenAlphaActivity.class));
        getViewBinding().btnCombination.setOnClickListener(view -> start(this, TweenCombinationActivity.class));
    }

    // @OnClick({R.id.btn_translate, R.id.btn_scale, R.id.btn_rotate, R.id.btn_alpha, R.id.btn_combination})
    // public void onViewClicked(View view) {
    //     switch (view.getId()) {
    //         case R.id.btn_translate:
    //             start(TweenTanslateActivity.class);
    //             break;
    //         case R.id.btn_scale:
    //             start(TweenScaleActivity.class);
    //             break;
    //         case R.id.btn_rotate:
    //             start(TweenRotateActivity.class);
    //             break;
    //         case R.id.btn_alpha:
    //             start(TweenAlphaActivity.class);
    //             break;
    //         case R.id.btn_combination:
    //             start(TweenCombinationActivity.class);
    //             break;
    //     }
    // }
}
