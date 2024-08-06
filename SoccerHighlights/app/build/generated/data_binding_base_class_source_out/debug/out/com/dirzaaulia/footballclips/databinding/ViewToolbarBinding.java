// Generated by view binder compiler. Do not edit!
package com.dirzaaulia.footballclips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dirzaaulia.footballclips.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewToolbarBinding implements ViewBinding {
  @NonNull
  private final AppBarLayout rootView;

  @NonNull
  public final MaterialToolbar toolbar;

  private ViewToolbarBinding(@NonNull AppBarLayout rootView, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public AppBarLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ViewToolbarBinding((AppBarLayout) rootView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
