package fin.fin;

/**
 * Rock on
 */

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * This takes the place of a subcomponent in the new 'dagger-android' system
 */

@Module
public abstract class ConnectBinder {
    /*
     * This is just shorthand for:
     *
     *      @Binds
     *      @IntoMap
     *      @FragmentKey(DetailFragment.class)
     *      abstract AndroidInjector.Factory<? extends Fragment> provideAttributesOverviewFragmentFactory(AttributesOverviewFragmentComponent.Builder builder);
     *
     * ....which is how you would define your subcomponent builder factory for dagger.
     *
     *
     * In this case "(modules = .class)" could be omitted because
     * the module is empty (dagger can figure out what it needs to provide to the fragment based
     * on the @Inject annotation on that fragment)
     *
     */
    @ContributesAndroidInjector(modules = ConnectModule.class)
    abstract ConnectFragment provideConnectFragmentFactory();
}