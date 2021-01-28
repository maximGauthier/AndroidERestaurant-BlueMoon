// Generated by view binder compiler. Do not edit!
package fr.isen.gauthier.androiderestaurant2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import fr.isen.gauthier.androiderestaurant2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView activityHomeDessert;

  @NonNull
  public final TextView activityHomeEntree;

  @NonNull
  public final TextView activityHomePlats;

  @NonNull
  public final TextView cocktails;

  @NonNull
  public final TextView guelles;

  @NonNull
  public final TextView homeTitle;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView textExplain;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView activityHomeDessert, @NonNull TextView activityHomeEntree,
      @NonNull TextView activityHomePlats, @NonNull TextView cocktails, @NonNull TextView guelles,
      @NonNull TextView homeTitle, @NonNull ImageView imageView3, @NonNull ImageView imageView4,
      @NonNull TextView textExplain) {
    this.rootView = rootView;
    this.activityHomeDessert = activityHomeDessert;
    this.activityHomeEntree = activityHomeEntree;
    this.activityHomePlats = activityHomePlats;
    this.cocktails = cocktails;
    this.guelles = guelles;
    this.homeTitle = homeTitle;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.textExplain = textExplain;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_home_dessert;
      TextView activityHomeDessert = rootView.findViewById(id);
      if (activityHomeDessert == null) {
        break missingId;
      }

      id = R.id.activity_home_entree;
      TextView activityHomeEntree = rootView.findViewById(id);
      if (activityHomeEntree == null) {
        break missingId;
      }

      id = R.id.activity_home_plats;
      TextView activityHomePlats = rootView.findViewById(id);
      if (activityHomePlats == null) {
        break missingId;
      }

      id = R.id.cocktails;
      TextView cocktails = rootView.findViewById(id);
      if (cocktails == null) {
        break missingId;
      }

      id = R.id.guelles;
      TextView guelles = rootView.findViewById(id);
      if (guelles == null) {
        break missingId;
      }

      id = R.id.home_title;
      TextView homeTitle = rootView.findViewById(id);
      if (homeTitle == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = rootView.findViewById(id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.text_explain;
      TextView textExplain = rootView.findViewById(id);
      if (textExplain == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, activityHomeDessert,
          activityHomeEntree, activityHomePlats, cocktails, guelles, homeTitle, imageView3,
          imageView4, textExplain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}