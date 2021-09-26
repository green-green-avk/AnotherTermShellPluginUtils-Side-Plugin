package green_green_avk.anothertermshellpluginutils_side_plugin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Just a stub.
 * In order to substitute a relevant activity,
 * redefine it in the plugin's {@code AndroidManifest.xml} in the next manner:
 * <pre>{@code <activity-alias
 * android:name="green_green_avk.anothertermshellpluginutils_side_plugin.ShowInfoActivity"
 * android:targetActivity=".AboutActivity"
 * tools:node="merge"
 * tools:replace="android:targetActivity" />
 * <activity
 * android:name="green_green_avk.anothertermshellpluginutils_side_plugin.ShowInfoStubActivity"
 * tools:node="remove" />}</pre>
 */
public final class ShowInfoStubActivity extends Activity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView view = new TextView(this);
        view.setGravity(Gravity.CENTER);
        view.setText("...");
        setContentView(view);
        try {
            startActivity(new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).setData(
                    Uri.fromParts("package", getPackageName(), null)));
            finish();
        } catch (final Exception ignored) {
        }
    }
}
