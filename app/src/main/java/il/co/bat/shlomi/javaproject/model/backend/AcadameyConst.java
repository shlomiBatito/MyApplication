package il.co.bat.shlomi.javaproject.model.backend;

import android.content.ContentValues;
import android.location.Location;

import java.sql.Time;

import il.co.bat.shlomi.javaproject.model.entities.Ride;
import il.co.bat.shlomi.javaproject.model.entities.TypeOfRide;

public class AcadameyConst {
    public static class RideConst {

             public static final String TYPEOFRIDE="typeOfRide";
             public static final String STARTLOCATION="startLocation";
             public static final String ENDLOCATION="endLocation";
             public static final String STARTTIME="startTime";
             public static final String ENDTIME="endTime";
             public static final String NAME = "name";
             public static final  String CELNUMBER ="celnumber";
             public static final String EMAIL="email";
           }
    public static ContentValues CourseToContentValues(Ride ride) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AcadameyConst.RideConst.TYPEOFRIDE, ride.getTypeOfRide());
        contentValues.put(AcadameyConst.RideConst.STARTLOCATION, ride.getStartLocation());
        contentValues.put(AcadameyConst.RideConst.ENDLOCATION, ride.getEndLocation());
        contentValues.put(AcadameyConst.RideConst.STARTTIME, ride.getStartTime());
        contentValues.put(AcadameyConst.RideConst.ENDTIME, ride.getEndTime());
        contentValues.put(AcadameyConst.RideConst.NAME, ride.getName());
        contentValues.put(AcadameyConst.RideConst.CELNUMBER, ride.getCelNumber());
        contentValues.put(AcadameyConst.RideConst.EMAIL, ride.getEmail());
        return contentValues;
         }
    public static Ride ContentValuesToStudent(ContentValues contentValues) {
        Ride ride = new Ride();
        ride.setTypeOfRide(contentValues.geta(RideConst.TYPEOFRIDE));
        ride.setStartLocation(contentValues.getAsString(RideConst.STARTLOCATION));
        ride.setEndLocation(contentValues.getAsString(RideConst.ENDLOCATION));
        ride.setStartTime(contentValues.getAsLong(RideConst.STARTTIME));
        ride.setEndTime(contentValues.getAsTime(RideConst.ENDTIME));
        ride.setName(contentValues.getAsString(RideConst.NAME);
        ride.setCelNumber(contentValues.getAsInteger(RideConst.CELNUMBER));
        ride.setEmail(contentValues.getAsString(RideConst.EMAIL));
        return ride;
    }
}
