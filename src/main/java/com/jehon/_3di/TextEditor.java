package com.jehon._3di;

/**
 * @author jehon
 */
public class TextEditor {

    private SpellChecker spellChecker;

//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
//    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
