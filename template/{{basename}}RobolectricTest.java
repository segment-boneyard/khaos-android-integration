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
import static org.powermock.api.mockito.PowerMockito.verifyNoMoreInteractions;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

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
    // TODO: verify that the integration is initialized correcly
  }

  @Test @Override public void activityCreate() {
    Activity activity = mock(Activity.class);
    Bundle bundle = mock(Bundle.class);
    integration.onActivityCreated(activity, bundle);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activityStart() {
    Activity activity = mock(Activity.class);
    integration.onActivityStarted(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activityResume() {
    Activity activity = mock(Activity.class);
    integration.onActivityResumed(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activityPause() {
    Activity activity = mock(Activity.class);
    integration.onActivityPaused(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activityStop() {
    Activity activity = mock(Activity.class);
    integration.onActivityStopped(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activitySaveInstance() {
    Activity activity = mock(Activity.class);
    Bundle bundle = mock(Bundle.class);
    integration.onActivitySaveInstanceState(activity, bundle);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void activityDestroy() {
    Activity activity = mock(Activity.class);
    integration.onActivityDestroyed(activity);
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void track() {
    integration.track(new TrackPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void alias() {
    integration.flush(new FlushPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void identify() {
    integration.identify(new IdentifyPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void group() {
    integration.group(new GroupPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void screen() {
    integration.screen(new ScreenPayloadBuilder().build());
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }

  @Test @Override public void flush() {
    integration.flush();
    {{#staticClass}}
    verifyStatic();
    {{/staticClass}}
    // TODO: verify that Integration’s SDK was called
  }
}
