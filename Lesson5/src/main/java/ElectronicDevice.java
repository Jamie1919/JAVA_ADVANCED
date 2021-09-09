/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaypr
 */
public abstract class ElectronicDevice {

    public abstract void turnOn();

    public abstract void turnOff();

    public void setState(PowerState state) {
        switch (state) {
            case OFF:
                System.out.println(state.getDescription());
                break;
            case ON:
                System.out.println("Powerstate.ON");
                break;
            case SUSPEND:
                System.out.println("Powerstate.SUSPEND");
                break;
            default:
                System.out.println("Tv in not being used");
        }
    }
}
