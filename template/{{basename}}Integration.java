package com.segment.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

class {{pascalcase basename}}Integration extends AbstractIntegration<Void> {
  static final String {{uppercase basename}}_KEY = "{{key}}";

  @Override void initialize(Context context, JsonMap settings, boolean debuggingEnabled)
      throws IllegalStateException {
    // todo: initialize the integration here
  }

  @Override String key() {
    return {{uppercase basename}}_KEY;
  }

  {{#activityCreate}}
  @Override void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    // todo: call integration's Activity created method
  }
  {{/activityCreate}}

  {{#activityStart}}
  @Override void onActivityStarted(Activity activity) {
    // todo: call integration's Activity started method
  }
  {{/activityStart}}

  {{#activityResume}}
  @Override void onActivityResumed(Activity activity) {
    // todo: call integration's Activity resumed method
  }
  {{/activityResume}}

  {{#activityPause}}
  @Override void onActivityPaused(Activity activity) {
    // todo: call integration's Activity paused method
  }
  {{/activityPause}}

  {{#activityStop}}
  @Override void onActivityStopped(Activity activity) {
    // todo: call integration's Activity stopped method
  }
  {{/activityStop}}

  {{#activitySaveInstance}}
  @Override void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    // todo: call integration's Activity save instance method
  }
  {{/activitySaveInstance}}

  {{#activityDestroy}}
  @Override void onActivityDestroyed(Activity activity) {
    // todo: call integration's Activity destroyed method
  }
  {{/activityDestroy}}

  {{#identify}}
  @Override void identify(IdentifyPayload identify) {
    // todo: call integration's identify method
  }
  {{/identify}}

  {{#group}}
  @Override void group(GroupPayload group) {
    // todo: call integration's group method
  }
  {{/group}}

  {{#track}}
  @Override void track(TrackPayload track) {
    // todo: call integration's track method
  }
  {{/track}}

  {{#alias}}
  @Override void alias(AliasPayload alias) {
    // todo: call integration's alias method
  }
  {{/alias}}}

  {{#screen}}
  @Override void screen(ScreenPayload screen) {
    // todo: call integration's screen method
  }
  {{/screen}}

  {{#flush}}
  @Override void flush() {
    // todo: call integration's flush method
  }
  {{/flush}}
}
