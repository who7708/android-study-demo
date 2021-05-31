package com.domain.study.animation.property;

import android.os.Bundle;

import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityPropertyBinding;

import org.jetbrains.annotations.Nullable;

public class PropertyActivity extends BaseBindingActivity<ActivityPropertyBinding> {
    // @BindView(R.id.btn_value_animator)
    // Button btnValueAnimator;
    // @BindView(R.id.btn_object_animator)
    // Button btnObjectAnimator;

    // public static void start(Context context) {
    //     Intent starter = new Intent(context, PropertyActivity.class);
    //     context.startActivity(starter);
    // }

    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_property;
    // }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewBinding().btnObjectAnimator.setOnClickListener(v -> start(PropertyActivity.this, ObjectAnimatorActivity.class));
        getViewBinding().btnValueAnimator.setOnClickListener(v -> start(PropertyActivity.this, ValueAnimatorActivity.class));
    }

    // @OnClick({R.id.btn_value_animator, R.id.btn_object_animator})
    // public void onViewClicked(View view) {
    //     switch (view.getId()) {
    //         case R.id.btn_value_animator:
    //             ValueAnimatorActivity.start(this);
    //             break;
    //         case R.id.btn_object_animator:
    //             ObjectAnimatorActivity.start(this);
    //             break;
    //     }
    // }

    // @NotNull
    // @Override
    // public ActivityPropertyBinding initViewBinding() {
    //     return ActivityPropertyBinding.inflate(getLayoutInflater());
    // }
}
