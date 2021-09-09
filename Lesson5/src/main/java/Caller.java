/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaypr
 */
public class Caller {

    public static void main(String[] args) {
        ElectronicDevice dev1 = new Television();
        dev1.turnOn();
        dev1.setState(PowerState.ON);
    }

    public void setState(PowerState state) {
        switch (state) {
            case OFF:
                System.out.println("Powerstate.OFF");
                break;
            case ON:
                  System.out.println("Powerstate.ON");
                break;
            case SUSPEND:
                  System.out.println("Powerstate.SUSPEND");
                break;
            default:
                   System.out.println("There is no such state");
        }
    }
}
