package com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes;

// uma classe abstrata pode estender uma classe concreta
public abstract class MissingLink extends Ape {
    private int uniqueToMissingLink;

    public MissingLink() { }
    
    public MissingLink(String name, int uniqueToMissingLink) {
        super(name);
        this.uniqueToMissingLink = uniqueToMissingLink;
    }

    public void setUniqueToMissingLink(int uniqueToMissingLink) {
        this.uniqueToMissingLink = uniqueToMissingLink;
    }

    public int getUniqueToMissingLink(int uniqueToMissingLink) {
        return uniqueToMissingLink;
    }
    
    @Override
    public String toString() {
        return "MissingLink{uniqueToMissingLink=" + this.uniqueToMissingLink + '}';
    }
}

