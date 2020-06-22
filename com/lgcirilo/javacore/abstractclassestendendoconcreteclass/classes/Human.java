package com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes;

import com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes.Hair;
import com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes.Language;

public class Human extends MissingLink {
    private Language language; 

    public Human() { }

    public Human(String name, int uniqueToMissingLink, Language language) {
        super(name, uniqueToMissingLink);
        this.language = language;
    }

    public Language getLanguage() {
        return this.language;
    } 

    @Override
    public String toString() {
        return "Human{language=" + this.language +
               ", name=" + this.getName() +
               '}';
    }
}

