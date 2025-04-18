package com.Collection;

import java.util.ArrayList;

class Vaccine {
    private int age;
    private float dosage;

    public Vaccine(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }
}

class VaccinationCamp {
    ArrayList<Vaccine> list = new ArrayList<>();

    public void assignVaccine() {
        for (Vaccine v : list) {
            if (v.getAge() >= 45) {
                v.setDosage(250);
            } else if (v.getAge() >= 20) {
                v.setDosage(200);
            } else {
                v.setDosage(100);
            }
        }
    }

    public float vaccineInjected() {
        float totalDosage = 0;
        for (int i = 0; i < list.size(); i++) {
            Vaccine v = list.get(i);
            totalDosage += v.getDosage();
        }
        return totalDosage;
    }

    public static void main(String[] args) {
        VaccinationCamp vc = new VaccinationCamp();
        vc.list.add(new Vaccine(49));
        vc.list.add(new Vaccine(26));
        vc.list.add(new Vaccine(19));

        vc.assignVaccine();
        System.out.println(vc.vaccineInjected());
    }
}
