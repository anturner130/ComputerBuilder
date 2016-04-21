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

import java.util.HashMap;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.dummy.DummyContent;
import comp640.computerbuilder.fragments.AddBuildFragment;
import comp640.computerbuilder.fragments.CBFragment;
import comp640.computerbuilder.fragments.CartFragment;
import comp640.computerbuilder.R;
import comp640.computerbuilder.fragments.HelpFragment;
import comp640.computerbuilder.fragments.PartListFragment;
import comp640.computerbuilder.fragments.SavedBuildsListFragment;
import comp640.computerbuilder.fragments.SettingsFragment;
import comp640.computerbuilder.fragments.listeners.OnSubfragmentListener;
import comp640.computerbuilder.model.build.Build;

/*
* Activity that handles all fragments that use the menu
*
*/
public class MenuActivity extends AppCompatActivity
        implements PartListFragment.OnListFragmentInteractionListener,
        SavedBuildsListFragment.OnListFragmentInteractionListener,
        OnSubfragmentListener{

    private Toolbar _toolbar;
    private DrawerLayout _drawerLayout;
    NavigationView _navigationView;
    FrameLayout _contentFrame;
    CBFragment _fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content View to the default view
        setContentView(R.layout.activity_menu);

        //Link views to objects
        _navigationView = (NavigationView) findViewById(R.id.nav_view);
        _contentFrame = (FrameLayout) findViewById(R.id.nav_contentframe);
        _drawerLayout = (DrawerLayout) findViewById(R.id.nav_drawer);

        //Set Up the toolbar
        setUpToolbar();

        //Set up the navigation drawer
        setUpNavDrawer();

        //Inflate the fragment
        inflateFragment(new SavedBuildsListFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        //Change Fragment based on current Fragment
        if(_fragment.getParentID()!= -1)
            selectFragmentFromResource(_fragment.getParentID());
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    /**
     * Sets up the toolbar
     */
    private void setUpToolbar() {
        _toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set the title of the toolbar to the current selection
        if (_toolbar != null) {
            setSupportActionBar(_toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            _toolbar.setNavigationIcon(R.mipmap.ic_hamburger);
            _toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    _drawerLayout.openDrawer(GravityCompat.START);
                }
            });
        }
    }

    /**
     * Sets up the item selected listener for the nav drawer
     */
    private void setUpNavDrawer() {
        //Listener that handles when the user selects an item
        _navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                selectFragmentFromResource(menuItem.getItemId());
                return true;
            }
        });
        _navigationView.getMenu().getItem(2).setChecked(true);
    }

    /**
     * Selects the fragment based on the given ID
     * @param id the resource id
     */
    private void selectFragmentFromResource(int id){
        CBFragment frag = null;
        switch (id) {
            case R.id.myProfile:
                //frag = new ProfileFragment();
                break;
            case R.id.newBuild:
                frag = new AddBuildFragment();
                break;
            case R.id.savedBuild:
                frag = new SavedBuildsListFragment();
                break;
            case R.id.myCart:
                frag = new CartFragment();
                break;
            case R.id.settings:
                frag = new SettingsFragment();
                break;
            case R.id.help:
                frag = new HelpFragment();
                break;
            case R.id.logOut:
                DataController.getController().getUser().logOut();
                this.finish();
                break;
            default:
                break;
        }
        inflateFragment(frag);
    }


    private void inflateFragment(CBFragment fragment){
        if (fragment!=null) {
            _drawerLayout.closeDrawer(GravityCompat.START);
            _toolbar.setTitle(fragment.getTitle());
            if(fragment.getIndex()!= -1)
                _navigationView.getMenu().getItem(fragment.getIndex()).setChecked(true);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.nav_contentframe, fragment).commit();
            invalidateOptionsMenu();
            fragment.setOnSubfragmentListener(this);
            _fragment = fragment;
        }
    }

    @Override
    public void onCreateSubfragment(CBFragment fragment) {
        inflateFragment(fragment);
    }

    @Override
    public void onRemoveSubfragment(CBFragment fragment) {
        selectFragmentFromResource(fragment.getParentID());
    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }

    @Override
    public void onListFragmentInteraction(Build item) {

    }

}