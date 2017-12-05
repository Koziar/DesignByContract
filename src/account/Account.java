
/*
    http://www.openjml.org/
    about OpenJML (ESC) - A JML program verification tool (Extended Static Checking)
    OpenJML is a program verification tool for Java programs that allows you to check
    the specifications of programs annotated in the Java Modeling Language.
 */

package account;

import java.io.IOException;

public class Account {
    private /*@ spec_public @*/ double bal;
    //@ public invariant bal >= 0;
    /*@ requires amt >= 0;
    @ assignable bal;
    @ ensures bal == amt; @*/
    public Account(double amt) {
        bal = amt;
    }

    //@ ensures \result == bal;
    public /*@ pure @*/ double getBalance() {
        return bal;
    } //A method without side-effects is called pure.

    /*@ requires amt > 0;
    @ assignable bal;
    @ ensures bal == \old(bal) + amt; @*/
    public void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
    }

    /*@ requires amt > 0 && amt <= bal;
    @ assignable bal;
    @ ensures bal == \old(bal) - amt; @*/
    public void withdraw(double amt) throws IOException {
        if (bal > amt) {
            bal -= amt;
            System.out.println("Withdrawal of: " + amt);
        } else {
            throw new IOException();
        }
    }


}
