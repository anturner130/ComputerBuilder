package comp640.computerbuilder.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import comp640.computerbuilder.fragments.CartFragment;
import comp640.computerbuilder.R;

/*
* Activity that handles all fragments that use the menu
*
*/
public class MenuActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FrameLayout mContentFrame;

    private static final String STATE_SELECTED_POSITION = "selected_navigation_drawer_position";

    private boolean mFromSavedInstanceState;
    private int mCurrentSelectedPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mCurrentSelectedPosition = savedInstanceState.getInt(STATE_SELECTED_POSITION);
            mFromSavedInstanceState = true;
        }

        //Set the content View to the default view
        setContentView(R.layout.activity_menu);

        //Link views to objects
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mContentFrame = (FrameLayout) findViewById(R.id.nav_contentframe);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.nav_drawer);

        //Set Up the toolbar
        setUpToolbar();

        //Set up the navigation drawer
        setUpNavDrawer();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_SELECTED_POSITION, mCurrentSelectedPosition);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCurrentSelectedPosition = savedInstanceState.getInt(STATE_SELECTED_POSITION, 0);
        Menu menu = mNavigationView.getMenu();
        menu.getItem(mCurrentSelectedPosition).setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    private void setUpToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set the title of the toolbar to the current selection
        if (mToolbar != null) {
            mToolbar.setTitle(getResources().getStringArray(R.array.drawer_items)[mCurrentSelectedPosition]);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            mToolbar.setNavigationIcon(R.mipmap.ic_hamburger);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDrawerLayout.openDrawer(GravityCompat.START);
                }
            });
        }
    }

    private void setUpNavDrawer() {
        //Listener that handles when the user selects an item
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                android.support.v4.app.Fragment frag = null;
                menuItem.setChecked(true);
                switch (menuItem.getItemId()) {
                    case R.id.navigation_item_1:
                        //frag = new ProfileFragment();
                        mCurrentSelectedPosition = 0;
                        break;
                    case R.id.navigation_item_2:
                        //frag = new NewBuildFragment();
                        mCurrentSelectedPosition = 1;
                        break;
                    case R.id.navigation_item_3:
                        //frag = new SavedBuildsFragment();
                        mCurrentSelectedPosition = 2;
                        break;
                    case R.id.navigation_item_4:
                        frag = new CartFragment();
                        mCurrentSelectedPosition = 3;
                        break;
                    case R.id.navigation_item_5:
                        //frag = new SettingsFragment();
                        mCurrentSelectedPosition = 4;
                        break;
                    case R.id.navigation_item_6:
                        //frag = new HelpFragment()
                        mCurrentSelectedPosition = 5;
                        break;
                    case R.id.navigation_item_7:
                        //Logout
                        mCurrentSelectedPosition = 6;
                        break;
                    default:
                        break;
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);
                mToolbar.setTitle(getResources().getStringArray(R.array.drawer_items)[mCurrentSelectedPosition]);
                if (frag!=null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.nav_contentframe, frag).commit();
                }

                return true;
            }
        });

    }


}