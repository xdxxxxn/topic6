package com.sibsutis.devices;

public class PersonalComputer extends Device {

    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

    @Override
    public void print() {
        System.out.println("PersonalComputer [id=" + id + ", price=" + price + ", ip=" + ip + "]");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PersonalComputer that = (PersonalComputer) o;

        if (ip == null) {
            if (that.ip != null) return false;
        } else {
            if (!ip.equals(that.ip)) return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result;
        if (ip != null) {
            result = result + ip.hashCode();
        } else {
            result = result + 0;
        }
        return result;
    }
}
