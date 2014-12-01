
# khaos-android-integration

  A [khaos][khaos] template for creating new Android integrations.

[khaos]: https://github.com/segmentio/khaos

## Usage

    $ goto segmentio/integrations
    $ cd lib/
    $ khaos segmentio/khaos-android-integration Mixpanel

This will create a folder Mixpanel, with the files `MixpanelIntegration.java` and `MixpanelRobolectricTest.java`. Copy the first file [into the source directory](https://github.com/segmentio/analytics-android/tree/master/core/src/main/java/com/segment/analytics) and the second (the test file) [into the test directory](https://github.com/segmentio/analytics-android/tree/master/core/src/androidTest/java/com/segment/analytics).

Declare the dependency for the integration SDK [in the root build.gradle file](https://github.com/segmentio/analytics-android/blob/master/build.gradle#L40). If it's a JAR, you'll have to copy the JAR into the [libs folder](https://github.com/segmentio/analytics-android/tree/master/libs). Make sure you add the version number to the JAR so we can see what version of the integration we're using.
Once you've added the dependency, you'll have to add it to the [core module](https://github.com/segmentio/analytics-android/blob/master/core/build.gradle#L12) and the [all module](https://github.com/segmentio/analytics-android/blob/master/all/build.gradle#L6).

Run `./gradlew clean build` verify everything is setup correctly!

## License

The MIT License

Copyright &copy; 2014, Segment &lt;friends@segment.com&gt;

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

