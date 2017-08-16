package fin.fin;


import android.support.annotation.NonNull;

public interface BasePresenter<T> {

    /**
     * Binds presenter with a view when resumed. The presenter will perform initialization here.
     *
     * @param view the view associated with this connectPresenter
     */
    void attach(@NonNull T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void detach();

}