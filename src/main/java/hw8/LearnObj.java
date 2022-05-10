package hw8;

import java.util.ArrayList;
import java.util.List;

public class LearnObj extends Object {
    public String stringVal;
    public Integer intVal;
    public List<Integer> list;


    public LearnObj(String string, Integer integer, List<Integer> list) {
        this.stringVal = string;
        this.intVal = integer;
        this.list = list;
    }

    public LearnObj(String string, Integer integer) {
        this.stringVal = string;
        this.intVal = integer;
    }

    public LearnObj(String string) {
        this.stringVal = string;
    }

    public String getString() {
        return stringVal;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public List<Integer> getList() {
        return list;
    }

    public boolean equals(String string) {
        if (string == this.stringVal) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(String string, Integer integer) {
        if ((string == this.stringVal) && (integer == this.intVal)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(String string, Integer integer, List list) {
        if ((string == this.stringVal) && (integer == this.intVal) && (list == this.list)) {
            return true;
        } else {
            return false;
        }
    }


    public String toString(String string) {
        return "StringVal=" + string;
    }

    public String toString(String string, Integer integer) {
        return "StringVal=" + string + "and IntVal=" + integer;
    }

    public String toString(String string, Integer integer, List list) {
        return "StringVal=" + string + " and IntVal=" + integer + " and list = " + list;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 11);
        list.add(1, 12);

        LearnObj object1 = new LearnObj("Test");
        LearnObj object2 = new LearnObj("Test", 123);
        LearnObj object3 = new LearnObj("Test", 123);
        LearnObj object4 = new LearnObj("Test", 123, list);

        //print all attributes
        System.out.println(object3.toString(object3.getString(), object3.getIntVal(), object3.getList()));

        //compare 2
        System.out.println(object2.equals(object3.getString(), object3.getIntVal()));

        //compare 1
        System.out.println(object2.equals(object3.getString()));


    }

}
