package com.example.intenttask3java;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    String name;
    String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    protected User(Parcel in) {
        name = in.readString();
        lastName = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
