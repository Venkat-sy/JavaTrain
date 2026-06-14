/*
1115. Print FooBar Alternately (Building H2O variation)
There are two kinds of threads: oxygen and hydrogen. Your goal is to group these threads to form water molecules.
Input: water = "HOH"
Output: "HHO"
Explanation: Two hydrogen threads and one oxygen thread will output HHO.
*/
﻿import java.util.concurrent.Semaphore;
public class BuildingH2O {
    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);

    public BuildingH2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire();
        releaseHydrogen.run();
        if (h.availablePermits() == 0) {
            o.release();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire();
        releaseOxygen.run();
        h.release(2);
    }
}
