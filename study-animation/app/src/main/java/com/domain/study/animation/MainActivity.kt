package com.domain.study.animation

import android.os.Bundle
import com.domain.study.animation.base.BaseBindingActivity
import com.domain.study.animation.databinding.ActivityMainBinding
import com.domain.study.animation.property.PropertyActivity
import com.domain.study.animation.tween.TweenActivity

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    // @JvmField
    // @BindView(R.id.tv_frame)
    // var tvFrame: TextView? = null
    //
    // @JvmField
    // @BindView(R.id.tv_tween)
    // var tvTween: TextView? = null
    //
    // @JvmField
    // @BindView(R.id.tv_property)
    // var tvProperty: TextView? = null

    // override fun setLayoutId(): Int {
    //     return R.layout.activity_main
    // }

    // override fun initView() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding.tvFrame.setOnClickListener { start(this@MainActivity, FrameActivity::class.java) }
        viewBinding.tvTween.setOnClickListener { start(this@MainActivity, TweenActivity::class.java) }
        viewBinding.tvProperty.setOnClickListener { start(this@MainActivity, PropertyActivity::class.java) }
    }

    // override fun initViewBinding(): ActivityMainBinding {
    //     return ActivityMainBinding.inflate(layoutInflater)
    // }

    // @OnClick(R.id.tv_frame, R.id.tv_tween, R.id.tv_property)
    // fun onViewClicked(view: View) {
    //     when (view.id) {
    //         R.id.tv_frame -> FrameActivity.start(this)
    //         R.id.tv_tween -> TweenActivity.start(this)
    //         R.id.tv_property -> PropertyActivity.start(this)
    //     }
    // }
}