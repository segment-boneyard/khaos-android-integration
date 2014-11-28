package com.segment.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

class {{pascalcase basename}}Integration extends AbstractIntegration<Void> {
  static final String {{uppercase basename}}_KEY = "{{pascalcase basename}}";

  @Override void initialize(Context context, JsonMap settings, boolean debuggingEnabled)
      throws IllegalStateException {
    // TODO: initialize the integration here
  }

  @Override String key() {
    return {{uppercase basename}}_KEY;
  }

  {{#activityCreate}}
  @Override void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    // TODO: call integration's Activity created method
  }
  {{/activityCreate}}

  {{#activityStart}}
  @Override void onActivityStarted(Activity activity) {
    // TODO: call integration's Activity started method
  }
  {{/activityStart}}

  {{#activityResume}}
  @Override void onActivityResumed(Activity activity) {
    // TODO: call integration's Activity resumed method
  }
  {{/activityResume}}

  {{#activityPause}}
  @Override void onActivityPaused(Activity activity) {
    // TODO: call integration's Activity paused method
  }
  {{/activityPause}}

  {{#activityStop}}
  @Override void onActivityStopped(Activity activity) {
    // TODO: call integration's Activity stopped method
  }
  {{/activityStop}}

  {{#activitySaveInstance}}
  @Override void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    // TODO: call integration's Activity save instance method
  }
  {{/activitySaveInstance}}

  {{#activityDestroy}}
  @Override void onActivityDestroyed(Activity activity) {
    // TODO: call integration's Activity destroyed method
  }
  {{/activityDestroy}}

  {{#identify}}
  @Override void identify(IdentifyPayload identify) {
    // TODO: call integration's identify method
  }
  {{/identify}}

  {{#group}}
  @Override void group(GroupPayload group) {
    // TODO: call integration's group method
  }
  {{/group}}

  {{#track}}
  @Override void track(TrackPayload track) {
    // TODO: call integration's track method
  }
  {{/track}}

  {{#alias}}
  @Override void alias(AliasPayload alias) {
    // TODO: call integration's alias method
  }
  {{/alias}}

  {{#screen}}
  @Override void screen(ScreenPayload screen) {
    // TODO: call integration's screen method
  }
  {{/screen}}

  {{#flush}}
  @Override void flush() {
    // TODO: call integration's flush method
  }
  {{/flush}}
}
