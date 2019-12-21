package com.example.booktobook;

public interface CustomDialogListener {
    void onPostiveClicked(String sender, String receiver, String time, String location, String alarm);
    void onNegativeClicked();
    void onTimeClicked();
    void onLocationClicked();


}
