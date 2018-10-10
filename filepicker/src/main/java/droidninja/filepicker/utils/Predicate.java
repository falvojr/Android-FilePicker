package droidninja.filepicker.utils;

import android.support.annotation.NonNull;

public interface Predicate<T> {

    boolean apply(@NonNull T t);
}