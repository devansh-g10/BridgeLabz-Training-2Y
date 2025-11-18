package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void accessFromDerived() {
        System.out.println("---- Inside Derived (Different Package) ----");
        // privateMethod();   // ❌ Not accessible (private)
        // defaultMethod();   // ❌ Not accessible (package-private)
        protectedMethod();    // ✅ Accessible (through inheritance)
        publicMethod();       // ✅ Accessible (public)
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.accessFromDerived();

        System.out.println("\n---- Accessing through Base reference ----");
        Base b = new Base();
        // b.protectedMethod(); // ❌ Not accessible through object (different package)
        b.publicMethod();        // ✅ Accessible
    }
}
