package com.jehon._4autowire;

/**
 * @author jehon
 */
public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
