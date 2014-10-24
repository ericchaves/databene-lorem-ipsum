package org.databene.domain.LoremIpsum;

import net._01001111.text.LoremIpsum;
import org.databene.benerator.util.ThreadSafeNonNullGenerator;

/**
 *
 * @author eric.chaves
 */
public class WordsGenerator extends ThreadSafeNonNullGenerator<String> {
    
    
    private LoremIpsum loremIpsum = new LoremIpsum();
    protected int words = 50;
    
    public Class<String> getGeneratedType() {
        return String.class;
    }

    public WordsGenerator() {
        this.words = 50;
    }

    public WordsGenerator(int words) {
        this.words = words;
    }

    
    
    @Override
    public String generate() {
        return loremIpsum.words( this.words );
    }
    
       
}