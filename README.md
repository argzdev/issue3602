# issue3602

### Prerequisite
- Add google-services.json
### How to use
- type ` adb shell setprop debug.firebase.analytics.app com.argz.issue3602` in the terminal window of Android Studio
- Use the debug mode when running the app
### Steps to reproduce
- Click `Send event with Id` button
- Open Firebase DebugView console and verify that the `select_item` event is received with the user property of `user_id` set.
- Click `Send event without Id` button

Actual Result
- `select_item` event is still received with user property of `user_id` set to `this_is_a_random_id`.

Expected Result
- With `setUserId(null)`, the `select_item` event should be received with user property of `user_id` equal to null.
