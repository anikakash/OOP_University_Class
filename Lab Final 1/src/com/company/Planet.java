package com.company;

class Sun_Orbit {
}
class CalestialBody{
    private int mass;
    private String shape;
    private Sun_Orbit S;
    CalestialBody(int m,String sh,Sun_Orbit s){
        mass = m;
        shape = sh;
        S=s;
    }
}
class SmallSolarSystemBodies{
    private Sun_Orbit S;
    SmallSolarSystemBodies(Sun_Orbit s){
        S=s;
    }
}
class Planet extends CalestialBody{

    Planet(int m, String sh, Sun_Orbit s) {
        super(m, sh, s);
    }
    public void overcomeRigidBody(){
        System.out.println("overcomeRigidBody");
    }
    public void neighbourhood(){
        System.out.println("neighbourhood");
    }
}
class DwarfPlanet extends CalestialBody{

    DwarfPlanet(int m, String sh, Sun_Orbit s) {
        super(m, sh, s);
    }
    public void overcomeRigidBody(){
        System.out.println("overcomeRigidBody1");
    }
    public void neighbourhood(){
        System.out.println("neighbourhood2");
    }
}


