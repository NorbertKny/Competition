/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

/**
 *
 * @author norbert.roland.kny
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time(int hours,int minutes, int seconds){
        this.hours = hours;
        this.hours = hours;
        this.hours = hours;
    }
    public Time(int secondsInput){
        hours = secondsInput /3600;
        minutes = secondsInput / 60 % 60;
        seconds = secondsInput % 60;
    }
    public Time(String time){
        String[]arr = time.split(":");
        hours = Integer.parseInt(arr[0]);
        minutes = Integer.parseInt(arr[1]);
        seconds = Integer.parseInt(arr[2]);
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public int timeToSeconds(){
        return hours*3600 + minutes*60 + seconds;
    }
    public String timeToString(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
    public Time difference(Time t2){
        return new Time(t2.timeToSeconds() - this.timeToSeconds());
    }
}
