package il.co.bat.shlomi.javaproject.model.datasource;

import android.content.ContentValues;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import il.co.bat.shlomi.javaproject.model.backend.DB_manager;
import il.co.bat.shlomi.javaproject.model.entities.Ride;


public class List_DBManger implements DB_manager {
    static List<Ride> rides;
    static {
        rides=new ArrayList<>();
    }
    /*FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
    HashMap<String,Object> mop = new HashMap();*/

    // @Override
   /*  public int addStudent(ContentValues values) {
       Ride ride=ContentValuesToRide(values);
        rides.add(ride);
        return ride.getCelNumber();

    }*/

    @Override
    public int addStudent(ContentValues ride) {
        return 0;
    }

    @Override
    public List<Ride> getRides() {
        return rides;
    }
}
