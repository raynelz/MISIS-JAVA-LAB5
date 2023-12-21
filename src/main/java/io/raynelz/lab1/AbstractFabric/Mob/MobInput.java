package io.raynelz.lab1.AbstractFabric.Mob;


import io.raynelz.lab1.AbstractFabric.Input;

public class MobInput implements Input {
    private String value;

    public Input value(String value) {
        this.value = value;
        return this;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(
                String.format("render MobInput. With value %s", value)
        );
    }
}
