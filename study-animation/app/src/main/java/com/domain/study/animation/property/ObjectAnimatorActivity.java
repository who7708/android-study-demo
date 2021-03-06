package com.domain.study.animation.property;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.LinearInterpolator;

import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import com.domain.study.animation.R;
import com.domain.study.animation.base.BaseBindingActivity;
import com.domain.study.animation.databinding.ActivityObjectAnimatorBinding;

import org.jetbrains.annotations.Nullable;

public class ObjectAnimatorActivity extends BaseBindingActivity<ActivityObjectAnimatorBinding> {
    // @BindView(R.id.btn_translate)
    // Button btnTranslate;
    // @BindView(R.id.btn_rotate)
    // Button btnRotate;
    // @BindView(R.id.btn_scale)
    // Button btnScale;
    // @BindView(R.id.btn_alpha)
    // Button btnAlpha;
    //
    // @BindView(R.id.btn_custom)
    // Button btnCustom;
    // @BindView(R.id.progress_view)
    // ProgressView progressView;
    // @BindView(R.id.btn_set)
    // Button btnSet;
    // @BindView(R.id.btn_view_property)
    // Button btnViewProperty;
    // @BindView(R.id.btn_xml)
    // Button btnXml;

    // public static void start(Context context) {
    //     Intent starter = new Intent(context, ObjectAnimatorActivity.class);
    //     context.startActivity(starter);
    // }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewBinding().btnTranslate.setOnClickListener(view -> translate());
        getViewBinding().btnRotate.setOnClickListener(view -> rotate());
        getViewBinding().btnScale.setOnClickListener(view -> scale());
        getViewBinding().btnAlpha.setOnClickListener(view -> alpha());
        getViewBinding().btnCustom.setOnClickListener(view -> custom());
        getViewBinding().btnSet.setOnClickListener(view -> animatorSet());
        getViewBinding().btnKeyFrame.setOnClickListener(view -> keyFrame());
        getViewBinding().btnViewProperty.setOnClickListener(view -> viewProperty());
        getViewBinding().btnXml.setOnClickListener(view -> xmlAnimator());
    }

    // @Override
    // protected int setLayoutId() {
    //     return R.layout.activity_object_animator;
    // }

    // @OnClick({R.id.btn_translate, R.id.btn_rotate, R.id.btn_scale, R.id.btn_alpha, R.id.btn_custom, R.id.btn_set, R.id.btn_key_frame, R.id.btn_view_property, R.id.btn_xml})
    // public void onViewClicked(View view) {
    //     switch (view.getId()) {
    //         case R.id.btn_translate:
    //             translate();
    //             break;
    //         case R.id.btn_rotate:
    //             rotate();
    //             break;
    //         case R.id.btn_scale:
    //             scale();
    //             break;
    //         case R.id.btn_alpha:
    //             alpha();
    //             break;
    //
    //         case R.id.btn_custom:
    //             custom();
    //             break;
    //         case R.id.btn_set:
    //             animatorSet();
    //             break;
    //
    //         case R.id.btn_key_frame:
    //             keyFrame();
    //             break;
    //
    //         case R.id.btn_view_property:
    //             viewProperty();
    //             break;
    //
    //         case R.id.btn_xml:
    //             xmlAnimator();
    //             break;
    //     }
    // }

    private void translate() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(getViewBinding().btnTranslate, "translationX", 0, 500, 200);
        objectAnimator.setDuration(3000);
        objectAnimator.start();

    }

    private void rotate() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(getViewBinding().btnRotate, "rotation", 0, 200, 300);
        objectAnimator.setDuration(3000);
        objectAnimator.start();

    }

    private void scale() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(getViewBinding().btnScale, "ScaleX", 0f, 0.5f, 1.1f);
        objectAnimator.setDuration(3000);
        objectAnimator.start();

    }

    private void alpha() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(getViewBinding().btnAlpha, "Alpha", 0, 0.5f, 1f);
        objectAnimator.setDuration(3000);
        objectAnimator.start();
    }

    private void custom() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(getViewBinding().progressView, "progress", 0, 90);
        objectAnimator.setDuration(5000);
        objectAnimator.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimator.start();

        objectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        objectAnimator.addListener(new AnimatorListenerAdapter() {
            //            @Override
            //            public void onAnimationStart(Animator animation) {
            //                super.onAnimationStart(animation);
            //            }
        });
    }

    private void animatorSet() {

        //        AnimatorSet.playTogether(Animator... anim) ???  ???????????????????????????
        //        AnimatorSet.playSequentially(Animator... anim) ???  ???????????????????????????

        //        AnimatorSet.play(Animator anim)   ?????????????????????
        //        AnimatorSet.after(long delay)   ????????????????????????x???????????????
        //        AnimatorSet.with(Animator anim)   ????????????????????????????????????????????????
        //        AnimatorSet.after(Animator anim)   ??????????????????????????????????????????????????????
        //        AnimatorSet.before(Animator anim) ???  ???????????????????????????????????????????????????

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int widthPixels = displayMetrics.widthPixels;

        ObjectAnimator translationX = ObjectAnimator.ofFloat(getViewBinding().btnSet, "translationX", 0, widthPixels);
        ObjectAnimator rotation = ObjectAnimator.ofFloat(getViewBinding().btnSet, "rotation", 0, 360);
        ObjectAnimator alpha = ObjectAnimator.ofFloat(getViewBinding().btnSet, "alpha", 1, 0, 1);

        AnimatorSet animatorSet = new AnimatorSet();

        //        animatorSet.playTogether(translationX,rotation,alpha);
        //        animatorSet.playSequentially();

        animatorSet.play(rotation).with(alpha).before(translationX);

        animatorSet.setDuration(5000);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();

    }

    private void keyFrame() {
        //?????????????????? ?????????????????? ???????????? ?????????????????? ???????????? ????????????????????????????????????0.5??????????????????progress??????100???
        Keyframe keyframe = Keyframe.ofFloat(0, 0);
        Keyframe keyframe1 = Keyframe.ofFloat(0.5f, 100);
        Keyframe keyframe2 = Keyframe.ofFloat(1, 80);
        PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe, keyframe1, keyframe2);
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(getViewBinding().progressView, holder);

        objectAnimator.setDuration(5000);
        objectAnimator.start();
    }

    private void viewProperty() {
        getViewBinding().btnViewProperty.animate().alpha(0).setDuration(2000).rotation(360).translationX(300);
    }

    private void xmlAnimator() {

        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.set_animator);
        animator.setDuration(5000);
        animator.setTarget(getViewBinding().btnXml);
        animator.start();

    }

    // @NotNull
    // @Override
    // public ActivityObjectAnimatorBinding initViewBinding() {
    //     return ActivityObjectAnimatorBinding.inflate(getLayoutInflater());
    // }
}
