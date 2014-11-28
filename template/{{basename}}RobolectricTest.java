import android.app.Activity;
import android.os.Bundle;
import java.util.Random;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.segment.analytics.TestUtils.IdentifyPayloadBuilder;
import static com.segment.analytics.TestUtils.ScreenPayloadBuilder;
import static com.segment.analytics.TestUtils.TrackPayloadBuilder;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;

{{#staticClass}}
import static org.powermock.api.mockito.PowerMockito.verifyNoMoreInteractions;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;
{{/staticClass}}

@RunWith(RobolectricTestRunner.class) @Config(emulateSdk = 18, manifest = Config.NONE)
{{#staticClass}}
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*" })
@PrepareForTest({{staticClassName}}.class)
{{/staticClass}}
public class {{pascalcase basename}}RobolectricTest extends AbstractIntegrationTest {
  {{#staticClass}}
  @Rule public PowerMockRule rule = new PowerMockRule();
  {{/staticClass}}
  {{pascalcase basename}}Integration integration;

  @Before public void setUp() {
    super.setUp();
    {{#staticClass}}
    PowerMockito.mockStatic({{staticClassName}}.class);
    {{/staticClass}}
    integration = new {{pascalcase basename}}Integration();
  }

  @Test @Override public void initialize() {
    integration.initialize(context, new JsonMap(), true);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify the integration was initialized with the right arguments
  }

  @Test @Override public void activityCreate() {
    Activity activity = mock(Activity.class);
    Bundle bundle = mock(Bundle.class);
    integration.onActivityCreated(activity, bundle);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityCreate}}
    // TODO: verify that the onActivityCreated method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityCreate}}
  }

  @Test @Override public void activityStart() {
    Activity activity = mock(Activity.class);
    integration.onActivityStarted(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityStart}}
    // TODO: verify that the onActivityStarted method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityStart}}
  }

  @Test @Override public void activityResume() {
    Activity activity = mock(Activity.class);
    integration.onActivityResumed(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityResume}}
    // TODO: verify that the onActivityResumed method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityResume}}
  }

  @Test @Override public void activityPause() {
    Activity activity = mock(Activity.class);
    integration.onActivityPaused(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityPause}}
    // TODO: verify that the onActivityPaused method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityPause}}
  }

  @Test @Override public void activityStop() {
    Activity activity = mock(Activity.class);
    integration.onActivityStopped(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityStop}}
    // TODO: verify that the onActivityStopped method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityStop}}
  }

  @Test @Override public void activitySaveInstance() {
    Activity activity = mock(Activity.class);
    Bundle bundle = mock(Bundle.class);
    integration.onActivitySaveInstanceState(activity, bundle);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activitySaveInstance}}
    // TODO: verify that the onActivitySaveInstanceState method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activitySaveInstance}}
  }

  @Test @Override public void activityDestroy() {
    Activity activity = mock(Activity.class);
    integration.onActivityDestroyed(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#activityDestroy}}
    // TODO: verify that the onActivityDestroyed method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/activityDestroy}}
  }

  @Test @Override public void track() {
    integration.track(new TrackPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#track}}
    // TODO: verify that the track method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/track}}
  }

  @Test @Override public void alias() {
    integration.flush(new FlushPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#alias}}
    // TODO: verify that the alias method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/alias}}
  }

  @Test @Override public void identify() {
    integration.identify(new IdentifyPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#identify}}
    // TODO: verify that the identify method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/identify}}
  }

  @Test @Override public void group() {
    integration.group(new GroupPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#group}}
    // TODO: verify that the group method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/group}}
  }

  @Test @Override public void screen() {
    integration.screen(new ScreenPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#screen}}
    // TODO: verify that the screen method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/screen}}
  }

  @Test @Override public void flush() {
    integration.flush();
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    {{#flush}}
    // TODO: verify that the flush method of the integration was called
    {{else}}
    // TODO: verify that there were no interactions with the integration
    {{/flush}}
  }
}
