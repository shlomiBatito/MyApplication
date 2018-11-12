package il.co.bat.shlomi.javaproject.model.backend;

import android.content.ContentValues;

import java.util.List;

import il.co.bat.shlomi.javaproject.model.entities.Ride;

public interface DB_manager {
    int addStudent(ContentValues ride);
    List<Ride> getRides();
}
