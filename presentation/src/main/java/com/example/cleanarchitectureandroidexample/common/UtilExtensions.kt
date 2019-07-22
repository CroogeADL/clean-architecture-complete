package com.example.cleanarchitectureandroidexample.common

import android.content.Context
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.snackbar.Snackbar

fun <T : ViewModel> FragmentActivity.obtainViewModel(cls: Class<T>): T {
    return ViewModelProviders.of(this).get(cls)
}

fun <T : ViewModel> Fragment.obtainViewModel(cls: Class<T>): T {
    return ViewModelProviders.of(this).get(cls)
}

fun <T> LifecycleOwner.observeCommand(data: LiveData<T>, action: (T) -> Unit) {
    data.observe(this, Observer(action))
}

fun View.showMessage(@StringRes resId: Int) {
    Snackbar.make(this, resId, Snackbar.LENGTH_SHORT).show()
}

fun View.showMessage(
    message: String, @StringRes action: Int, @ColorInt color: Int,
    onButtonClicked: () -> Unit
) {
    Snackbar.make(this, message, Snackbar.LENGTH_LONG)
        .setAction(action) { onButtonClicked() }
        .setActionTextColor(color)
        .show()
}

fun View.showMessage(
    @StringRes messageResId: Int, @StringRes action: Int, @ColorInt color: Int,
    onButtonClicked: () -> Unit
) {
    Snackbar.make(this, messageResId, Snackbar.LENGTH_LONG)
        .setAction(action) { onButtonClicked() }
        .setActionTextColor(color)
        .show()
}

fun View.showMessage(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()
}

fun Context.convertToPx(dp: Float) = dp * resources.displayMetrics.density

fun Context.convertToDp(px: Float) = px / resources.displayMetrics.density