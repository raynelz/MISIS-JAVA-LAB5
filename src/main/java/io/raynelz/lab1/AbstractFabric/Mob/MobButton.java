package io.raynelz.lab1.AbstractFabric.Mob;


import io.raynelz.lab1.AbstractFabric.Button;

public class MobButton implements Button {
    public void render() {
        System.out.println("render MobButton");
    }

    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}
