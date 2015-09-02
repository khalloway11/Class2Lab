/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Keiji
 */
public class WelcomeService {
    private static Calendar now;
    private long hour;
    private String welcome;
    
    public WelcomeService(){
        now = Calendar.getInstance();
        hour = now.HOUR_OF_DAY;
        welcome = "";
    }

    public static Calendar getNow() {
        return now;
    }

    public static void setNow(Calendar now) {
        WelcomeService.now = now;
    }

    public long getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
    
    private void setGreeting(){
        if((0 <= hour) && (hour < 12)){
            //good morning
            welcome = "Good Morning, ";
        } else if((12 <= hour) && (hour < 17)){
            //good afternoon
            welcome = "Good Afternoon, ";
        } else {
            //good evening
            welcome = "Good Evening, ";
        }
    }
    
    public void createFullWelcome(String name){
        this.setGreeting();
        welcome += name + "! Welcome!";
    }
}
