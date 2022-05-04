/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Zavod {
    private ArrayList<Zavodnik> zavodnik;
    private String nameZavod;
    
    public void loadStart(File startFile) throws FileNotFoundException, IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(startFile))){
        String line,firstName,lastName, dob;
        //int dob;
        char gender;
        String[]parts;
        Zavodnik r;
        br.readLine(); //preskocim hlavicku
        while((line = br.readLine()) !=null){
            parts = line.split("[ ]+");
            firstName = parts[0];
            lastName = parts[1];
            //dob = Integer.parseInt(parts[2]);
            dob = parts[2];
            r = new Zavodnik(firstName,lastName);
            r.setDob(dob);
            gender = parts[3].charAt(0);
            zavodnik.add(r);
        }
        }
    }
    
    public void loadFinish(File finishFile) throws FileNotFoundException, IOException{
        try(Scanner in = new Scanner(finishFile)){
        in.nextLine();   
            while(in.hasNext()){
                int number = in.nextInt();
                finishTime = in.next();
                findRunner(number).setEndTime(finishTime);
            }
        }
    }    
    public static final Collator co1 = Collator.getInstance(new Locale("cs", "CZ"));
    //public static final Comparator<Zavodnik> COMP_BY_NAME = (Zavodnik r1,Zavodnik r2)-> r1.getSurname().compareTo(r2.getSurname());
    //public static final Comparator<Zavodnik> COMP_BY_NAME = (Zavodnik r1,Zavodnik r2)-> co1.compare(r1.getSurname(),r2.getSurname());
//    public static final Comparator<Zavodnik> COMP_BY_NAME = (Zavodnik r1, Zavodnik r2) ->(
//        int value = co1.compare(r1.getSurname(), r2.getSurname());
//            
    public Zavod(String nameZavod){
        this.nameZavod = nameZavod;
        zavodnik = new ArrayList<>();
    }
    
    public void registerZavodnik(String name,String surname){
        Zavodnik newRunner = new Zavodnik(name, surname);
        this.zavodnik.add(newRunner);
    }
    
    public void setZavodnikStartTime(int startTime){
        for (int i = 0; i < zavodnik.size(); i++) {
            zavodnik.get(i).setStartTime(startTime);         
        }
    }
    
    public void setZavodnikStartTimeOffset(int offset, int startTime){
        for (int i = 0; i < zavodnik.size(); i++) {
            zavodnik.get(i).setStartTime(startTime);      
        }
    }
    
    public void setZavodnikStartTime(int startNumber, int startTime){
        zavodnik.get(startNumber).setStartTime(startTime);
    }
    
//    public void setZavodnikFinishTime(int startNumber, int finishTime){
//        zavodnik.get(startNumber).setFinishTime(finishTime);
//    }
    
    public void removeZavodnik(int startNumber){
        //Zavodnik zavodnik = findZavodnik
        Zavodnik zavodnik = findZavodnik(startNumber);
        //boolean zavodnikRemoved = zavodnik.remove(zavodnik);
        
//        if(){
//            
//        }
    }
    
    public Zavodnik findZavodnik(int startNumber){
        for (int i = 0; i < zavodnik.size(); i++) {
            if (zavodnik.get(i).getStartNumber() == startNumber){
                return this.zavodnik.get(i);
            }
            
        }
        throw new NoSuchElementException("zavodnik not found.");
    }
    
    public ArrayList<Zavodnik> getZZavodnik(){
        ArrayList<Zavodnik> copy = new ArrayList<Zavodnik>();
        
        for (int i = 0; i < zavodnik.size(); i++) {
            copy.add(zavodnik.get(i).getZavodnik());
        }
        return copy;
    }
    
    public static void registrujZavodnik(){
        boolean keepRunning;
    }
    
    public ArrayList<Zavodnik> sortByName(){
        Collections.sort(zavodnik);
        return getZZavodnik();
    }
    
    private void sortBySurName(){
        Collections.sort(zavodnik);
    }
    
//    private void sortBySurName(){
//        Collections.sort(zavodnik,dfdf);
//    }
    
    private void sortByStartNumber(){
        Collections.sort(zavodnik, (Zavodnik o1,Zavodnik o2)-> o1.getFinalTime()-o2.getFinalTime());
    }
    
    
    private void sortByFinalTime(){
        ComparatorZavodnikByFinalTime cbft = new ComparatorZavodnikByFinalTime(); 
        Collections.sort(zavodnik,cbft);
    }
    
//    private void sortByZavodnik(){
//        Collections.sort(zavodnik, new Comparator<Zavodnik>());
//        public int compare(Zavodnik o1, Zavodnik o2){
//            return o1.getFinalTime() - o2.getFinalTime();
//        }
//    }
   
//    @Override
//    public String toString(){
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < zavodnik.size(); i++) {
//            builder.append(zavodnik.toString());
//            
//        }
//        return ;
//    }
    public static void main(String[] args) throws IOException {
        Zavod zavod = new Zavod("Run Czech");
        try{
        zavod.loadStart(new File("start.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Zadej znovu");
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println(zavod);
        
        zavod.loadFinish(new File("finish.txt"));
        System.out.println(zavod);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(zavod);
    }
    
}
