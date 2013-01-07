package ru.atc.services.certparser.config;

/**
 * Created with IntelliJ IDEA.
 * User: Евгений
 * Date: 04.01.13
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
public class Property implements Comparable {
    String name;
    String patternInCert;
    String patternInScript;

    //фуфло
    String sectionInCert;

    public Property(String name, String patternInScript, String patternInCert) {
        this.name = name;
        this.patternInCert = patternInCert;
        this.patternInScript = patternInScript;
    }
    Property(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getPatternInCert() {
        return patternInCert;
    }
    public String getPatternInScript() {
        return patternInScript;
    }
    public String getSectionInCert() {
        return sectionInCert;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(!(o instanceof Property)) {
            return false;
        }
        if( ((Property)o).getName().equals(this.name))
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    //ерунда, но вдруг пригодится
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {

        return this.name.compareTo(o.toString());//todo to think
    }
}
