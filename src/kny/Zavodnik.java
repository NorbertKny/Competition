/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

/**
 *
 * @author norbert.roland.kny
 */
public class Zavodnik {
    private String name;
    private String surname;
    
    private int startNumber;
    private int startTime;
    private int finishTime;
    private int finalTime;
    
    private String currentRace;
    private int yearOfBirth;
    private String sex;
    private String club;
    private int wave;
    private boolean tax;
    private int rank;
    
    public Zavodnik(String name,String surname){
        this.name = name;
        this.surname = surname;
//        this.yearOfBirth = yearOfBirth;
//        this.startNumber = startNumber;
//        this.startTime = startTime;
//        this.finishTime = finishTime;
    }
    //**************************************************************************
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getCurrentRace(){
        return currentRace;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getClub(){
        return club;
    }
    
    public int getStartNumber(){
        return startNumber;
    }
    
    public int getStartTime(){
        return startTime;
    }
    
    public int getFinishTime(){
        return finishTime;
    }
    
    public int getFinalTime(){
        return finalTime;
    }
    
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    
    public int getWave(){
        return wave;
    }
    
    public int getRank(){
        return rank;
    }
    
    public boolean getTax(){
        return tax;
    }
    //**************************************************************************
    public void setTax(boolean tax){
        this.tax = tax;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
     public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setCurrentRace(String currentRace){
        this.currentRace = currentRace;
    }
    
    public void setClub(String club){
        this.club = club;
    }
    
    public void setStartNumber(int startNumber){
        this.startNumber = startNumber;
    }
    
    public void setStartTime(int startTime){
        this.startTime = startTime;
    }
    
    public void setFinishTime(int finishTime){
        this.finishTime = finishTime;
    }
    
    public void setFinalTime(int finalTime){
        this.finalTime = finalTime;
    }
    
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setWave(int wave){
        this.wave = wave;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    
    
        
}
