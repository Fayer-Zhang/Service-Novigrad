package team.returnteamname.servicenovigrad.activities;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

import team.returnteamname.servicenovigrad.account.AccountManager;

public class OnItemSelectedListener extends Activity implements AdapterView.OnItemSelectedListener
{

    @Override
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        if (AccountManager.getInstance().isInitialized()){}
        parent.getItemAtPosition(pos).toString();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
