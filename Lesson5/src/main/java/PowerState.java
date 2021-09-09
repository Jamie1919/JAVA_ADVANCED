/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaypr
 */
public enum PowerState {
    ON("The power is off"),
    OFF("The usage is high"),
    SUSPEND("The power usage is low");

    private String description;

    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }
}
