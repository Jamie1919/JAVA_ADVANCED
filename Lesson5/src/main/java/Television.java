/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaypr
 */
public class Television extends ElectronicDevice {

    @Override
    public void turnOn() {
        intializeScreen();
        changeChannel(1);
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Turn off");
    }

    

    private void changeChannel(int channel) {
        System.out.println("Channel Changed to " + channel);  
    }

    private void intializeScreen() {
        System.out.println("Tv turned on");
    }
    
 
    
}
